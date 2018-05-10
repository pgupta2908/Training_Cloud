package com.training.service;

import java.util.List;

import com.training.model.Supplier;

/*
 * supplier service interface
 */
public interface ISupplierService {

	public Supplier addSupplier(Supplier supplier);

	public List<Supplier> updateSupplier(int supplierId);

	public List<Supplier> removeSupplier(int supplierId);

}