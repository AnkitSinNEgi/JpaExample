
package com.all;

import java.util.List;

import javax.persistence.*;

@Entity
public class Laptop {
	
	@Id
	@Column(name="laptop_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="l_id")
	@SequenceGenerator(name="l_id", initialValue= 200, allocationSize=1 )
	private int lid;
	@Column(name="laptop_model")
	private String lmodel;
	
	@OneToMany(targetEntity= Student.class)
	private List studentList;
	
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLmodel() {
		return lmodel;
	}
	public void setLmodel(String lmodel) {
		this.lmodel = lmodel;
	}
	public List getStudentList() {
		return studentList;
	}
	public void setStudentList(List studentList) {
		this.studentList = studentList;
	}
	
	
}
