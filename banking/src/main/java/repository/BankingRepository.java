package repository;

import java.util.List;

import training.banking.model.Account;
import training.banking.model.BankBranch;
import training.banking.model.Customer;

public interface BankingRepository {

	public BankBranch addNewBankBranch(BankBranch branch);
	
	public BankBranch viewBankBranch(int branchId);
	
	public String updateBankBranch(int branchId);
	
	public String deleteBankBranch(int branchId);
	
	public List<BankBranch> viewAllBankBranches();
	
		
	public String addCustomer();
	
	public Customer viewCustomer(int custId);
	
	public String updateCustomer(int custId);
	
	public String deleteCustomer(int custId);
	
	public List<Customer> viewAllCustomers();
		
	
	public String addAccount(String accountType);
	
	public Account viewAccount(int accountNumber);
	
	public String updateAccount(int accountNumber);
	
	public String deleteAccount(int account);
	
	public List<Account> viewAllAccounts();
	
	
	public int deposit(int accountNumber, int amount);
	
	public int withdraw(int accountNumber, int amount);
	
	public String checkStatement(int accountNumber);

}
