package training.banking;

import java.time.Period;

import training.banking.beans.FlexibleSavingAccount;
import training.banking.beans.Money;
import training.banking.beans.SavingAccount;


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
