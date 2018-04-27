package com.training.dao;

import com.training.model.Supplier;

public interface ISupplierDao {
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
