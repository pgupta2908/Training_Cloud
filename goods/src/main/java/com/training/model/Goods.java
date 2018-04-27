package com.training.model;

public class Goods {

	private int goodsId;
	private String goodsName;
	private int goodsQuantity;
	private float goodsPrice;

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
	public float getGoodsPrice() {
		return goodsPrice;
	}

	/**
	 * @param goodsPrice
	 */
	public void setGoodsPrice(float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	@Override
	public String toString() {
		return "Goods [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsQuantity=" + goodsQuantity
				+ ", goodsPrice=" + goodsPrice + "]";
	}

	public Goods() {
		super();
	}

	/**
	 * @param goodsId
	 * @param goodsName
	 * @param goodsQuantity
	 * @param goodsPrice
	 */
	public Goods(int goodsId, String goodsName, int goodsQuantity, float goodsPrice) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsQuantity = goodsQuantity;
		this.goodsPrice = goodsPrice;
	}

}
