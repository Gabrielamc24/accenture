package com.example.accenture.models;


public class Client {

	private int identity;
	private String address;
		
	public Client() {
		super();
	}

	public Client(int identity, String address) {
		super();
		this.identity = identity;
		this.address = address;
	}

	
	public int getIdentity() {
		return identity;
	}
	public void setIdentity(int identity) {
		this.identity = identity;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
