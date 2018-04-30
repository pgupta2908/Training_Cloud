package com.training.model;

public class Supplier {

	private int supplierId;
	private String supplierName;
	private String supplierAddress;
	private int quantityOrder;
	private int orderId;
	private float amount;

	/**
	 * @return
	 */
	public int getSupplierId() {
		return supplierId;
	}

	/**
	 * @param supplierId
	 */
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	/**
	 * @return
	 */
	public String getSupplierName() {
		return supplierName;
	}

	/**
	 * @param supplierName
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	/**
	 * @return
	 */
	public String getSupplierAddress() {
		return supplierAddress;
	}

	/**
	 * @param supplierAddress
	 */
	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	/**
	 * @return
	 */
	public int getQuantityOrder() {
		return quantityOrder;
	}

	/**
	 * @param quantityOrder
	 */
	public void setQuantityOrder(int quantityOrder) {
		this.quantityOrder = quantityOrder;
	}

	/**
	 * @return
	 */
	public int getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 */
	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName=" + supplierName + ", supplierAddress="
				+ supplierAddress + ", quantityOrder=" + quantityOrder + ", orderId=" + orderId + ", amount=" + amount
				+ "]";
	}

	public Supplier() {
		super();
	}

	/**
	 * @param supplierId
	 * @param supplierName
	 * @param supplierAddress
	 * @param quantityOrder
	 * @param orderId
	 * @param amount
	 */
	public Supplier(int supplierId, String supplierName, String supplierAddress, int quantityOrder, int orderId,
			float amount) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.supplierAddress = supplierAddress;
		this.quantityOrder = quantityOrder;
		this.orderId = orderId;
		this.amount = amount;
	}

}
