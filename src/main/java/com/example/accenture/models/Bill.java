package com.example.accenture.models;

import java.util.Date;
import java.util.List;

public class Bill {
	
	private Long id;
	private List<Product> productos;
	private Client id_client;
	private int quantity;
	private Date dateBuy;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Client getId_client() {
		return id_client;
	}
	public void setId_client(Client id_client) {
		this.id_client = id_client;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public List<Product> getProductos() {
		return productos;
	}
	public void setProductos(List<Product> productos) {
		this.productos = productos;
	}
	public Date getDateBuy() {
		return dateBuy;
	}
	public void setDateBuy(Date dateBuy) {
		this.dateBuy = dateBuy;
	}
	
	
	
	

}
