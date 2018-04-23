package training.banking.beans;

import java.time.Period;

public class SavingAccount implements Account{

	private Money money;
	private float interestRate;
	private Period period;
	
	public Money getMoney() {
		return money;
	}
	public void setMoney(Money money) {
		this.money = money;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public Period getPeriod() {
		return period;
	}
	public void setPeriod(Period period) {
		this.period = period;
	}
	
	public SavingAccount() {
		super();
	}
	
	public SavingAccount(Money money, float interestRate, Period period) {
		super();
		this.money = money;
		this.interestRate = interestRate;
		this.period = period;
	}
	
	@Override
	public String toString() {
		return "SavingAccount [money=" + money + ", interestRate=" + interestRate + ", period=" + period + "]";
	}
	
}
