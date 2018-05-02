package com.cg.dao;

import com.cg.entity.Retailer;

/**
 * @author trainee
 *
 */
public interface RetailerDao {

	/**
	 * @param retailer
	 * @return
	 */
	public Retailer addRetailer(Retailer retailer);

	/**
	 * @param goodsId
	 * @return
	 */
	public String retrieveGoods(int goodsId);

	/**
	 * @param customerId
	 * @return
	 */
	public String retrieveCustomer(int customerId);

	/**
	 * @param supplierId
	 * @return
	 */
	public String retrieveSupplier(int supplierId);

}
