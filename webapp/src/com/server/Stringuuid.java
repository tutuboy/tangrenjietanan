package com.server;

import java.util.UUID;

public class Stringuuid {
	public String getI(){
		UUID id=UUID.randomUUID();
		return id.toString();
	}

}
