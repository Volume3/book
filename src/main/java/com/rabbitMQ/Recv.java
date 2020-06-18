package com.rabbitMQ;

import java.io.IOException;
import java.util.concurrent.TimeoutException;
import java.util.*;

import books.User;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.ConsumerCancelledException;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.DeliverCallback;
import com.rabbitmq.client.QueueingConsumer;
import com.rabbitmq.client.Envelope;
import com.rabbitmq.client.AMQP;

import com.rabbitmq.client.ShutdownSignalException;

public class Recv {
//	private String queryName="Hello!";
//	private String queryDetail;
//	
//	public void setQueryName(String queryName){
//		this.queryName=queryName;
//	}
//	public String getQueryName(){
//		return queryName;
//	}
//	
//	public void setQueryDetail(String queryDetail){
//		this.queryDetail = queryDetail;
//	}
//	public String getQueryDetail(){
//		System.out.println("aaa '" + queryDetail + "'");
//		return queryDetail;
//	}
	
	public Reciver recv() throws IOException, TimeoutException{
		ConnectionFactory factory = new ConnectionFactory();

		factory.setUsername("admin");
        factory.setPassword("admin");
        factory.setVirtualHost("testhost");
        factory.setHost("localhost");
        
        //创建一个新的连接
        Connection connection = factory.newConnection();
        //创建一个通道
        Channel channel = connection.createChannel();
        //声明要关注的队列
        final Reciver reciver = new Reciver();
        String queryName = reciver.getQueryName();
        
        channel.queueDeclare(queryName, false, false, false, null);
        System.out.println("Customer Waiting Received messages");
        Consumer consumer = new DefaultConsumer(channel) {
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                
            	String message = new String(body, "UTF-8");
            	reciver.setQueryDetail(message);
//                System.out.println("Customer Received '" + message + "'");
                System.out.println("Customer Received '" + reciver.getQueryDetail() + "'");
            } 
        };
        
        //自动回复队列应答 -- RabbitMQ中的消息确认机制
        channel.basicConsume(queryName, true, consumer);
        
//        System.out.print("the"+reciver);
//        System.out.println("Customer Received '" + reciver.getQueryDetail() + "'");
        return reciver;
	}
	
}
