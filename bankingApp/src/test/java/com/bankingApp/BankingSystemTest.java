package com.bankingApp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.bankingApp.Address;
import com.bankingApp.Contact;
import com.bankingApp.Statement;

public class BankingSystemTest {

	Address addr = new Address("puri", "103", "110216", "del");
	Statement stmt = new Statement("Hello");
	List<Statement> stateList1 = new ArrayList<>();

	@Test
	public void addressTest1() {
		assertEquals("address message 1", addr.getHouseNumber(), "103");

	}

	@Test
	public void addressTest2() {
		assertNotEquals("address message 2", addr.getStreet(), "nagar");

	}

	@Test
	public void addressTest3() {
		assertNotEquals("address message 3", addr.getCity(), "mum");
		
	}

	@Test
	public void bankTestContact4() {
		Contact con = new Contact(1234, 5678, "user@gmail.com", addr);
		assertEquals("test message contact 4", true, Contact.addContact(con));
	}

	@Test
	public void test5() {
		stateList1.add(stmt);
		assertEquals("test message list 5", false, stateList1.isEmpty());

	}

}
