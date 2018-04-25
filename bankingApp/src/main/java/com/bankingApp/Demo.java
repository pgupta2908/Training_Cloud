package com.bankingApp;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pratyush Gupta
 *
 */
public class Demo {

	public static void main(String[] args) {

		Statement stmt1 = new Statement("Statement is printing");

		Address addr1 = new Address("nagar", "103", "201206", "mum");
		Contact cont1 = new Contact(12345, 0123, "mail@gmail.com", addr1);

		List<Statement> stmtList = new ArrayList<Statement>();
		stmtList.add(stmt1);

		Account acc1 = new SavingAccountImpl(10000, 2.9, 5, stmtList, "xyz");
		

		List<Account> accountlist = new ArrayList<Account>();
		accountlist.add(acc1);
		
		Customer cust1 = new Customer("Arpan", "Walia", cont1, accountlist);

		System.out.println(acc1.toString());
		System.out.println(cust1.toString());
		
	}

}
