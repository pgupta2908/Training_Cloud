package com.cg.service;

import com.cg.dao.SupplierDao;
import com.cg.entity.Supplier;

/**
 * @author trainee
 *
 */

public class SupplierServiceImpl implements SupplierService {

	SupplierDao supplierDao;

	/**
	 * @param supplierDao
	 */
	public void setSupplierDao(SupplierDao supplierDao) {
		this.supplierDao = supplierDao;
	}

	@Override
	public Supplier addSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return supplierDao.addSupplier(supplier);
	}

	@Override
	public Supplier updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return supplierDao.updateSupplier(supplier);
	}

	@Override
	public Supplier deleteSupplier(int supplierId) {
		// TODO Auto-generated method stub
		return supplierDao.deleteSupplier(supplierId);
	}

}
