package training.banking.beans;

import java.time.Period;

public class FlexibleSavingAccount implements Account{

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
	
	public FlexibleSavingAccount() {
		super();
	}
	
	public FlexibleSavingAccount(Money money, float interestRate, Period period) {
		super();
		this.money = money;
		this.interestRate = interestRate;
		this.period = period;
	}
	
	@Override
	public String toString() {
		return "FlexibleSavingAccount [money=" + money + ", interestRate=" + interestRate + ", period=" + period + "]";
	}
	
}
