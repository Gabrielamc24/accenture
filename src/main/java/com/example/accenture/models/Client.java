package com.example.accenture.models;


public class Client {

	private Long id;
	private int identity;
	private String name;
	private String address;
		
	public Client() {
		super();
	}
	
	public Client(Long id, int identity, String name, String address) {
		super();
		this.id = id;
		this.identity = identity;
		this.name = name;
		this.address = address;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getIdentity() {
		return identity;
	}
	public void setIdentity(int identity) {
		this.identity = identity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
