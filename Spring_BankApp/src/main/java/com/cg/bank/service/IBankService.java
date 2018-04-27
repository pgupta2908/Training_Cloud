package com.cg.bank.service;

import java.util.Date;

import com.cg.bank.customer.CustomerDetails;

/**
 * @author Pratyush Gupta
 *
 */
public interface IBankService {

	/**
	 * @param customer
	 */
	void add(CustomerDetails customer);

	/**
	 * @param customer_id
	 * @return
	 */
	int transact(String customer_id);

	/**
	 * @param user_id
	 * @param benificiary_id
	 * @param amount
	 * @return
	 */
	int transaction(String user_id, String benificiary_id, double amount);

	/**
	 * @param user_id
	 * @param benificiary_id
	 * @return
	 */
	/**
	 * @param user_id
	 * @param benificiary_id
	 * @return
	 */
	int calcInterest(String user_id, String benificiary_id);

	/**
	 * @param user_id
	 * @param remarks
	 * @param date
	 */
	public void statements(String user_id, String remarks, Date date);

	/**
	 * @param customer_ide
	 */
	public void transctsumm(String customer_ide);

	/**
	 * @param customer_update
	 * @param newmobile
	 */
	public void update(String customer_update, String newmobile);
}
