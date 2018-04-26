package training.banking.model;

public class PhoneNumber {

	private String mobilePhone;
	private String homePhone;
	private String officePhone;
	
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	public String getOfficePhone() {
		return officePhone;
	}
	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}
	
	public PhoneNumber() {
		super();
	}
	
	public PhoneNumber(String mobilePhone, String homePhone, String officePhone) {
		super();
		this.mobilePhone = mobilePhone;
		this.homePhone = homePhone;
		this.officePhone = officePhone;
	}
	
	@Override
	public String toString() {
		return "PhoneNumber [mobilePhone=" + mobilePhone + ", homePhone=" + homePhone + ", officePhone=" + officePhone
				+ "]";
	}
	
	
}
