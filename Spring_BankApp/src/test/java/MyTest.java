import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Test;

import com.cg.bank.customer.Account;
import com.cg.bank.customer.Address;
import com.cg.bank.customer.Contact;
import com.cg.bank.customer.CustomerDetails;
import com.cg.bank.dao.BankDaoImpl;
import com.cg.bank.service.BankServiceImpl;
import com.cg.bank.service.IBankService;

/**
 * @author Pratyush Gupta
 *
 */
public class MyTest {

	@Test
	public void testBankApp() {
		IBankService iserv = new BankServiceImpl();
		Contact contact = new Contact("2627383893", "7237363553", "myhaat@gmail.com");
		Address address = new Address("hd pur", "123", "119023", "mum");
		Account acc = new Account("Savings", "Current");
		CustomerDetails customer = new CustomerDetails("11", "Savings", "user1", "surname1", 320.0, contact, address,
				0.0, acc);
		CustomerDetails customer2 = new CustomerDetails("12", "Current", "user2", "surname2", 320.0, contact, address,
				0.0, acc);

		BankDaoImpl bank = new BankDaoImpl();
		Map<String, CustomerDetails> map = bank.getMap();

		assertEquals(0, map.size());

		iserv.add(customer);
		iserv.add(customer2);

		System.out.println(map.size());

		//	Add customer
		assertEquals(2, map.size());

		//	View Customer
		iserv.transact(customer.getCustomer_id());
		assertEquals(0, iserv.transact("11"));

		//	View Customer
		iserv.transact(customer2.getCustomer_id());
		assertEquals(1, iserv.transact("1245"));

		//	Transaction
		iserv.transaction(customer.getCustomer_id(), customer2.getCustomer_id(), 200);
		assertEquals(20, iserv.transaction("11", "12", 300.0));

	}

}
