package com.training.service;

import java.util.Map;

import com.training.dao.IDao;
import com.training.model.Customer;
import com.training.model.Goods;
import com.training.model.Supplier;

public class ServiceImpl implements IService {

	private IDao dao;

	public void setDao(IDao dao) {
		this.dao = dao;
	}

	public Goods addGoods(Goods goods) {
		return dao.addGoods(goods);
	}

	public void removeGoods(int goodsId) {
		dao.removeGoods(goodsId);
	}

	public Map<Integer, Goods> orderGoods(int goodsId) {
		// TODO Auto-generated method stub
		return dao.orderGoods(goodsId);
	}

	public Goods updateGoods(int goodsId, String goodsName, float goodsPrice, int goodsQuantity) {
		return dao.updateGoods(goodsId, goodsName, goodsPrice, goodsQuantity);
	}

	public Supplier addSupplier(Supplier supplier) {
		return dao.addSupplier(supplier);
	}

	public void removeSupplier(int supplierId) {
		dao.removeSupplier(supplierId);
	}

	public Supplier updateSupplier(int supplierId, String supplierName, String supplierAddress, int quantityOrder,
			int orderId, float amount) {
		return dao.updateSupplier(supplierId, supplierName, supplierAddress, quantityOrder, orderId, amount);
	}

	public Customer addCustomer(Customer customer) {
		return dao.addCustomer(customer);
	}

	public void removeCustomer(int customerId) {
		dao.removeCustomer(customerId);
	}

	public Customer updateCustomer(int customerId, String customerName, String customerAddress, String paymentMode) {
		return dao.updateCustomer(customerId, customerName, customerAddress, paymentMode);
	}

	public Map<Integer, Goods> viewGoods() {
		return dao.viewGoods();
	}

	public Map<Integer, Customer> viewCustomer() {
		return dao.viewCustomer();
	}

	public Map<Integer, Supplier> viewSupplier() {
		return dao.viewSupplier();
	}

}
