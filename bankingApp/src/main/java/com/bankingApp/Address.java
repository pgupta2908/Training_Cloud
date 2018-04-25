package com.bankingApp;

/*
 * @Pratyush Gupta
 * 
 */
public class Address {
	/*
	 * Creating Address class for initializing address
	 * 
	 */
	private String street;
	private String houseNumber;
	private String zopCode;
	private String city;

	/**
	 * @param street
	 * @param houseNumber
	 * @param zopCode
	 * @param city
	 */
	public Address(String street, String houseNumber, String zopCode, String city) {
		this.street = street;
		this.houseNumber = houseNumber;
		this.zopCode = zopCode;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", houseNumber=" + houseNumber + ", zopCode=" + zopCode + ", city=" + city
				+ "]";
	}

	/**
	 * @return
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @return
	 */
	public String getHouseNumber() {
		return houseNumber;
	}

	/**
	 * @return
	 */
	public String getZopCode() {
		return zopCode;
	}

	/**
	 * @return
	 */
	public String getCity() {
		return city;
	}

}
