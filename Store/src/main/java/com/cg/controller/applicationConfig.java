package com.cg.controller;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.cg.dao.CustomerDao;
import com.cg.dao.CustomerDaoImpl;
import com.cg.dao.GoodsDao;
import com.cg.dao.GoodsDaoImpl;
import com.cg.dao.RetailerDao;
import com.cg.dao.RetailerDaoImpl;
import com.cg.dao.SupplierDao;
import com.cg.dao.SupplierDaoImpl;

/**
 * @author trainee
 *
 */
@Configuration
public class applicationConfig {

	@Bean
	public DataSource dataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		// MySQL database we are using
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/retailmanagement");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;

	}

	@Bean
	public CustomerDao customerDao() {
		return new CustomerDaoImpl();

	}

	@Bean
	public GoodsDao goodsDao() {
		return new GoodsDaoImpl();

	}

	@Bean
	public RetailerDao retailerDao() {
		return new RetailerDaoImpl();

	}

	@Bean
	public SupplierDao supplierDao() {
		return new SupplierDaoImpl();

	}
}
