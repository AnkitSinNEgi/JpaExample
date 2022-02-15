
package com.all;

import java.util.List;

import javax.persistence.*;

@Entity
public class Address {
	
	@Id
	@Column(name="address_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="a_id")
	@SequenceGenerator(name="a_id", initialValue= 300, allocationSize=1 )
	private int addid;	
	private String address;
	
	
	public int getAddid() {
		return addid;
	}
	public void setAddid(int addid) {
		this.addid = addid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}

