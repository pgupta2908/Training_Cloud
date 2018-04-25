package com.bankingApp;

import java.util.List;

/**
 * @author Pratyush Gupta
 *
 */
public class Customer {

	String firstname;
	String surname;
	Contact contobj;
	List<Account> accunlist;

	/**
	 * @param fName
	 * @param sname
	 * @param cobj
	 * @param alist
	 */
	public Customer(String firstname, String surname, Contact contobj, List<Account> accunlist)

	{
		this.firstname = firstname;
		this.surname = surname;
		this.contobj = contobj;
		this.accunlist = accunlist;

	}

	@Override
	public String toString() {
		return "Customer [firstname=" + firstname + ", surname=" + surname + ", contobj=" + contobj + ", accunlist="
				+ accunlist + "]";
	}

	/**
	 * @return
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @return
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @return
	 */
	public Contact getContobj() {
		return contobj;
	}

	/**
	 * @return
	 */
	public List<Account> getAccunlist() {
		return accunlist;
	}

}
