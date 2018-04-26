package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import training.banking.model.Address;
import training.banking.model.BankBranch;
import training.banking.model.Contact;
import training.banking.model.Email;
import training.banking.model.Name;
import training.banking.model.PhoneNumber;
import training.banking.service.BankingService;

public class BankingController {

	static BankingService service;
	
	public static void main(String[] args) {

		while (true)

		{
			System.out.println("Please enter a choice");
			System.out.println("1. Add a branch");
			System.out.println("2. Display all branches");
			System.out.println("3. Exit");

			Scanner scanner = new Scanner(System.in);
			try {
				int choice = scanner.nextInt();

				if (choice < 1 || choice > 3)
					System.out.println("Invalid input");
				else {
					switch (choice) {
					case 1: {
						
						PhoneNumber phoneNumber = new PhoneNumber();
						String homePhone = scanner.next();
						String mobilePhone = scanner.next();
						String officePhone = scanner.next();
						
						phoneNumber.setHomePhone(homePhone);
						phoneNumber.setMobilePhone(mobilePhone);
						phoneNumber.setOfficePhone(officePhone);
						
						Email email = new Email();
						String primaryEmail = scanner.next();
						String secondaryEmail = scanner.next();
						
						email.setPrimaryEmail(primaryEmail);
						email.setSecondaryEmail(secondaryEmail);
						
						Address address = new Address();
						String houseNumber = scanner.next();
						String street = scanner.next();
						String city = scanner.next();
						String country = scanner.next();
						String zipCode = scanner.next();
						
						address.setHouseNumber(houseNumber);
						address.setStreet(street);
						address.setCity(city);
						address.setCountry(country);
						address.setZipCode(zipCode);
								
						Contact branchContact = new Contact();
						
						branchContact.setPhoneNumber(phoneNumber);
						branchContact.setEmail(email);
						branchContact.setAddress(address);
						
						Name branchName = new Name();
						String firstName = scanner.next();
						String middleName = scanner.next();
						String lastName = scanner.next();
						
						branchName.setFirstName(firstName);
						branchName.setMiddleName(middleName);
						branchName.setLastName(lastName);
						
						BankBranch branch = service.addNewBankBranch(branch);
						
					}
						break;

					case 2:
						service.viewAllAccounts();
						break;

					case 3:
						System.out.println("GoodBye");
						System.exit(0);
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("Please enter a valid choice");
			}
			// scanner.close();
		}
	}

	public String addNewBankBranch(Contact branchContact) {
	
		
		service.addNewBankBranch();
		
	}
	

}
