package com.cg.bank.customer;

import java.util.Date;

/**
 * @author Pratyush Gupta
 * 
 */
public class Statement {

	private String remark;
	private Date date;
	private String c;

	/**
	 * @return
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark
	 */
	public void setRemark(final String remark) {
		this.remark = remark;
	}

	/**
	 * @return
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date
	 */
	public void setDate(final Date date) {
		this.date = date;
	}

	/**
	 * @return
	 */
	public String getC() {
		return c;
	}

	/**
	 * @param c
	 */
	public void setC(final String c) {
		this.c = c;
	}

	/**
	 * @param remark
	 * @param date
	 * @param c
	 */
	public Statement(final String remark, final Date date, final String c) {
		super();
		this.remark = remark;
		this.date = date;
		this.c = c;
	}

}
