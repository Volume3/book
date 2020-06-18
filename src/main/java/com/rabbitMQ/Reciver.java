package com.rabbitMQ;

public class Reciver {
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
//		System.out.println("aaa '" + queryDetail + "'");
		return queryDetail;
	}
}
