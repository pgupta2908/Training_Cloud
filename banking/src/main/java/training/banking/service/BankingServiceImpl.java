package training.banking.service;

import java.util.List;

import repository.BankingRepository;
import training.banking.model.Account;
import training.banking.model.BankBranch;
import training.banking.model.Customer;

public class BankingServiceImpl implements BankingService {

	BankingRepository dao;

	@Override
	public String addNewBankBranch(BankBranch branch) {
		return dao.addNewBankBranch(branch);
	}

	@Override
	public BankBranch viewBankBranch(int branchId) {
		return dao.viewBankBranch(branchId);
	}

	@Override
	public String updateBankBranch(int branchId) {
		return dao.updateBankBranch(branchId);
	}

	@Override
	public String deleteBankBranch(int branchId) {
		return dao.deleteBankBranch(branchId);
	}

	@Override
	public List<BankBranch> viewAllBankBranches() {
		return dao.viewAllBankBranches();
	}
	

	@Override
	public String addCustomer() {
		return dao.addCustomer();
	}

	@Override
	public Customer viewCustomer(int custId) {
		return dao.viewCustomer(custId);
	}

	@Override
	public String updateCustomer(int custId) {
		return dao.updateCustomer(custId);
	}

	@Override
	public String deleteCustomer(int custId) {
		return dao.deleteCustomer(custId);
	}

	@Override
	public List<Customer> viewAllCustomers() {
		return dao.viewAllCustomers();
	}

	
	@Override
	public String addAccount(String accountType) {
		return dao.addAccount(accountType);
	}

	@Override
	public Account viewAccount(int accountNumber) {
		return dao.viewAccount(accountNumber);
	}

	@Override
	public String updateAccount(int accountNumber) {
		return dao.updateAccount(accountNumber);
	}

	@Override
	public String deleteAccount(int account) {
		return dao.deleteAccount(account);
	}

	@Override
	public List<Account> viewAllAccounts() {
		return dao.viewAllAccounts();
	}

	
	@Override
	public int deposit(int accountNumber, int amount) {
		return dao.deposit(accountNumber, amount);
	}

	@Override
	public int withdraw(int accountNumber, int amount) {
		return dao.withdraw(accountNumber, amount);
	}

	@Override
	public String checkStatement(int accountNumber) {
		return dao.checkStatement(accountNumber);
	}

}
