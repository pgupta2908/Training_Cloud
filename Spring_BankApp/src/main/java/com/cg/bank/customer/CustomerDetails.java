package com.cg.bank.customer;

import org.springframework.stereotype.Component;

/**
 * @author Pratyush Gupta
 * 
 */

@Component
public class CustomerDetails {

	private String customer_id;
	private String account_type;
	private String firstname;
	private String surname;
	private double initial_Amount;
	private Contact contact;
	private Address address;
	private double intst = 0;
	private Account account;

	/**
	 * @return
	 */
	public Contact getContact() {
		return contact;
	}

	/**
	 * @param contact
	 */
	public void setContact(final Contact contact) {
		this.contact = contact;
	}

	/**
	 * @return
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 */
	public void setAddress(final Address address) {
		this.address = address;
	}

	/**
	 * @return
	 */
	public String getCustomer_id() {
		return customer_id;
	}

	/**
	 * @param customer_id
	 */
	public void setCustomer_id(final String customer_id) {
		this.customer_id = customer_id;
	}

	/**
	 * @return
	 */
	public String getAccount_type() {
		return account_type;
	}

	/**
	 * @param account_type
	 */
	public void setAccount_type(final String account_type) {
		this.account_type = account_type;
	}

	/**
	 * @return
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname
	 */
	public void setFirstname(final String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname
	 */
	public void setSurname(final String surname) {
		this.surname = surname;
	}

	/**
	 * @return
	 */
	public double getInitial_Amount() {
		return initial_Amount;
	}

	/**
	 * @param initial_Amount
	 */
	public void setInitial_Amount(final double initial_Amount) {
		this.initial_Amount = initial_Amount;
	}

	/**
	 * @return
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * @param account
	 */
	public void setAccount(final Account account) {
		this.account = account;
	}

	/**
	 * @return
	 */
	public double getIntst() {
		return intst;
	}

	/**
	 * @param intst
	 */
	public void setIntst(final double intst) {
		this.intst = intst;
	}

	public CustomerDetails() {
	}

	/**
	 * @param customer_id
	 * @param account_type
	 * @param firstname
	 * @param surname
	 * @param initial_Amount
	 * @param contact
	 * @param address
	 * @param intst
	 * @param account
	 */
	public CustomerDetails(final String customer_id, final String account_type, final String firstname,
			final String surname, final double initial_Amount, final Contact contact, final Address address,
			final double intst, final Account account) {
		super();
		this.customer_id = customer_id;
		this.account_type = account_type;
		this.firstname = firstname;
		this.surname = surname;
		this.initial_Amount = initial_Amount;
		this.contact = contact;
		this.address = address;
		this.intst = intst;
		this.account = account;
	}

}
