package com.cg.bank.customer;

/**
 * @author Pratyush Gupta
 *
 */
public class Account {

	private String savingsAccount;

	private String currentAccount;

	public String getSavingsAccount() {
		return savingsAccount;
	}

	public void setSavingsAccount(final String savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	public String getCurrentAccount() {
		return currentAccount;
	}

	public void setCurrentAccount(final String currentAccount) {
		this.currentAccount = currentAccount;
	}

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
