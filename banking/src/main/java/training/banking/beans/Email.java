package training.banking.beans;

public class Email {

	private String primaryEmail;
	private String secondaryEmail;

	public String getPrimaryEmail() {
		return primaryEmail;
	}
	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}
	public String getSecondaryEmail() {
		return secondaryEmail;
	}
	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}
	
	public Email() {
		super();
	}
	
	public Email(String primaryEmail, String secondaryEmail) {
		super();
		this.primaryEmail = primaryEmail;
		this.secondaryEmail = secondaryEmail;
	}
	
	@Override
	public String toString() {
		return "Email [primaryEmail=" + primaryEmail + ", secondaryEmail=" + secondaryEmail + "]";
	}
	
	
}
