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

	public Contact getContact() {
		return contact;
	}

	public void setContact(final Contact contact) {
		this.contact = contact;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(final Address address) {
		this.address = address;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(final String customer_id) {
		this.customer_id = customer_id;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(final String account_type) {
		this.account_type = account_type;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(final String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(final String surname) {
		this.surname = surname;
	}

	public double getInitial_Amount() {
		return initial_Amount;
	}

	public void setInitial_Amount(final double initial_Amount) {
		this.initial_Amount = initial_Amount;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(final Account account) {
		this.account = account;
	}

	public CustomerDetails() {
	}

	public double getIntst() {
		return intst;
	}

	public void setIntst(final double intst) {
		this.intst = intst;
	}

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
