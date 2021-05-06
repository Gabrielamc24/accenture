package com.example.accenture.service;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.accenture.controller.models.BillModelRest;
import com.example.accenture.models.Bill;
import com.example.accenture.models.Product;

@Service
public class BillService {

	@Autowired
	private ProductService productService;

	private List<Bill> lstBill = new ArrayList<>();

	public List<Bill> findAll() {
		return lstBill;
	}
	
	public Bill findById(Long id) {
		for (int i = 0; i < lstBill.size(); i++) {
			if(lstBill.get(i).getId().equals(id)) {
				return lstBill.get(i);
			}
		}
		return null;
	}

	public Bill saveProduct(BillModelRest model) {

		Bill bill = new Bill();
		bill.setId(System.currentTimeMillis());
		
		bill.setClient(model.getClient());
		List<Product> ps = new ArrayList<>();
		List<Product> psCurrent = productService.findAll();
		if (model.getProductos() != null) {
			double sum = 0;
			double taxP = 0;
			double dom = 0;
			for (int i = 0; i < model.getProductos().size(); i++) {
				for (int j = 0; j < psCurrent.size(); j++) {
					if(psCurrent.get(j).getId().intValue() == model.getProductos().get(i)) {
						ps.add(psCurrent.get(j));
						sum += psCurrent.get(j).getPrice();
						
						if(sum >= 70000) {
							taxP = sum * 0.19;
							bill.setTax(taxP);
						}
						else {
							bill.setTax(taxP);
						}
						
						break;
					}
				}
			}
			if(sum <= 100000 && sum >=70000)
			{
				dom = 4000;
				bill.setTotal(sum+taxP+dom);
			}
			else {
				bill.setTotal(sum+taxP+dom);
			}
			bill.setDomicile(dom);
		}
		
		bill.setProductos(ps);
		bill.setDateBuy(new Date());
		bill.setState("Activa");
		lstBill.add(bill);

		return bill;
	}
	double sumProdCurrent = 0.0;
	public Bill update(Long idBill, BillModelRest model ) {
		Bill bill = findById(idBill);
		if(bill != null) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(bill.getDateBuy());
			calendar.add(Calendar.HOUR, 5);
			calendar.getTime();
			
			Date dateC = new Date(); 
			
			if(dateC.before(calendar.getTime())){
				lstBill.remove(bill);
				
				
				bill.getProductos().stream().forEach(x->{
					sumProdCurrent += x.getPrice();
				});
				
				
				bill.setClient(model.getClient());
				List<Product> ps = new ArrayList<>();
				List<Product> psCurrent = productService.findAll();
				if (model.getProductos() != null) {
					double suma = 0;
					double taxP = 0;
					double dom = 0;
					for (int i = 0; i < model.getProductos().size(); i++) {
						for (int j = 0; j < psCurrent.size(); j++) {
							if(psCurrent.get(j).getId().intValue() == model.getProductos().get(i)) {
								ps.add(psCurrent.get(j));
								suma += psCurrent.get(j).getPrice();
								
								if(suma >= 70000) {
									taxP = suma * 0.19;
									bill.setTax(taxP);
								}
								else {
									bill.setTax(taxP);
								}
								
								break;
							}
						}
					}
					if(suma < sumProdCurrent) {
						return null;
					}
					
					
					if(suma <= 100000 && suma >=70000)
					{
						dom = 4000;
						bill.setTotal(suma+taxP+dom);
					}
					else {
						bill.setTotal(suma+taxP+dom);
					}
					bill.setDomicile(dom);
					bill.setTotal(suma);
					bill.setState("Actualizada");
					bill.setProductos(ps);
				}
				
				lstBill.add(bill);
				
				return bill;
			}
			else {
				return bill;
			}
			
		}
		return null;
	}
	

	public Bill delete(Long idBill) {

		Bill bill = findById(idBill);
		if(bill != null) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(bill.getDateBuy());
			calendar.add(Calendar.HOUR, 12);
			calendar.getTime();
			
			Date dateC = new Date(); 
			if(dateC.before(calendar.getTime())){
				lstBill.remove(bill);
			}
			else {
				for (int i = 0; i < lstBill.size(); i++) {
					double value = lstBill.get(i).getTotal();
					double total= value * 0.10;
					bill.setDomicile(0);
					bill.setTax(0);
					bill.setTotal(total);
					bill.setState("Cancelada");
					return bill;
				}
	
			}
			
		}
		return null;
	}


}
