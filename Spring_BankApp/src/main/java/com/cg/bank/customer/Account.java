package com.cg.bank.customer;

/**
 * @author Pratyush Gupta
 *
 */
public class Account {

	private String savingsAccount;

	private String currentAccount;

	/**
	 * @return
	 */
	public String getSavingsAccount() {
		return savingsAccount;
	}

	/**
	 * @param savingsAccount
	 */
	public void setSavingsAccount(final String savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	/**
	 * @return
	 */
	public String getCurrentAccount() {
		return currentAccount;
	}

	/**
	 * @param currentAccount
	 */
	public void setCurrentAccount(final String currentAccount) {
		this.currentAccount = currentAccount;
	}

	/**
	 * @param savingsAccount
	 * @param currentAccount
	 */
	public Account(final String savingsAccount, final String currentAccount) {
		super();
		this.savingsAccount = savingsAccount;
		this.currentAccount = currentAccount;
	}

	public Account() {
	}

	@Override
	public String toString() {
		return "Account [savingsAccount=" + savingsAccount + ", currentAccount=" + currentAccount + "]";
	}
}
