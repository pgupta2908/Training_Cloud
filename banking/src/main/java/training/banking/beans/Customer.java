package training.banking.beans;

public class Customer {

	private int custId;
	private String firstName;
	private String lastName;
	private Contact contact;
	private Account account;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public Customer() {
		super();
	}
	
	public Customer(int custId, String firstName, String lastName, Contact contact, Account account) {
		super();
		this.custId = custId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.account = account;
	}
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ",firstName=" + firstName + ", lastName=" + lastName + ", contact=" + contact + ", account=" + account + "]";
	}
	
	
}
