package com.cg.service;

import java.util.List;

import com.cg.entity.Customer;
import com.cg.entity.Goods;
import com.cg.entity.Retailer;
import com.cg.entity.Supplier;

/**
 * @author trainee
 *
 */
public interface RetailerService {

	/**
	 * @param retailer
	 * @return
	 */
	public Retailer addRetailer(Retailer retailer);

	/**
	 * @param goodsId
	 * @return
	 */
	public List<Goods> retrieveGoods();

	/**
	 * @param customerId
	 * @return
	 */
	public List<Customer> retrieveCustomer();

	/**
	 * @param supplierId
	 * @return
	 */
	public List<Supplier> retrieveSupplier();

}
