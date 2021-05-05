package models;

import javax.persistence.Entity;

@Entity
public class Bill {
	
	private Long id;
	private Product id_product;
	private Client id_client;
	private int quantity;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Product getId_product() {
		return id_product;
	}
	public void setId_product(Product id_product) {
		this.id_product = id_product;
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
	
	

}
