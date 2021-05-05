package com.example.accenture.controller;

import java.net.URI;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.accenture.models.Bill;
import com.example.accenture.models.Client;
import com.example.accenture.models.Product;
import com.example.accenture.service.BillService;



@RestController
@RequestMapping("/bill")
public class BillController {
	
	@Autowired
	private BillService billService;
	
	/*@PostMapping
	private ResponseEntity<Bill> saveReporte(@RequestBody Long id, List<Product> productos, Client id_client, Client address_client,int quantity, Date dateBuy){
		try {
			Bill billSaved = (Bill) billService.save(id, productos,id_client, address_client,quantity,dateBuy);
			return ResponseEntity.created(new URI("/reporte/"+id)).body(billSaved);
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}*/

}
