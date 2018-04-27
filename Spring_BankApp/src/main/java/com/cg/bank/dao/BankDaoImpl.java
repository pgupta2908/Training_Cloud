package com.cg.bank.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.stereotype.Repository;

import com.cg.bank.customer.Contact;
import com.cg.bank.customer.CustomerDetails;
import com.cg.bank.customer.Statement;

/**
 * @author Pratyush Gupta
 *
 */
@Repository
public class BankDaoImpl implements IBankDao {

	public static final Logger log = Logger.getLogger("BankDaoImpl logger");

	public static Map<String, CustomerDetails> map = new HashMap<>();

	public static Map<String, Statement> map2 = new HashMap<>();

	public Map<String, CustomerDetails> getMap() {
		return map;
	}

	@Override
	public void add(final CustomerDetails customer) {

		map.put(customer.getCustomer_id(), customer);

	}

	@Override
	public int transact(final String customer_id) {
		// TODO Auto-generated method stub

		if (map.containsKey(customer_id)) {

			final CustomerDetails details = map.get(customer_id);
			// log.info("Your Account Type:"+details.getAccount().toString());
			log.info("First Name:" + details.getFirstname());
			log.info("Last Name:" + details.getSurname());
			log.info("Current Balance:" + details.getInitial_Amount());
			log.info("Interest:" + details.getIntst());
			log.info("MobileNumber" + details.getContact().getMobileNumber().toString());
			return 0;
		}

		else {

			log.info("No User Found");
		}
		return 1;

	}

	@Override
	public int transaction(final String user_id, final String benificiary_id, final double amount) {
		if (map.containsKey(user_id) && map.containsKey(benificiary_id)) {
			final CustomerDetails c1 = map.get(user_id);
			final CustomerDetails c2 = map.get(benificiary_id);
			final double updated_user_amount = c1.getInitial_Amount() - amount;
			c1.setInitial_Amount(updated_user_amount);
			final double updated_benificiary_amount = c2.getInitial_Amount() + amount;
			c2.setInitial_Amount(updated_benificiary_amount);
			map.put(user_id, c1);
			log.info("Success");
			return (int) updated_user_amount;
		}

		else {

			log.info("Transaction Failed");
		}
		return 0;
	}

	@Override
	public int calcInterest(final String user_id, final String benificiary_id) {
		if (map.containsKey(user_id) && map.containsKey(benificiary_id)) {
			final CustomerDetails c1 = map.get(user_id);
			final CustomerDetails c2 = map.get(benificiary_id);
			final double interest = (c1.getInitial_Amount() * 9 * 1) / 100;
			final double interes = (c2.getInitial_Amount() * 9 * 1) / 100;
			c1.setIntst(interest);
			c2.setIntst(interes);
			return 0;
		}
		return 1;
	}

	@Override
	public void statements(final String user_id, final String remarks, final Date date) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addStatement(final Statement statement) {

		map2.put(statement.getC(), statement);
	}

	@Override
	public void transctsumm(final String customer_ide) {
		if (map2.containsKey(customer_ide)) {

			final Statement details = map2.get(customer_ide);
			log.info("Your Transaction Summary:" + details.getRemark());
			log.info("Date:" + details.getDate());
			log.info("UserId:" + details.getC());

		}

		else {

			log.info("No User Found");
		}

	}

	@Override
	public void update(String customer_update, String newmobile) {
		if (map.containsKey(customer_update)) {
			Contact c = new Contact();
			c.setPhoneNumber(newmobile);
			c.setMobileNumber(map.get(customer_update).getContact().getMobileNumber());
			c.setEmail(map.get(customer_update).getContact().getEmail());
			// c.setPhoneNumber(newmobile);
			log.info("Before Updated :" + map.get(customer_update).getContact().getPhoneNumber());
			CustomerDetails obj = map.get(customer_update);
			// map.put(customer_update, value)
			obj.setContact(c);
			log.info("After Updated :" + map.get(customer_update).getContact().getPhoneNumber());
			map.put(customer_update, obj);

			log.info("Updated");
		}

	}

	@Override
	public void delete(String customer_delete) {
		if (map.containsKey(customer_delete)) {
			map.remove(customer_delete);
			log.info("Deleted");
		}
	}
}
