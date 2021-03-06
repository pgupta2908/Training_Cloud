package com.cg.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cg.entity.Goods;

/**
 * @author trainee
 *
 */
public class GoodsDaoImpl implements GoodsDao {

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
	public GoodsDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public GoodsDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Goods addGoods(Goods goods) {
		String query = "insert into goods (goodsId,goodsName,goodsQuantity,goodsPrice) values (?,?,?,?)";
		Object[] inputs = new Object[] { goods.getGoodsId(), goods.getGoodsName(), goods.getGoodsQuantity(),
				goods.getGoodsPrice() };
		jdbcTemplate.update(query, inputs);
		return goods;
	}

	@Override
	public Goods updateGoods(Goods goods) {
		String sql = "update goods set goodsName=? where goodsId = ?";
		Object[] inputs = new Object[] { goods.getGoodsName(), goods.getGoodsId() };
		jdbcTemplate.update(sql, inputs);
		return goods;
	}

	@Override
	public String deleteGoods(int goodsId) {
		String sql = "delete from goods where goodsId = ?";
		jdbcTemplate.update(sql, new Object[] { goodsId });
		return null;

	}

	/*@Override
	public Goods orderGoods(Goods goods) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
