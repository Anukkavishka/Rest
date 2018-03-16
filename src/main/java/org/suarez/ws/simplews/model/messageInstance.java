package org.suarez.ws.simplews.model;


public class messageInstance {
	private long id;
	private String msg;
	private String author;
	private String created;
	
	public messageInstance() {
		super();
		
	}
	
	public messageInstance(long id, String msg, String author, String created) {
		super();
		this.id = id;
		this.msg = msg;
		this.author = author;
		this.created = created;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	
	
	
}
