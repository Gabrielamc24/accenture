package com.example.accenture.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.accenture.controller.models.BillModelRest;
import com.example.accenture.models.Bill;
import com.example.accenture.service.BillService;



@RestController
@RequestMapping("/bill")
public class BillController {
	
	@Autowired
	private BillService billService;
	
	
	@GetMapping("all")
	public ResponseEntity<?> getBill()
	{
		return ResponseEntity.ok(billService.findAll());
	}
	
	@PostMapping(value = "create")
	public ResponseEntity<Bill> saveBill(@RequestBody BillModelRest model ){
		try {
			Bill billSaved = billService.saveProduct(model);
			return ResponseEntity.ok(billSaved);
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}
	
	@PutMapping(value = "update/{id}")
	public ResponseEntity<?> updateBill(@RequestBody BillModelRest model, @PathVariable(name = "id") Long idBill) {
		try {
			Bill bill = billService.update(idBill, model);
			return ResponseEntity.ok(bill);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}	
	}
	
	@DeleteMapping(value = "delete/{id}")
	public ResponseEntity<?> deleteBill(@PathVariable(name = "id") Long idBill) {
		try {
			Bill bill = billService.delete(idBill);
			return ResponseEntity.ok(bill);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}	
	}
	
	
}
