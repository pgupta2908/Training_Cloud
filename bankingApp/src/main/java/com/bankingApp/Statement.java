package com.bankingApp;

import java.util.Date;

/**
 * @author Pratyush Gupta
 *
 */
public class Statement {

	private String content;
	private Date date;

	/**
	 * @param cont
	 */
	public Statement(String cont) {
		date = new Date();
		content = cont;

	}

	@Override
	public String toString() {
		return "Statement [content=" + content + ", date=" + date + "]";
	}

	/**
	 * @return
	 */
	public String getContent() {
		return content;
	}

}
