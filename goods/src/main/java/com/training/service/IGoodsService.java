package com.training.service;

import java.util.List;

import com.training.model.Goods;

/**
 * @author Pratyush Gupta
 *
 */
public interface IGoodsService {

	/**
	 * @param goodsId
	 * @param goodsName
	 * @param goodsQuality
	 * @param goodsPrice
	 * @return
	 */
	public Goods addGoods(int goodsId, String goodsName, String goodsQuality, float goodsPrice);

	/**
	 * @param goodsId
	 * @return
	 */
	public void removeGoods(int goodsId);

	/**
	 * @param goodsId
	 * @return
	 */
	public List<Goods> orderGoods(int goodsId);

	/**
	 * @param goodsId
	 * @return
	 */
	public Goods updateGoods(int goodsId);

}
