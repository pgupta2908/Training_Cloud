package com.bankingApp;

/**
 * @author Pratyush Gupta
 *
 */
public class Contact {

	private Integer phoneNumber;
	private Integer mobileNumber;
	private String email;
	Address addr;

	/**
	 * @param phoneNumber
	 * @param mobileNumber
	 * @param email
	 * @param addr
	 */
	public Contact(Integer phoneNumber, Integer mobileNumber, String email, Address addr) {
		this.phoneNumber = phoneNumber;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.addr = addr;

	}

	@Override
	public String toString() {
		return "Contact [phoneNumber=" + phoneNumber + ", mobileNumber=" + mobileNumber + ", email=" + email + ", addr="
				+ addr + "]";
	}

	/**
	 * @return
	 */
	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @return
	 */
	public Integer getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param obj
	 * @return
	 */
	public static boolean addContact(Object obj) {

		if (obj == null) {
			return false;
		} else {
			return true;
		}
	}

}
