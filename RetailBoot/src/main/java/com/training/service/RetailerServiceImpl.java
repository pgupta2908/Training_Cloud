package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.training.model.Customer;
import com.training.model.Goods;
import com.training.model.Supplier;
import com.training.repository.IRetailerRepository;

@Service
public class RetailerServiceImpl implements IRetailerService {

	@Autowired
	IRetailerRepository retailerRepo;
	
	@Override
	public List<Goods> viewAllGoods() {
		// TODO Auto-generated method stub
		return retailerRepo.findAll();
	}

	@Override
	public List<Customer> viewAllCustomers() {
		// TODO Auto-generated method stub
		return retailerRepo
	}

	@Override
	public List<Supplier> viewAllSuppliers() {
		// TODO Auto-generated method stub
		return retailerRepo.viewAllSuppliers();
	}

}