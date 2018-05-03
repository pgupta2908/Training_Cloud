package com.cg.service;

import java.util.List;

import com.cg.dao.RetailerDao;
import com.cg.entity.Customer;
import com.cg.entity.Goods;
import com.cg.entity.Retailer;
import com.cg.entity.Supplier;

/**
 * @author trainee
 *
 */

public class RetailerServiceImpl implements RetailerService {

	RetailerDao retailerDao;

	/**
	 * @param retailerDao
	 */
	public void setRetailerDao(RetailerDao retailerDao) {
		this.retailerDao = retailerDao;
	}

	/**
	 * @param retailerDao
	 */
	public RetailerServiceImpl(RetailerDao retailerDao) {
		super();
		this.retailerDao = retailerDao;
	}

	public RetailerServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Retailer addRetailer(Retailer retailer) {
		// TODO Auto-generated method stub
		return retailerDao.addRetailer(retailer);
	}

	@Override
	public List<Goods> retrieveGoods() {
		// TODO Auto-generated method stub
		return retailerDao.retrieveGoods();
	}

	@Override
	public List<Customer> retrieveCustomer() {
		// TODO Auto-generated method stub
		return retailerDao.retrieveCustomer();
	}

	@Override
	public List<Supplier> retrieveSupplier() {
		// TODO Auto-generated method stub
		return retailerDao.retrieveSupplier();
	}

}
