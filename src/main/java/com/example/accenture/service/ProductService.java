package com.example.accenture.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.accenture.models.Product;

@Service
public class ProductService  {
	
	private List<Product> lstProduct;

	public ProductService() {
		super();
		
		this.lstProduct = new ArrayList<>();
		
		lstProduct.add(new Product(new Long(1), "Arroz", 5900));
		lstProduct.add(new Product(new Long(2), "Shampoo", 15900));
		lstProduct.add(new Product(new Long(3), "Limpido", 21900));
		lstProduct.add(new Product(new Long(4), "Celular", 500000));
		lstProduct.add(new Product(new Long(5), "Cereal", 11600));
		lstProduct.add(new Product(new Long(6), "Leche", 19900));
		lstProduct.add(new Product(new Long(7), "Huevos", 13000));
		lstProduct.add(new Product(new Long(8), "Concentrado Bulto", 50100));
		lstProduct.add(new Product(new Long(9), "Desodorante", 7800));
		lstProduct.add(new Product(new Long(10), "Crema dental", 10000));
		
	}

	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return lstProduct;
	}
	
}

