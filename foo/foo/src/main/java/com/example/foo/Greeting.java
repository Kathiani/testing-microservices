package com.example.foo;

public class Greeting {
	private long id = 0;
	private String content = "";
	
	
	public long getId() {
		return id;
	}


	public String getContent() {
		return content;
	}
	
	public Greeting(long id, String content) {
		this.id = id;
		this.content = content;
	}

	
	
}
