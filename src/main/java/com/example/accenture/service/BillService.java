package com.example.accenture.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.accenture.models.Bill;
import com.example.accenture.models.Client;
import com.example.accenture.models.Product;

@Service
public class BillService {
	
	private List<Object> lstProductBill;
	private List<Bill> lstBill;

	
	/*public List<Bill> save(Long id, List<Product> productos, Client id_client, Client address_client,int quantity, Date dateBuy) {
		
		this.lstBill = new ArrayList<>();
		lstBill.add(new Bill(new Long(id),productos,id_client,address_client,quantity,dateBuy));
		return lstBill;
	}*/
	
	public List<Bill> saveProducts(Product id, int quantity){
		
		lstProductBill.add(id);
		lstProductBill.add(quantity);
		return lstBill;
	}

}
