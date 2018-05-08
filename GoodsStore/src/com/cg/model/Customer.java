package com.cg.model;

/**
 * @author trainee
 *
 */
public class Customer {

	 private int customerId;
	 private String customerName;
	 private String customerAddress;
	 private String paymentMode;

	/**
	 * @return
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return
	 */
	public String getCustomerAddress() {
		return customerAddress;
	}

	/**
	 * @param customerAddress
	 */
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	/**
	 * @return
	 */
	public String getPaymentMode() {
		return paymentMode;
	}

	/**
	 * @param paymentMode
	 */
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	/**
	 * @param customerId
	 * @param customerName
	 * @param customerAddress
	 * @param paymentMode
	 */
	public Customer(int customerId, String customerName, String customerAddress, String paymentMode) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.paymentMode = paymentMode;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", paymentMode=" + paymentMode + "]";
	}

}
