package com.training.dao;

import java.util.Map;

import com.training.model.Customer;
import com.training.model.Goods;
import com.training.model.Supplier;

public interface IDao {

	/**
	 * @param goods
	 * @return
	 */
	public Goods addGoods(Goods goods);

	/**
	 * @param goodsId
	 */
	public void removeGoods(int goodsId);

	/**
	 * @param goodsId
	 * @return
	 */
	public Map<Integer, Goods> orderGoods(int goodsId);

	/**
	 * @param goodsId
	 * @param goodsName
	 * @param goodsPrice
	 * @param goodsQuantity
	 * @return
	 */
	public Goods updateGoods(int goodsId, String goodsName, float goodsPrice, int goodsQuantity);

	/**
	 * @param supplier
	 * @return
	 */
	public Supplier addSupplier(Supplier supplier);

	/**
	 * @param supplierId
	 */
	public void removeSupplier(int supplierId);

	/**
	 * @param supplierId
	 * @param supplierName
	 * @param supplierAddress
	 * @param quantityOrder
	 * @param orderId
	 * @param amount
	 * @return
	 */
	public Supplier updateSupplier(int supplierId, String supplierName, String supplierAddress, int quantityOrder,
			int orderId, float amount);

	/**
	 * @param customer
	 * @return
	 */
	public Customer addCustomer(Customer customer);

	/**
	 * @param customerId
	 */
	public void removeCustomer(int customerId);

	/**
	 * @param customerId
	 * @param customerName
	 * @param customerAddress
	 * @param paymentMode
	 * @return
	 */
	public Customer updateCustomer(int customerId, String customerName, String customerAddress, String paymentMode);

	/**
	 * @return
	 */
	public Map<Integer, Goods> viewGoods();

	/**
	 * @return
	 */
	public Map<Integer, Customer> viewCustomer();

	/**
	 * @return
	 */
	public Map<Integer, Supplier> viewSupplier();
}
