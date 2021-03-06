package com.cg.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cg.entity.Supplier;

/**
 * @author trainee
 *
 */
public class SupplierDaoImpl implements SupplierDao {

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
	public SupplierDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public SupplierDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Supplier addSupplier(Supplier supplier) {
		String query = "insert into supplier (supplierId,supplierName,supplierAddress,quantityOrder,orderId,amount) values (?,?,?,?,?,?)";
		Object[] inputs = new Object[] { supplier.getSupplierId(), supplier.getSupplierName(),
				supplier.getSupplierAddress(), supplier.getQuantityOrder(), supplier.getOrderId(),
				supplier.getAmount() };
		jdbcTemplate.update(query, inputs);

		return supplier;
	}

	@Override
	public Supplier updateSupplier(Supplier supplier) {
		String sql = "update supplier set amount=? where supplierId = ?";
		Object[] inputs = new Object[] { supplier.getAmount(), supplier.getSupplierId() };
		jdbcTemplate.update(sql, inputs);
		return supplier;
	}

	@Override
	public String deleteSupplier(int supplierId) {
		String sql = "delete from supplier where supplierId = ?";
		jdbcTemplate.update(sql, new Object[] { supplierId });
		return null;
	}

}
