package repository;

import java.util.ArrayList;
import java.util.List;

import training.banking.model.Account;
import training.banking.model.Address;
import training.banking.model.BankBranch;
import training.banking.model.Contact;
import training.banking.model.Customer;
import training.banking.model.Email;
import training.banking.model.Name;
import training.banking.model.PhoneNumber;

public class BankingRepositoryImpl implements BankingRepository {

	List<BankBranch> branchList = new ArrayList<>();
	List<Account> accountList = new ArrayList<>();
	List<Customer> customerList = new ArrayList<>();

	@Override
	public BankBranch addNewBankBranch(BankBranch branch) {

		branch = new BankBranch();
		branch.setBrachId(branchId);
		branch.setName(branchName);
		branch.setContact(branchContact);
		branchList.add(branch);

		return branch;

	}

	@Override
	public BankBranch viewBankBranch(int branchId) {
		
		return 
				
	}

	@Override
	public String updateBankBranch(int branchId) {

		return null;

	}

	@Override
	public String deleteBankBranch(int branchId) {

		return null;

	}

	@Override
	public List<BankBranch> viewAllBankBranches() {

		for (BankBranch branch : branchList) {
			System.out.println(branch);
		}
		return branchList;

	}

	@Override
	public String addCustomer() {

		PhoneNumber phoneNumber = new PhoneNumber();

		phoneNumber.setHomePhone(homePhone);
		phoneNumber.setMobilePhone(mobilePhone);
		phoneNumber.setOfficePhone(officePhone);

		Email email = new Email();

		email.setPrimaryEmail(primaryEmail);
		email.setSecondaryEmail(secondaryEmail);

		Address address = new Address();

		address.setHouseNumber(houseNumber);
		address.setStreet(street);
		address.setCity(city);
		address.setCountry(country);
		address.setZipCode(zipCode);

		Contact contact = new Contact();

		contact.setPhoneNumber(phoneNumber);
		contact.setEmail(email);
		contact.setAddress(address);

		Customer customer = new Customer();
		customer.setCustId(custId);
		customer.setName(name);
		customer.setContact(contact);

		return null;

	}

	@Override
	public Customer viewCustomer(int custId) {

		return null;
	}

	@Override
	public String updateCustomer(int custId) {

		return null;
	}

	@Override
	public String deleteCustomer(int custId) {

		return null;
	}

	@Override
	public List<Customer> viewAllCustomers() {

		if customerList.isEmpty()
		{
			System.out.println();
		}
		else
		{
			
		}
		return null;
	}

	@Override
	public String addAccount(String accountType) {

		Account account = new Account();
		account.setAccountNumber(accountNumber);
		account.setAccountType(accountType);
		account.setCustomer(customer);
		return null;
	}

	@Override
	public Account viewAccount(int accountNumber) {

		return null;
	}

	@Override
	public String updateAccount(int accountNumber) {

		return null;
	}

	@Override
	public String deleteAccount(int account) {

		return null;
	}

	@Override
	public List<Account> viewAllAccounts() {

		return null;
	}

	@Override
	public int deposit(int accountNumber, int amount) {

		return 0;
	}

	@Override
	public int withdraw(int accountNumber, int amount) {

		return 0;
	}

	@Override
	public String checkStatement(int accountNumber) {

		return null;
	}

}
