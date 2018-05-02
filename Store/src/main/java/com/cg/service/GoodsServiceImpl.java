package com.cg.service;

import com.cg.dao.GoodsDao;
import com.cg.entity.Goods;

/**
 * @author trainee
 *
 */

public class GoodsServiceImpl implements GoodsService {

	GoodsDao goodsDao;

	/**
	 * @param goodsDao
	 */
	public void setGoodsDao(GoodsDao goodsDao) {
		this.goodsDao = goodsDao;
	}

	/**
	 * @param goodsDao
	 */
	public GoodsServiceImpl(GoodsDao goodsDao) {
		super();
		this.goodsDao = goodsDao;
	}

	public GoodsServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Goods addGoods(Goods goods) {
		// TODO Auto-generated method stub
		return goodsDao.addGoods(goods);
	}

	@Override
	public Goods updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		return goodsDao.updateGoods(goods);
	}

	@Override
	public Goods deleteGoods(int goodsId) {
		// TODO Auto-generated method stub
		return goodsDao.deleteGoods(goodsId);
	}

	@Override
	public Goods orderGoods(Goods goods) {
		// TODO Auto-generated method stub
		return goodsDao.orderGoods(goods);
	}

}
