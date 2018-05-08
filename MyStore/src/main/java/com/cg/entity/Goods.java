package com.cg.entity;

/**
 * @author trainee
 *
 */
public class Goods {

	private int goodsId;
	private String goodsName;
	private int goodsQuantity;
	private double goodsPrice;

	/**
	 * @return
	 */
	public int getGoodsId() {
		return goodsId;
	}

	/**
	 * @param goodsId
	 */
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	/**
	 * @return
	 */
	public String getGoodsName() {
		return goodsName;
	}

	/**
	 * @param goodsName
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	/**
	 * @return
	 */
	public int getGoodsQuantity() {
		return goodsQuantity;
	}

	/**
	 * @param goodsQuantity
	 */
	public void setGoodsQuantity(int goodsQuantity) {
		this.goodsQuantity = goodsQuantity;
	}

	/**
	 * @return
	 */
	public double getGoodsPrice() {
		return goodsPrice;
	}

	/**
	 * @param goodsPrice
	 */
	public void setGoodsPrice(double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	/**
	 * @param goodsId
	 * @param goodsName
	 * @param goodsQuantity
	 * @param goodsPrice
	 */
	public Goods(int goodsId, String goodsName, int goodsQuantity, double goodsPrice) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsQuantity = goodsQuantity;
		this.goodsPrice = goodsPrice;
	}

	public Goods() {
		super();
	}

	@Override
	public String toString() {
		return "Goods [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsQuantity=" + goodsQuantity
				+ ", goodsPrice=" + goodsPrice + "]";
	}

}
