package training.banking.beans;

import java.util.Date;

public class Statement {

	private Date date;
	private String content;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public Statement() {
		super();
	}
	
	public Statement(Date date, String content) {
		super();
		this.date = date;
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "Statement [date=" + date + ", content=" + content + "]";
	}

}
