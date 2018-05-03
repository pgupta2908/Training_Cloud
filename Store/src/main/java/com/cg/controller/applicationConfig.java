package com.cg.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.cg.dao.CustomerDao;
import com.cg.dao.CustomerDaoImpl;
import com.cg.dao.GoodsDao;
import com.cg.dao.GoodsDaoImpl;
import com.cg.dao.RetailerDao;
import com.cg.dao.RetailerDaoImpl;
import com.cg.dao.SupplierDao;
import com.cg.dao.SupplierDaoImpl;
import com.cg.service.CustomerService;
import com.cg.service.CustomerServiceImpl;
import com.cg.service.GoodsService;
import com.cg.service.GoodsServiceImpl;
import com.cg.service.RetailerService;
import com.cg.service.RetailerServiceImpl;
import com.cg.service.SupplierService;
import com.cg.service.SupplierServiceImpl;

/**
 * @author trainee
 *
 */
/*@Configuration
public class applicationConfig {

	*//**
	 * @return
	 *//*
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		// MySQL database we are using
		
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/goodsstore");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}

	*//**
	 * @return
	 *//*
	@Bean  (name = "jdbcTemplate") 
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate;
	}
*/

@Configuration
@PropertySource(value= {"classpath:application.properties"}) 
public class applicationConfig {

	@Autowired
	Environment environment;
	
	String Driver = "jdbc.driverClassName";
	String URL = "jdbc.url";
	String USERNAME = "jdbc.username";
	String PASSWORD = "jdbc.password";

	/*@Autowired
	Environment environment;*/

	/**
	 * @return
	 */
	@Bean(name="dataSource")
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		// MySQL database we are using

		dataSource.setDriverClassName(environment.getRequiredProperty(Driver));
		System.out.println("environment.getRequiredProperty(Driver)"+environment.getRequiredProperty(Driver));
		dataSource.setUrl(environment.getRequiredProperty(URL));
		dataSource.setUsername(environment.getRequiredProperty(USERNAME));
		dataSource.setPassword(environment.getRequiredProperty(PASSWORD));
		return dataSource;
	}

	/**
	 * @return
	 */
	@Bean /* (name = "jdbcTemplate") */
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate;
	}

	/*@Bean
	public StoreController StoreController() {
		StoreController storeController = new StoreController();
		return storeController;
	}*/
	
	/**
	 * @return
	 */
	@Bean
	public CustomerService customerService() {
		CustomerService customerService = new CustomerServiceImpl(customerDao());
		return customerService;
	}

	/**
	 * @return
	 */
	@Bean
	public CustomerDao customerDao() {
		CustomerDao customerDao = new CustomerDaoImpl(jdbcTemplate());
		return customerDao;
	}

	/**
	 * @return
	 */
	@Bean
	public GoodsService goodsService() {
		GoodsService goodsService = new GoodsServiceImpl(goodsDao());
		return goodsService;
	}

	/**
	 * @return
	 */
	@Bean
	public GoodsDao goodsDao() {
		GoodsDao goodsDao = new GoodsDaoImpl(jdbcTemplate());
		return goodsDao;
	}

	/**
	 * @return
	 */
	@Bean
	public SupplierService supplierService() {
		SupplierService supplierService = new SupplierServiceImpl(supplierDao());
		return supplierService;
	}

	/**
	 * @return
	 */
	@Bean
	public SupplierDao supplierDao() {
		SupplierDao supplierDao = new SupplierDaoImpl(jdbcTemplate());
		return supplierDao;
	}

	/**
	 * @return
	 */
	@Bean
	public RetailerService retailerService() {
		RetailerService retailerService = new RetailerServiceImpl(retailerDao());
		return retailerService;
	}

	/**
	 * @return
	 */
	@Bean
	public RetailerDao retailerDao() {
		RetailerDao retailerDao = new RetailerDaoImpl(jdbcTemplate());
		return retailerDao;
	}
}
