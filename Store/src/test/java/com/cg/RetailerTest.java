/*package com.cg;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.controller.applicationConfig;
import com.cg.entity.Customer;
import com.cg.entity.Goods;
import com.cg.entity.Retailer;
import com.cg.entity.Supplier;
import com.cg.service.RetailerService;
import com.cg.service.RetailerServiceImpl;

public class RetailerTest {

	ApplicationContext context = new AnnotationConfigApplicationContext(applicationConfig.class);

	RetailerService retailerService = context.getBean("retailerService", RetailerServiceImpl.class);

	@Test
	public void addRetailerTest() {
		Retailer retailer = new Retailer();
		Retailer newRetailer = retailerService.addRetailer(retailer);
		assertEquals(retailer, newRetailer);
	}

	@Test
	public void retrieveCustomerTest() {
		List<Customer> value = retailerService.retrieveCustomer();
		assertTrue(value.contains(value.get(0)));
	}

	@Test
	public void retrieveGoodsTest() {
		List<Goods> value = retailerService.retrieveGoods();
		assertTrue(value.contains(value.get(1)));
	}

	@Test
	public void retrieveSupplierTest() {
		List<Supplier> value = retailerService.retrieveSupplier();
		assertTrue(value.contains(value.get(0)));
	}
	
}
*/