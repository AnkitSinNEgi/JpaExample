package com.all;

import javax.persistence.*;



@Entity
public class ContactNo {

	@Id
	@Column(name="contact_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="c_id")
	@SequenceGenerator(name="c_id", initialValue= 400, allocationSize=1 )
	private int cnid;
	@Column(name="contact_no")
	private int no;
	
	
	public int getCnid() {
		return cnid;
	}
	public void setCnid(int cnid) {
		this.cnid = cnid;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
}

