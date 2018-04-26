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

	public String getRemark() {
		return remark;
	}

	public void setRemark(final String remark) {
		this.remark = remark;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(final Date date) {
		this.date = date;
	}

	public String getC() {
		return c;
	}

	public void setC(final String c) {
		this.c = c;
	}

	public Statement(final String remark, final Date date, final String c) {
		super();
		this.remark = remark;
		this.date = date;
		this.c = c;
	}

}
