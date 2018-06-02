package com.entity;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@javax.jws.WebService(targetNamespace = "http://entity.com/", serviceName = "WebService", portName = "WebPort")
public class WebDelegate {

	com.entity.Web web = new com.entity.Web();

	public String sayHello(String message) {
		return web.sayHello(message);
	}

	public void main(String[] args) {
		web.main(args);
	}

}