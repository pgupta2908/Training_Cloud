package training.banking.model;

public class BankBranch {

	private Name branchName;
	private int branchId;
	private Contact branchContact;

	public Name getName() {
		return branchName;
	}

	public void setName(Name branchName) {
		this.branchName = branchName;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBrachId(int branchId) {
		this.branchId = branchId;
	}

	public Contact getContact() {
		return branchContact;
	}

	public void setContact(Contact branchContact) {
		this.branchContact = branchContact;
	}

	@Override
	public String toString() {
		return "BankBranch [branchName=" + branchName + ", branchId=" + branchId + ", branchContact=" + branchContact + "]";
	}

	public BankBranch() {
		super();
	}

	public BankBranch(Name branchName, int branchId, Contact branchContact) {
		super();
		this.branchName = branchName;
		this.branchId = branchId;
		this.branchContact = branchContact;
	}

}
