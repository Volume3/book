package com.rabbitMQ;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

public class Send {

	private String queryName="Hello!";
	private String queryDetail;
	
	public void setQueryName(String queryName){
		this.queryName=queryName;
	}
	public String getQueryName(){
		return queryName;
	}
	
	public void setQueryDetail(String queryDetail){
		this.queryDetail = queryDetail;
	}
	public String getQueryDetail(){
		return queryDetail;
	}
	
	public void send() throws IOException, TimeoutException{
		
        try{
        	ConnectionFactory factory = new ConnectionFactory();
        	
        	factory.setUsername("admin");
            factory.setPassword("admin");
            factory.setVirtualHost("testhost");
            factory.setHost("localhost");
            
        	Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();
            channel.queueDeclare(queryName, false, false, false, null);
            String message = queryDetail;
            channel.basicPublish("", queryName, null, message.getBytes(StandardCharsets.UTF_8));
            System.out.println(" [x] Sent '" + message + "'");
            
//            channel.close();
//            connection.close();
        }
        catch(Exception e){
        	System.out.println("Something went wrong.");
        }

	}
}
