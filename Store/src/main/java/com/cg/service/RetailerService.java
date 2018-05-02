package com.cg.service;

/**
 * @author trainee
 *
 */
public interface RetailerService {

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
	 * @param SupplierId
	 * @return
	 */
	public String retrieveSupplier(int SupplierId);
}
