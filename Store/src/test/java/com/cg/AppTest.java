package com.cg;

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
import com.cg.service.CustomerService;
import com.cg.service.CustomerServiceImpl;
import com.cg.service.GoodsService;
import com.cg.service.GoodsServiceImpl;
import com.cg.service.RetailerService;
import com.cg.service.RetailerServiceImpl;
import com.cg.service.SupplierService;
import com.cg.service.SupplierServiceImpl;

/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class AppTest {

	Customer customer = new Customer(1, "ritika", "delhi", "cash");
	Supplier supplier = new Supplier(101, "asd", "mumbai", 2, 111, 200.2);
	Goods goods = new Goods(121, "asd", 2, 200.2);
	Retailer retailer = new Retailer(201, "qwerty", "pune");

	@Test
	public void customerTest() {
		assertEquals(1, customer.getCustomerId());
		assertEquals("ritika", customer.getCustomerName());
		assertEquals("delhi", customer.getCustomerAddress());
		assertEquals("cash", customer.getPaymentMode());
	}

	@Test
	public void goodsTest() {
		assertEquals(121, goods.getGoodsId());
		assertEquals("asd", goods.getGoodsName());
		assertEquals(2, goods.getGoodsQuantity());
		assertEquals(200.2, goods.getGoodsPrice(), 0.1);
	}

	@Test
	public void supplierTest() {
		assertEquals(101, supplier.getSupplierId());
		assertEquals("asd", supplier.getSupplierName());
		assertEquals("mumbai", supplier.getSupplierAddress());
		assertEquals(2, supplier.getQuantityOrder());
		assertEquals(111, supplier.getOrderId());
	}

	@Test
	public void retailerTest() {
		assertEquals("qwerty", retailer.getRetailerName());
		assertEquals("pune", retailer.getRetailerAddress());
	}

	ApplicationContext context = new AnnotationConfigApplicationContext(applicationConfig.class);

	CustomerService customerService = context.getBean("customerService", CustomerServiceImpl.class);

	@Test
	public void addCustomerTest() {

		Customer customer = new Customer(101, "prat", "delhi", "cash");
		Customer value = customerService.addCustomer(customer);

		assertEquals(customer, value);
	}

	@Test
	public void deleteCustomerTest() {
		Customer customer = new Customer(101, "prat", "delhi", "cash");
		customerService.addCustomer(customer);
		String value = customerService.deleteCustomer(101);

		assertEquals(null, value);
	}

	@Test
	public void updateCustomerTest() {
		Customer customer = new Customer(101, "prat", "delhi", "cash");
		customer.setPaymentMode("card");
		Customer updatedCustomer = customer;
		Customer serviceCustomer = customerService.updateCustomer(updatedCustomer);

		assertEquals(updatedCustomer, serviceCustomer);
	}

	GoodsService goodsService = context.getBean("goodsService", GoodsServiceImpl.class);

	@Test
	public void addGoodsTest() {
		Goods goods = new Goods(1, "soap", 43, 32.3);
		Goods newGoods = goodsService.addGoods(goods);
		assertEquals(goods, newGoods);
	}

	@Test
	public void deleteGoodsTest() {
		Goods goods = new Goods(1, "soap", 43, 32.3);
		goodsService.addGoods(goods);
		String value = goodsService.deleteGoods(1);

		assertEquals(null, value);
	}

	@Test
	public void updateGoodsTest() {
		Goods goods = new Goods(1, "soap", 43, 32.3);
		goods.setGoodsName("shampoo");
		Goods updatedGoods = goods;

		Goods serviceGoods = goodsService.updateGoods(updatedGoods);

		assertEquals(updatedGoods, serviceGoods);
	}

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
		assertTrue(value.contains(value.get(0)));
	}

	@Test
	public void retrieveSupplierTest() {
		List<Supplier> value = retailerService.retrieveSupplier();
		assertTrue(value.contains(value.get(0)));
	}

}
