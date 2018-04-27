package com.cg.bank.customer;

/**
 * @author Pratyush Gupta
 * 
 */
public class Address {

	private String street;
	private String houseNumber;
	private String zipCode;
	private String city;

	/**
	 * @return
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street
	 */
	public void setStreet(final String street) {
		this.street = street;
	}

	/**
	 * @return
	 */
	public String getHouseNumber() {
		return houseNumber;
	}

	/**
	 * @param houseNumber
	 */
	public void setHouseNumber(final String houseNumber) {
		this.houseNumber = houseNumber;
	}

	/**
	 * @return
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode
	 */
	public void setZipCode(final String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 */
	public void setCity(final String city) {
		this.city = city;
	}

	/**
	 * @param street
	 * @param houseNumber
	 * @param zipCode
	 * @param city
	 */
	public Address(final String street, final String houseNumber, final String zipCode, final String city) {
		super();
		this.street = street;
		this.houseNumber = houseNumber;
		this.zipCode = zipCode;
		this.city = city;
	}

	public Address() {
	}
}
