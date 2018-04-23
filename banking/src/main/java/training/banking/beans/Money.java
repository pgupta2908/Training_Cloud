package training.banking.beans;

public class Money {

	private String currency;
	private float amount;
	
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	public Money() {
		super();
	}
	
	public Money(String currency, float amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Money [currency=" + currency + ", amount=" + amount + "]";
	}
	
	
}
