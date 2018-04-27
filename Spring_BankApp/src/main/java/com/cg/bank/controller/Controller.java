package com.cg.bank.controller;

import java.util.Date;
import java.util.Scanner;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bank.customer.Account;
import com.cg.bank.customer.Address;
import com.cg.bank.customer.Contact;
import com.cg.bank.customer.CustomerDetails;
import com.cg.bank.customer.Statement;
import com.cg.bank.service.BankServiceImpl;

/**
 * @author Pratyush Gupta
 *
 */
public class Controller {

	public static final Logger log = Logger.getLogger("controller logger");
	public static Scanner sc = new Scanner(System.in);

	public static void main(final String args[]) {

		final ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		final BankServiceImpl iserv = applicationContext.getBean("bankService", BankServiceImpl.class);

		log.info("Capgemini India Global Bank");
		log.info("-------------------------");

		while (true) {
			log.info("1-Add User");
			log.info("2-Find User");
			log.info("3-Transactions");
			log.info("4-Transaction Summary");
			log.info("5-UpdateInfo");
			log.info("6-Delete User");
			log.info("7-Exit");
			final int choice = sc.nextInt();
			switch (choice) {

			// Add User

			case 1:
				final Address address = new Address();
				final Contact contact = new Contact();
				String id;
				String frsname;
				String surname;
				final String account = "demo";
				double balance;
				log.info("Welcome!Happy To Help You");
				log.info("-------------------------------------------------------");
				log.info("Hi.Please Enter Customer Id");
				id = sc.next();
				log.info("Please Enter Your First Name");
				frsname = sc.next();
				log.info("Please Enter Your Sur Name");
				surname = sc.next();
				log.info("Please Select Account");
				log.info("1-SavingsAccount");
				log.info("2-CurrentAccount");
				final Account acc = new Account();
				final int accountchoice = sc.nextInt();
				switch (accountchoice) {
				case 1:
					acc.setSavingsAccount("savingsAccount");

					break;
				case 2:
					acc.setCurrentAccount("currentAccount");
				}
				log.info("Please Enter Your Initial Balance");
				balance = sc.nextDouble();
				log.info("Please Enter Your Mobile Number");
				final String mobilenumber = sc.next();
				contact.setMobileNumber(mobilenumber);
				log.info("Please Enter Your Phone Number");
				final String phonenumber = sc.next();
				contact.setMobileNumber(phonenumber);
				log.info("Please Enter The Email");
				final String email = sc.next();
				contact.setEmail(email);
				log.info("Thank You!");
				log.info("---------------------------------------");
				log.info("Please Enter Your Street");
				final String street = sc.next();

				address.setStreet(street);
				log.info("Please Enter Your House Number");
				final String housenumber = sc.next();
				address.setHouseNumber(housenumber);
				log.info("Please Enter Your Zipcode");
				final String zipcode = sc.next();
				address.setZipCode(zipcode);
				log.info("Please Enter Your City");
				final String city = sc.next();
				address.setCity(city);
				CustomerDetails customer = new CustomerDetails(id, account, frsname, surname, balance, contact, address,
						0.0, acc);
				customer.setAccount(acc);
				iserv.add(customer);
				break;

			// Find User

			case 2:
				log.info("Enter Customer Id");
				final String customer_id = sc.next();
				iserv.transact(customer_id);
				break;

			// Tranactions

			case 3:

				final Date date = new Date();
				log.info("Enter Payee Id");
				final String user_id = sc.next();

				log.info("Enter Benificiary Id");
				final String benificiary_id = sc.next();
				log.info("Enter Amount");
				final double amount = sc.nextDouble();
				log.info("Enter Remarks");
				final String remarks = sc.next();
				final Statement statement = new Statement(remarks, date, user_id);
				iserv.addStatement(statement);

				iserv.transaction(user_id, benificiary_id, amount);
				iserv.calcInterest(user_id, benificiary_id);

				break;

			// Transaction Summary

			case 4:
				log.info("Enter Customer Id");
				final String customer_ide = sc.next();
				iserv.transctsumm(customer_ide);
				break;

			// Update Customer

			case 5:
				log.info("Enter Customer Id");
				final String customer_update = sc.next();
				log.info("Enter The Number You Want To Update");
				String newmobile = sc.next();
				iserv.update(customer_update, newmobile);
				break;

			// Delete User

			case 6:
				log.info("Enter Customer Id");
				final String customer_delete = sc.next();
				iserv.delete(customer_delete);
				break;

			// Exit program

			case 7:
				System.exit(0);
				break;

			}

		}

	}

}
