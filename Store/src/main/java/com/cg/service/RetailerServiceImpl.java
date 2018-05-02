package com.cg.service;

import com.cg.dao.RetailerDao;

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
	public String retrieveGoods(int goodsId) {
		// TODO Auto-generated method stub
		return retailerDao.retrieveGoods(goodsId);
	}

	@Override
	public String retrieveCustomer(int customerId) {
		// TODO Auto-generated method stub
		return retailerDao.retrieveCustomer(customerId);
	}

	@Override
	public String retrieveSupplier(int SupplierId) {
		// TODO Auto-generated method stub
		return retailerDao.retrieveSupplier(SupplierId);
	}

}
