package com.example.accenture.controller.models;

import java.util.List;

import com.example.accenture.models.Client;

public class BillModelRest {
	private Client client;
	private List<Long> productos;
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<Long> getProductos() {
		return productos;
	}
	public void setProductos(List<Long> productos) {
		this.productos = productos;
	}
	
	
}
