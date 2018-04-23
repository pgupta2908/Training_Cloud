package training.banking.beans;

public class Bank {

	private String name;
	private Contact contact;
	private Account account;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	public Bank() {
		super();
	}
	
	public Bank(String name, Contact contact, Account account) {
		super();
		this.name = name;
		this.contact = contact;
		this.account = account;
	}
	
	@Override
	public String toString() {
		return "Bank [name=" + name + ", contact=" + contact + ", account=" + account + "]";
	}
	
}
