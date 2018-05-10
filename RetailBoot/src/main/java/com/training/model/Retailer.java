package com.training.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author trainee
 *
 */
@Entity
@Table(name="retailer")
public class Retailer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "retailerId")
	private int retailerId;

	@Column(name = "retailerName")
	private String retailerName;

	@Column(name = "retailerAddress")
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
