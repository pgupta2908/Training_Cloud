package training.banking.beans;

import java.time.Period;

public interface Account {
	
	public Money getMoney();
	
	public void setMoney(Money money);
	
	public float getInterestRate();
	
	public void setInterestRate(float interestRate);
	
	public Period getPeriod();
	
	public void setPeriod(Period period);
		
	@Override
	public String toString();

}
