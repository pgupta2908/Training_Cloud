package training.banking;

import java.time.Period;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import training.banking.beans.Money;

/**
 * Unit test for banking App.
 */


    public int	getFlexibleSavingsBalance(Money money, float interestRate, Period period)
    {
    	int Money.amount = 400;
		float interestRate1 = 4.5;
		int period1= 2;
		int balance = (int) (amount*interestRate1*period1);
		assertEquals(3600, balance);
    	
    }
}
