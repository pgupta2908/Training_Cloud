package training.banking;

import java.time.Period;

import training.banking.beans.Money;
import training.banking.beans.SavingAccount;


public class App 
{
	public static void main( String[] args )
	{
		
		Money money = ["inr",200];
		
		SavingAccount svAcc = new SavingAccount();
		svAcc.setMoney(money);
		svAcc.setInterestRate(int interestRate);
		svAcc.setPeriod(period);
		int getSavingsBalance(money, interestRate, period);
		int getFlexibleSavingsBalance(Money money1, float interestRate, Period period);
		int getCheckingBalance(Money money11, float interestRate1, Period period1);

	}
	
	int getFlexibleSavingsBalance(Money money, float interestRate, Period period)
	{
		int balance = 0;
		
		this.money.amount = money.getAmount();
		this.interestRate = interestRate;
		this.period = period;
		
		balance = amount*interestRate*period;
		return balance;
		
	}
	
}
