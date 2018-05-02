package com.cg.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cg.entity.Customer;

/**
 * @author trainee
 *
 */
public class CustomerDaoImpl implements CustomerDao {

	private JdbcTemplate jdbcTemplate;

	/**
	 * @param jdbcTemplate
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public CustomerDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param jdbcTemplate
	 */
	public CustomerDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		String query = "insert into customer (customerId,customerName,customerAddress,paymentMode) values (?,?,?,?)";
		Object[] inputs = new Object[] { customer.getCustomerId(), customer.getCustomerName(),
				customer.getCustomerAddress(), customer.getPaymentMode() };
		jdbcTemplate.update(query, inputs);
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		String sql = "update customer set paymentMode=? where customerId = ?";
		Object[] inputs = new Object[] { customer.getPaymentMode(), customer.getCustomerId() };
		jdbcTemplate.update(sql, inputs);
		return customer;
	}

	@Override
	public Customer deleteCustomer(int customerId) {
		String sql = "delete from customer where customerId = ?";
		jdbcTemplate.update(sql, new Object[] { customerId });
		return null;

	}

}
