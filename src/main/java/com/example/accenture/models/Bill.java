package com.example.accenture.models;

import java.util.Date;
import java.util.List;

public class Bill {
	
	private Long id;
	private Date dateBuy;
	private Client client;
	private List<Product> productos;
	private double domicile;
	private double tax;
	private double total;
	
	
	public Bill() {
		super();
	}
	
	
	public Bill(Long id, List<Product> productos, Client client, double total, Date dateBuy, double domicile,
			double tax) {
		super();
		this.id = id;
		this.productos = productos;
		this.client = client;
		this.total = total;
		this.dateBuy = dateBuy;
		this.domicile = domicile;
		this.tax = tax;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	

	public double getDomicile() {
		return domicile;
	}

	public void setDomicile(double domicile) {
		this.domicile = domicile;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
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
