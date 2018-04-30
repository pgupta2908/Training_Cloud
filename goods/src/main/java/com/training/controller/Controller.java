package com.training.controller;

import java.util.Scanner;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.model.Customer;
import com.training.model.Goods;
import com.training.model.Supplier;
import com.training.service.ServiceImpl;

public class Controller {

	public static void main(String[] args) {

		Logger log = Logger.getLogger("controller.class");

		Scanner scanner = new Scanner(System.in);

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		ServiceImpl service = applicationContext.getBean("goodsService", ServiceImpl.class);

		log.info("Welcome to goods services");
		log.info("---------------------------");

		while (true) {
			log.info("1.	add goods");
			log.info("2.	remove goods");
			log.info("3.	order goods");
			log.info("4.	update goods");
			log.info("5.	add suplier");
			log.info("6.	remove supplier");
			log.info("7.	update supplier");
			log.info("8.	add customer");
			log.info("9.	remove customer");
			log.info("10.	update customer");
			log.info("11.	view goods");
			log.info("12.	view Customer");
			log.info("13.	view supplier");

			int choice = scanner.nextInt();

			switch (choice) {

			// add goods
			case 1: {
				Goods goods = new Goods();

				log.info("Enter goods id");
				int goodsId = scanner.nextInt();
				log.info("Enter goods name");
				String goodsName = scanner.next();
				log.info("Enter goods quantity");
				int goodsQuantity = scanner.nextInt();
				log.info("Enter goods price");
				float goodsPrice = scanner.nextFloat();

				goods.setGoodsId(goodsId);
				goods.setGoodsName(goodsName);
				goods.setGoodsPrice(goodsPrice);
				goods.setGoodsQuantity(goodsQuantity);

				service.addGoods(goods);
				break;
			}

			// remove goods
			case 2: {
				log.info("Enter goods id you want to remove");

				int goodsId = scanner.nextInt();
				service.removeGoods(goodsId);

				break;
			}

			// order goods
			case 3: {

				break;
			}

			// update goods
			case 4: {
				log.info("enter the goods id you want to update");

				int goodsId = scanner.nextInt();

				log.info("Enter new goods name");
				String goodsName = scanner.next();
				log.info("Enter new goods quantity");
				int goodsQuantity = scanner.nextInt();
				log.info("Enter new goods price");
				float goodsPrice = scanner.nextFloat();

				service.updateGoods(goodsId, goodsName, goodsPrice, goodsQuantity);
				break;
			}

			// add supplier
			case 5: {
				Supplier supplier = new Supplier();

				log.info("Enter supplier id");
				int supplierId = scanner.nextInt();
				log.info("Enter supplier name");
				String supplierName = scanner.next();
				log.info("Enter supplier address");
				String supplierAddress = scanner.next();
				log.info("Enter quantity of order");
				int quantityOrder = scanner.nextInt();
				log.info("Enter order id");
				int orderId = scanner.nextInt();
				log.info("Enter the total amount");
				float amount = scanner.nextFloat();

				supplier.setSupplierId(supplierId);
				supplier.setSupplierName(supplierName);
				supplier.setSupplierAddress(supplierAddress);
				supplier.setQuantityOrder(quantityOrder);
				supplier.setOrderId(orderId);
				supplier.setAmount(amount);

				service.addSupplier(supplier);
				break;
			}

			// remove supplier
			case 6: {
				int supplierId = scanner.nextInt();

				service.removeSupplier(supplierId);
				break;
			}

			// update supplier
			case 7: {
				log.info("Enter the supplier id you want to update");

				int supplierId = scanner.nextInt();

				log.info("Enter new supplier name");
				String supplierName = scanner.next();
				log.info("Enter new supplier address");
				String supplierAddress = scanner.next();
				log.info("Enter new quantity of order");
				int quantityOrder = scanner.nextInt();
				log.info("Enter new order id");
				int orderId = scanner.nextInt();
				log.info("Enter the new total amount");
				float amount = scanner.nextFloat();

				service.updateSupplier(supplierId, supplierName, supplierAddress, quantityOrder, orderId, amount);
				break;
			}

			// add customer
			case 8: {
				Customer customer = new Customer();

				log.info("Enter customer id");
				int customerId = scanner.nextInt();
				log.info("Enter customer name");
				String customerName = scanner.next();
				log.info("Enter customer address");
				String customerAddress = scanner.next();
				log.info("Enter mode of payment");
				String paymentMode = scanner.next();

				customer.setCustomerId(customerId);
				customer.setCustomerName(customerName);
				customer.setCustomerAddress(customerAddress);
				customer.setPaymentMode(paymentMode);

				service.addCustomer(customer);
				break;
			}

			// remove customer
			case 9: {
				int customerId = scanner.nextInt();
				service.removeCustomer(customerId);

				break;
			}

			// update customer
			case 10: {
				log.info("Enter the customer id you want to update");

				int customerId = scanner.nextInt();

				log.info("Enter customer name");
				String customerName = scanner.next();
				log.info("Enter customer address");
				String customerAddress = scanner.next();
				log.info("Enter mode of payment");
				String paymentMode = scanner.next();

				service.updateCustomer(customerId, customerName, customerAddress, paymentMode);
				break;
			}

			// view goods
			case 11: {
				service.viewGoods();
				break;
			}

			// view customer
			case 12: {
				service.viewCustomer();
				break;
			}

			// view supplier
			case 13: {
				service.viewSupplier();
				break;
			}

			// default choice
			default: {
				log.info("Invalid input, please try again");
				break;
			}

			}
		}

	}

}
