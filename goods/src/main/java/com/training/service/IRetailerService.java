package com.training.service;

import java.util.List;

import com.training.model.Customer;
import com.training.model.Goods;
import com.training.model.Supplier;

/**
 * @author Pratyush Gupta
 *
 */
public interface IRetailerService {

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
