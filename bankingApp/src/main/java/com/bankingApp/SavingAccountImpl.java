package com.bankingApp;

import java.util.List;

/**
 * @author Pratyush Gupta
 *
 */
public class SavingAccountImpl implements Account {

	private double money;
	private double interestRate = 3.6;
	private int interestPeriod;
	private List<Statement> statementList;
	private String typeAccount;

	/**
	 * @param money
	 * @param interestRate
	 * @param interestPeriod
	 * @param statementList
	 * @param typeAccount
	 */
	public SavingAccountImpl(double money, double interestRate, int interestPeriod, List<Statement> statementList, String typeAccount) {
		this.money = money;
		this.interestRate = interestRate;
		this.interestPeriod = interestPeriod;
		this.statementList = statementList;
		this.typeAccount = "Savings";
	}

	/**
	 * @return
	 */
	public double getMoney() {
		return money;
	}

	/**
	 * @return
	 */
	public Integer getInterestPeriod() {
		return interestPeriod;
	}

	public void getStatementList(List<Statement> statementlist) {

		for (Statement stm : statementlist) {
			System.out.println(stm);
		}
	}

	@Override
	public String toString() {
		return "SavingAccount [money=" + money + ", interestRate=" + interestRate + ", interestPeriod=" + interestPeriod
				+ ", statementList=" + statementList + ", typeAccount=" + typeAccount + "]";
	}

}
