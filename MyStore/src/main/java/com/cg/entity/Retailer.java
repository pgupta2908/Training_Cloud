package com.cg.entity;

/**
 * @author trainee
 *
 */
public class Retailer {
	private int retailerId;
	private String retailerName;
	private String retailerAddress;

	/**
	 * @return
	 */
	public int getRetailerId() {
		return retailerId;
	}

	/**
	 * @param retailerId
	 */
	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}

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

	public Retailer() {
		super();
	}

	/**
	 * @param retailerId
	 * @param retailerName
	 * @param retailerAddress
	 */
	public Retailer(int retailerId, String retailerName, String retailerAddress) {
		super();
		this.retailerId = retailerId;
		this.retailerName = retailerName;
		this.retailerAddress = retailerAddress;
	}

	@Override
	public String toString() {
		return "Retailer [retailerId=" + retailerId + ", retailerName=" + retailerName + ", retailerAddress="
				+ retailerAddress + "]";
	}

}
