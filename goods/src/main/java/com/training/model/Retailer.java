package com.training.model;

public class Retailer {

	private String retailerName;
	private String retailerAddress;

	/**
	 * @return
	 */
	public String getRetailerName() {
		return retailerName;
	}

	/**
	 * @param retailerName
	 */
	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}

	/**
	 * @return
	 */
	public String getRetailerAddress() {
		return retailerAddress;
	}

	/**
	 * @param retailerAddress
	 */
	public void setRetailerAddress(String retailerAddress) {
		this.retailerAddress = retailerAddress;
	}

	@Override
	public String toString() {
		return "Retailer [retailerName=" + retailerName + ", retailerAddress=" + retailerAddress + "]";
	}

	public Retailer() {
		super();
	}

	/**
	 * @param retailerName
	 * @param retailerAddress
	 */
	public Retailer(String retailerName, String retailerAddress) {
		super();
		this.retailerName = retailerName;
		this.retailerAddress = retailerAddress;
	}

}
