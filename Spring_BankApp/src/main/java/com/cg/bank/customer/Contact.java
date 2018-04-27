package com.cg.bank.customer;

/**
 * @author Pratyush Gupta
 *
 */
public class Contact {

	private String phoneNumber;
	private String mobileNumber;
	private String email;

	/**
	 * @return
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber
	 */
	public void setPhoneNumber(final String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber
	 */
	public void setMobileNumber(final String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 */
	public void setEmail(final String email) {
		this.email = email;
	}

	/**
	 * @param phoneNumber
	 * @param mobileNumber
	 * @param email
	 */
	public Contact(final String phoneNumber, final String mobileNumber, final String email) {
		super();
		this.phoneNumber = phoneNumber;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}

	public Contact() {
		// TODO Auto-generated constructor stub
	}

}
