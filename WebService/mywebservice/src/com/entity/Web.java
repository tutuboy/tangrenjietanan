package com.entity;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class Web {
	@WebMethod
	public String sayHello(String message){
		return "Hello ," + message;
	}
	
	public static void main(String[] args) {
		//create and publish an endPoint
		//HelloService hello = new HelloService();
		Endpoint endPoint = Endpoint.publish("http://localhost:8087/mywebservice", new Web());
		System.out.println("welcome");
		
	}

}

