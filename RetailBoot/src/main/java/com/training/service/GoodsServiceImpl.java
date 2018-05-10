package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.model.Goods;
import com.training.repository.IGoodsRepository;

@Service
public class GoodsServiceImpl implements IGoodsService {

	@Autowired
	IGoodsRepository goodsRepo;
	
	@Override
	public Goods addGoods(Goods goods) {
		// TODO Auto-generated method stub
		return goodsRepo.save(goods);
	}

	@Override
	public List<Goods> removeGoods(int goodsId) {
		// TODO Auto-generated method stub
		return goodsRepo.deleteById(goodsId);
	}

	@Override
	public List<Goods> updategoods(int goodsId, float price) {
		// TODO Auto-generated method stub
		return goodsRepo.findAll();
	}

}
