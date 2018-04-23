package training.banking.beans;

public class Customer {

	private String firstName;
	private String lastName;
	private Contact contact;
	private Account account;
	
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
	
	public Customer(String firstName, String lastName, Contact contact, Account account) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
		this.account = account;
	}
	
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", contact=" + contact + ", account=" + account + "]";
	}
	
	
}
