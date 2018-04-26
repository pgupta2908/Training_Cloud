package com.training.bean;

/**
 * @author Pratyush Gupta
 *
 */
public class Customer {

	private String firstName;
	private String lastName;

	/**
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}


/*

package training.banking;


public class App 
{
	public static void main( String[] args )
	{
		
		Money money = new Money("abc",200);
		FlexibleSavingAccount flexiAcc = new FlexibleSavingAccount();
		
		SavingAccount svAcc = new SavingAccount();
		svAcc.setMoney(money);
		svAcc.setInterestRate(1000);
		//svAcc.setPeriod();
		// int getSavingsBalance(money, svAcc.setInterestRate(5));
		int getFlexibleSavingsBalance();
		int getCheckingBalance(Money money11, float interestRate1, Period period1);

	}
	
	private static void getFlexibleSavingsBalance() {
		// TODO Auto-generated method stub
		
	}

	int getFlexibleSavingsBalance(Money money, float interestRate, Period period)
	{
		int balance = 0;
		money.getAmount();
		flexiAcc.getI
		
		this.money.amount = money.getAmount();
		this.interestRate = interestRate;
		this.period = period;
		
		balance = amount*interestRate*period;
		return balance;
		
	}
	
	
}
*/