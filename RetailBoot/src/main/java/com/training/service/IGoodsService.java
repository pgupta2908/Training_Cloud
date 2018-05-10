package com.training.service;

import java.util.List;

import com.training.model.Goods;

/*
 * goods service interface
 */
public interface IGoodsService {

	public Goods addGoods(Goods goods);

	public List<Goods> removeGoods(int goodsId);

	public List<Goods> updategoods(int goodsId, float price);

}