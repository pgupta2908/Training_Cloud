package com.cg.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.cg.entity.Customer;
import com.cg.entity.Goods;
import com.cg.entity.Retailer;
import com.cg.entity.Supplier;
import com.cg.service.CustomerService;
import com.cg.service.CustomerServiceImpl;
import com.cg.service.GoodsService;
import com.cg.service.GoodsServiceImpl;
import com.cg.service.RetailerService;
import com.cg.service.RetailerServiceImpl;
import com.cg.service.SupplierService;
import com.cg.service.SupplierServiceImpl;

/**
 * @author trainee
 *
 */
@Controller
public class StoreController {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * String confFile = "applicationContext.xml"; ConfigurableApplicationContext
		 * context = new ClassPathXmlApplicationContext(confFile);
		 */
		/*ApplicationContext context = new AnnotationConfigApplicationContext(applicationConfig.class);*/

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService customerService = context.getBean("customerService", CustomerServiceImpl.class);
		GoodsService goodsService = context.getBean("goodsService", GoodsServiceImpl.class);
		SupplierService supplierService = context.getBean("supplierService", SupplierServiceImpl.class);
		RetailerService retailerService = context.getBean("retailerService", RetailerServiceImpl.class);

		// insert Customer details to Customer table
		Customer customer = new Customer();
		customer.setCustomerId(1);
		customer.setCustomerName("ritika");
		customer.setCustomerAddress("mumbai");
		customer.setPaymentMode("cash");
		customerService.addCustomer(customer);
		
		customer.setCustomerId(2);
		customer.setCustomerName("aishwarya");
		customer.setCustomerAddress("ny");
		customer.setPaymentMode("card");
		customerService.addCustomer(customer);
		
		customer.setCustomerId(4);
		customer.setCustomerName("tuhin");
		customer.setCustomerAddress("sector 20");
		customer.setPaymentMode("chillar");
		customerService.addCustomer(customer);

		// delete Customer
		customer.setCustomerId(1);
		customerService.deleteCustomer(2);

		// update Customer
		customer.setCustomerId(4);
		customer.setPaymentMode("cash");

		customerService.updateCustomer(customer);

		// search by Customer Id
		String customerDetails = retailerService.retrieveCustomer(1);
		System.out.println("customerDetails" + customerDetails);

		// insert Goods details to Goods table
		Goods goods = new Goods();
		goods.setGoodsId(101);
		goods.setGoodsName("TV");
		goods.setGoodsPrice(1000);
		goods.setGoodsQuantity(1);

		goods.setGoodsId(102);
		goods.setGoodsName("Fruit");
		goods.setGoodsPrice(500);
		goods.setGoodsQuantity(10);
		goodsService.addGoods(goods);

		goods.setGoodsId(103);
		goods.setGoodsName("Snacks");
		goods.setGoodsPrice(300);
		goods.setGoodsQuantity(5);
		goodsService.addGoods(goods);

		// delete goods
		goods.setGoodsId(102);
		goodsService.deleteGoods(102);

		// update goods
		goods.setGoodsId(102);
		goods.setGoodsName("Fridge");
		goodsService.updateGoods(goods);

		// search by goods Id
		String goodsDetails = retailerService.retrieveGoods(1);
		System.out.println("goodsDetails" + goodsDetails);

		// insert Supplier details to Supplier table
		Supplier supplier = new Supplier();
		supplier.setSupplierId(111);
		supplier.setSupplierName("Ram");
		supplier.setSupplierAddress("Ranchi");
		supplier.setQuantityOrder(1);
		supplier.setOrderId(141);
		supplier.setAmount(7000);
		supplierService.addSupplier(supplier);

		supplier.setSupplierId(121);
		supplier.setSupplierName("Shyam");
		supplier.setSupplierAddress("up");
		supplier.setQuantityOrder(2);
		supplier.setOrderId(151);
		supplier.setAmount(7050);
		supplierService.addSupplier(supplier);

		// delete Supplier

		supplier.setSupplierId(121);
		supplierService.deleteSupplier(121);

		// update Supplier
		supplier.setSupplierId(121);
		supplier.setAmount(7500);
		supplierService.updateSupplier(supplier);

		// search by Supplier Id
		String supplierDetails = retailerService.retrieveSupplier(1);
		System.out.println("supplierDetails" + supplierDetails);

		// insert Retailer details to Retailer table
		Retailer retail = new Retailer();
		retail.setRetailerId(201);
		retail.setRetailerName("shruti");
		retail.setRetailerAddress("punjab");

	}

}
