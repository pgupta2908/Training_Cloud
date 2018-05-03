/*package com.cg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.controller.applicationConfig;
import com.cg.entity.Supplier;
import com.cg.service.SupplierService;
import com.cg.service.SupplierServiceImpl;

public class SupplierTest {

	ApplicationContext context = new AnnotationConfigApplicationContext(applicationConfig.class);
	
	SupplierService supplierService = context.getBean("supplierService", SupplierServiceImpl.class);
	
	@Test
	public void addSupplierTest() {
		Supplier supplier = new Supplier(1, "mohan", "a 603", 21, 1, 890.95);
		Supplier newSupplier = supplierService.addSupplier(supplier);
		assertEquals(supplier, newSupplier);
	}

	@Test
	public void deleteSupplierTest() {
		Supplier supplier = new Supplier(1, "mohan", "a 603", 21, 1, 890.95);
		supplierService.addSupplier(supplier);
		String value = supplierService.deleteSupplier(1);

		assertEquals(null, value);
	}

	@Test
	public void updateSupplierTest() {
		Supplier supplier = new Supplier(1, "mohan", "a 603", 21, 1, 890.95);
		supplier.setAmount(960.50);
		Supplier updatedSupplier = supplier;
		Supplier serviceSupplier = supplierService.updateSupplier(supplier);

		assertEquals(updatedSupplier, serviceSupplier);
	}

}*/