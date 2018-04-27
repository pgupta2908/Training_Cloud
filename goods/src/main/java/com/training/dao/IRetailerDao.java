package com.training.dao;

import java.util.List;

import com.training.model.Customer;
import com.training.model.Goods;
import com.training.model.Supplier;

public interface IRetailerDao {
	/**
	 * @return
	 */
	public List<Goods> viewGoods();

	/**
	 * @return
	 */
	public List<Customer> viewCustomer();

	/**
	 * @return
	 */
	public List<Supplier> viewSupplier();

}
