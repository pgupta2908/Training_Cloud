package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.model.Supplier;
import com.training.repository.ISupplierRepository;

@Service
public class SupplierServiceImpl implements ISupplierService {

	@Autowired
	ISupplierRepository supplierRepo;

	@Override
	public Supplier addSupplier(Supplier supplier) {
		return supplierRepo.save(supplier);
	}

	@Override
	public List<Supplier> updateSupplier(int supplierId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Supplier> removeSupplier(int supplierId) {
		// TODO Auto-generated method stub
		return null;
	}

}