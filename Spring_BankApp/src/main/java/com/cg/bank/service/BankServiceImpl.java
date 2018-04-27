package com.cg.bank.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.cg.bank.customer.CustomerDetails;
import com.cg.bank.customer.Statement;
import com.cg.bank.dao.IBankDao;

/**
 * @author Pratyush Gupta
 *
 */
@Service("bankServiceImpl")
public class BankServiceImpl implements IBankService {

	IBankDao idao;

	@Override
	public void add(CustomerDetails customer) {

		idao.add(customer);

	}

	public BankServiceImpl(IBankDao idao) {
		super();
		this.idao = idao;
	}

	public BankServiceImpl() {
	}

	@Override
	public int transact(String customer_id) {

		return idao.transact(customer_id);
	}

	@Override
	public int transaction(String user_id, String benificiary_id, double amount) {

		return idao.transaction(user_id, benificiary_id, amount);
	}

	@Override
	public int calcInterest(String user_id, String benificiary_id) {

		return idao.calcInterest(user_id, benificiary_id);
	}

	@Override
	public void statements(String user_id, String remarks, Date date) {

		idao.statements(user_id, remarks, date);
	}

	public void addStatement(Statement statement) {

		idao.addStatement(statement);
	}

	public void transctsumm(String customer_ide) {

		idao.transctsumm(customer_ide);
	}

	@Override
	public void update(String customer_update, String newmobile) {

		idao.update(customer_update, newmobile);
	}

	@Override
	public void delete(String customer_delete) {

		idao.delete(customer_delete);
	}
}
