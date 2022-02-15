package com.all;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Books {
		
	@Id
	@Column(name="book_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="b_id")
	@SequenceGenerator(name="b_id", initialValue= 500, allocationSize=1 )
	private int bid;
	
	@Column(name="book_name")
	private String bname;
	
	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	
	
	
	
	
}
