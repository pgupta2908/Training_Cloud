package com.cg.dao;

import com.cg.entity.Goods;

/**
 * @author trainee
 *
 */
public interface GoodsDao {

	/**
	 * @param goods
	 * @return
	 */
	public Goods addGoods(Goods goods);

	/**
	 * @param goods
	 * @return
	 */
	public Goods updateGoods(Goods goods);

	/**
	 * @param goodsId
	 * @return
	 */
	public Goods deleteGoods(int goodsId);

	/**
	 * @param goods
	 * @return
	 */
	public Goods orderGoods(Goods goods);

}
