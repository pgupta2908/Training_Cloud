package com.training.service;

import java.util.List;

import com.training.model.Customer;
import com.training.model.Goods;
import com.training.model.Supplier;

/*
 * retailer seervice logic
 */
public interface IRetailerService {

	public List<Goods> viewAllGoods();

	public List<Customer> viewAllCustomers();

	public List<Supplier> viewAllSuppliers();

}