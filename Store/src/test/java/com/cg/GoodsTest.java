/*package com.cg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.controller.applicationConfig;
import com.cg.entity.Goods;
import com.cg.service.GoodsService;
import com.cg.service.GoodsServiceImpl;

public class GoodsTest {

	ApplicationContext context = new AnnotationConfigApplicationContext(applicationConfig.class);

	GoodsService goodsService = context.getBean("goodsService", GoodsServiceImpl.class);

	@Test
	public void addGoodsTest() {
		Goods goods = new Goods(1, "soap", 43, 32.3);
		Goods newGoods = goodsService.addGoods(goods);
		assertEquals(goods, newGoods);
	}

	@Test
	public void deleteGoodsTest() {
		Goods goods = new Goods(1, "soap", 43, 32.3);
		goodsService.addGoods(goods);
		String value = goodsService.deleteGoods(1);

		assertEquals(null, value);
	}

	@Test
	public void updateGoodsTest() {
		Goods goods = new Goods(1, "soap", 43, 32.3);
		goods.setGoodsName("shampoo");
		Goods updatedGoods = goods;

		Goods serviceGoods = goodsService.updateGoods(updatedGoods);

		assertEquals(updatedGoods, serviceGoods);
	}

}*/