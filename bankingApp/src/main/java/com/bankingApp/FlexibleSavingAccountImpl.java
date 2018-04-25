package com.bankingApp;

import java.util.List;

/**
 * @author Pratyush Gupta
 *
 */
public class FlexibleSavingAccountImpl implements Account {

	private double money;
	private double interestRate = 4.8;
	private Integer interestPeriod;
	private List<Statement> statementList;
	private String typeAccount;

	/**
	 * @param money
	 * @param interestRate
	 * @param interestPeriod
	 * @param statementList
	 * @param typeAccount
	 */
	public FlexibleSavingAccountImpl(double money, double interestRate, int interestPeriod, List<Statement> statementList, String typeAccount) {
		this.money = money;
		this.interestRate = interestRate;
		this.interestPeriod = interestPeriod;
		this.statementList = statementList;
		this.typeAccount = "Flexible Savings";
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

		for (Statement stmt : statementlist) {
			System.out.println(stmt);
		}
	}

	@Override
	public String toString() {
		return "FlexibleSavingAccount [money=" + money + ", interestRate=" + interestRate + ", interestPeriod="
				+ interestPeriod + ", statementList=" + statementList + ", typeAccount=" + typeAccount + "]";
	}

}
