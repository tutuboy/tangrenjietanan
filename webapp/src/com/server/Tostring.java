package com.server;

public class Tostring {
	String st="";
	public String toS(String[] s){
		for (String str : s) {
			st=st+str+",";
		}

		return st;

	}

}
