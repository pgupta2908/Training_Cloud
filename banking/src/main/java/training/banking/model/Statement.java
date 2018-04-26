package training.banking.model;

import java.util.Date;

public class Statement {

	private Date date;
	private double balance;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Statement [date=" + date + ", balance=" + balance + "]";
	}

	public Statement() {
		super();
	}

	public Statement(Date date, double balance) {
		super();
		this.date = date;
		this.balance = balance;
	}

}
