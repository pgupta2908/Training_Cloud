package com.cg.dao;

import com.cg.entity.Supplier;

/**
 * @author trainee
 *
 */
public interface SupplierDao {

	/**
	 * @param supplier
	 * @return
	 */
	public Supplier addSupplier(Supplier supplier);

	/**
	 * @param supplier
	 * @return
	 */
	public Supplier updateSupplier(Supplier supplier);

	/**
	 * @param supplierId
	 * @return
	 */
	public Supplier deleteSupplier(int supplierId);
}
