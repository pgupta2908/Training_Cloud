package com.training.service;

import com.training.model.Supplier;

/**
 * @author Pratyush Gupta
 *
 */
public interface ISupplierService {

	/**
	 * @param supplierId
	 * @param supplierName
	 * @param supplierAddress
	 * @param quantityOrder
	 * @param orderId
	 * @param amount
	 * @return
	 */
	public Supplier addSupplier(int supplierId, String supplierName, String supplierAddress, int quantityOrder,
			int orderId, float amount);

	/**
	 * @param supplierId
	 */
	public void removeSupplier(int supplierId);

	/**
	 * @param supplierId
	 * @return
	 */
	public Supplier updateSupplier(int supplierId);

}
