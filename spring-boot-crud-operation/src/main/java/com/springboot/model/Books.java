package com.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Books {
	@Id
	@Column
	private int bid;
	@Column
	private String bName;
	@Column
	private String author;
	

	public Books() {
		super();
	}
	
	public Books(int bid, String bName, String author) {
		super();
		this.bid = bid;
		this.bName = bName;
		this.author = author;
	}
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Books [bid=" + bid + ", bName=" + bName + ", author=" + author + "]";
	}


	
	
}
