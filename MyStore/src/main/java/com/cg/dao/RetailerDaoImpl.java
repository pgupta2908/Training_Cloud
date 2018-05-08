package com.cg.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.cg.entity.Customer;
import com.cg.entity.Goods;
import com.cg.entity.Retailer;
import com.cg.entity.Supplier;

/**
 * @author trainee
 *
 */
public class RetailerDaoImpl implements RetailerDao {

	private JdbcTemplate jdbcTemplate;

	/**
	 * @param jdbcTemplate
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * @param jdbcTemplate
	 */
	public RetailerDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public RetailerDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Retailer addRetailer(Retailer retailer) {
		String query = "insert into retailer (retailerId,retailerName,retailerAddress) values (?,?,?)";
		Object[] inputs = new Object[] { retailer.getRetailerId(), retailer.getRetailerName(),
				retailer.getRetailerAddress() };
		jdbcTemplate.update(query, inputs);
		return retailer;
	}

	@Override
	public List<Customer> retrieveCustomer() {
		/*
		 * String query = "select * from goods where goodsId=?"; Object[] inputs = new
		 * Object[] {goodsId}; String goods = jdbcTemplate.queryForObject(query, inputs,
		 * String.class); return goods;
		 */
		List<Customer> customerList = jdbcTemplate.query("SELECT * from Customer",
				new BeanPropertyRowMapper<Customer>(Customer.class));
		return customerList;
	}

	@Override
	public List<Goods> retrieveGoods() {
		/*
		 * String query = "select * from goods where goodsId=?"; Object[] inputs = new
		 * Object[] {goodsId}; String goods = jdbcTemplate.queryForObject(query, inputs,
		 * String.class); return goods;
		 */
		List<Goods> goodslist = jdbcTemplate.query("SELECT * from Goods",
				new BeanPropertyRowMapper<Goods>(Goods.class));
		return goodslist;
	}

	@Override
	public List<Supplier> retrieveSupplier() {
		/*
		 * String query = "select * from goods where goodsId=?"; Object[] inputs = new
		 * Object[] {goodsId}; String goods = jdbcTemplate.queryForObject(query, inputs,
		 * String.class); return goods;
		 */
		List<Supplier> supplierList = jdbcTemplate.query("SELECT * from Supplier",
				new BeanPropertyRowMapper<Supplier>(Supplier.class));
		return supplierList;
	}

}
