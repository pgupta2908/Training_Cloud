package training.banking.model;

public class Account {

	private int accountNumber;
	private Customer customer;
	private String accountType;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", customer=" + customer
				+ ", accountType=" + accountType + "]";
	}

	public Account() {
		super();
	}

	public Account(int accountNumber, Customer customer, String accountType) {
		super();
		this.accountNumber = accountNumber;
		this.customer = customer;
		this.accountType = accountType;
	}

}
