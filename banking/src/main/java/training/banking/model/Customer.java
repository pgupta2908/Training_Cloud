package training.banking.model;

public class Customer {

	private int custId;
	private Name customerName;
	private Contact customerContact;
	
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public Name getName() {
		return customerName;
	}

	public void setName(Name customerName) {
		this.customerName = customerName;
	}

	public Contact getContact() {
		return customerContact;
	}

	public void setContact(Contact customerContact) {
		this.customerContact = customerContact;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", customerName=" + customerName + ", customerContact=" + customerContact + "]";
	}

	public Customer() {
		super();
	}

	public Customer(int custId, Name customerName, Contact customerContact) {
		super();
		this.custId = custId;
		this.customerName = customerName;
		this.customerContact = customerContact;
	}

}
