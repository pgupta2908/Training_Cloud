package training.banking.model;

public class Contact {

	private PhoneNumber phoneNumber;
	private Email email;
	private Address address;
	
	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Email getEmail() {
		return email;
	}
	public void setEmail(Email email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Contact() {
		super();
	}
	
	public Contact(PhoneNumber phoneNumber, Email email, Address address) {
		super();
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Contact [phoneNumber=" + phoneNumber + ", email=" + email + ", address="
				+ address + "]";
	}
	
	
}
