package com.training.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import com.training.model.Customer;
import com.training.model.Goods;
import com.training.model.Supplier;

public class DaoImpl implements IDao {

	Logger log = Logger.getLogger("DaoImpl.class");

	Map<Integer, Goods> goodsMap = new HashMap<>();
	Map<Integer, Supplier> supplierMap = new HashMap<>();
	Map<Integer, Customer> customerMap = new HashMap<>();

	public Goods addGoods(Goods goods) {
		goodsMap.put(goods.getGoodsId(), goods);
		return goods;
	}

	public void removeGoods(int goodsId) {
		if (goodsMap.containsKey(goodsId)) {
			goodsMap.remove(goodsId);
		}
	}

	public Map<Integer, Goods> orderGoods(int goodsId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Goods updateGoods(int goodsId, String goodsName, float goodsPrice, int goodsQuantity) {
		if (goodsMap.containsKey(goodsId)) {

			Goods goods = goodsMap.get(goodsId);

			goods.setGoodsName(goodsName);
			goods.setGoodsPrice(goodsPrice);
			goods.setGoodsQuantity(goodsQuantity);
			goodsMap.put(goodsId, goods);

		}

		return null;
	}

	public Supplier addSupplier(Supplier supplier) {
		supplierMap.put(supplier.getSupplierId(), supplier);
		return supplier;
	}

	public void removeSupplier(int supplierId) {
		if (supplierMap.containsKey(supplierId)) {
			supplierMap.remove(supplierId);
		}
	}

	public Supplier updateSupplier(int supplierId, String supplierName, String supplierAddress, int quantityOrder,
			int orderId, float amount) {
		if (supplierMap.containsKey(supplierId)) {
			Supplier supplier = supplierMap.get(supplierId);

			supplier.setSupplierName(supplierName);
			supplier.setSupplierAddress(supplierAddress);
			supplier.setQuantityOrder(quantityOrder);
			supplier.setOrderId(orderId);
			supplier.setAmount(amount);

			supplierMap.put(supplierId, supplier);
		}

		return null;
	}

	public Customer addCustomer(Customer customer) {
		customerMap.put(customer.getCustomerId(), customer);
		return customer;
	}

	public void removeCustomer(int customerId) {
		if (customerMap.containsKey(customerId)) {
			customerMap.remove(customerId);
		}
	}

	public Customer updateCustomer(int customerId, String customerName, String customerAddress, String paymentMode) {
		if (customerMap.containsKey(customerId)) {
			Customer customer = customerMap.get(customerId);

			customer.setCustomerName(customerName);
			customer.setCustomerAddress(customerAddress);
			customer.setPaymentMode(paymentMode);

			customerMap.put(customerId, customer);
		}

		return null;
	}

	public Map<Integer, Goods> viewGoods() {
		/*
		 * Set<E> keys = goodsMap.keySet();
		 * 
		 * for(Iterator<Goods> i = keys.iterator(); i.hasNext();) { String key =
		 * (Goods)i.next(); Goods goods = goodsMap.get(key); }
		 * 
		 * for (Goods goods : goodsMap) { System.out.println(goods); }
		 */
		System.out.println(goodsMap);
		return goodsMap;
	}

	public Map<Integer, Customer> viewCustomer() {
		// TODO Auto-generated method stub
		System.out.println(customerMap);
		return customerMap;
	}

	public Map<Integer, Supplier> viewSupplier() {
		// TODO Auto-generated method stub
		return supplierMap;
	}

}
