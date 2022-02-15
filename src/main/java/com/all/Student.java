package com.all;

import java.awt.print.Book;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Student {
		
	
		@Id
		@Column(name="roll_no")
		@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="p_id")
		@SequenceGenerator(name="p_id", initialValue= 100, allocationSize=1 )
		private int rollno;
		
		@Column(name="student_name")
		private String name;
		
		@OneToOne
		private ContactNo contno;
		
		@ManyToOne
		private Address address;
		
		@ManyToMany(targetEntity= Books.class)
		private Set bookSet;
		
		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		
		

		public ContactNo getContno() {
			return contno;
		}

		public void setContno(ContactNo contno) {
			this.contno = contno;
		}

		public int getRollno() {
			return rollno;
		}

		public void setRollno(int rollno) {
			this.rollno = rollno;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}


		public Set getBookSet() {
			return bookSet;
		}

		public void setBookSet(Set bookSet) {
			this.bookSet = bookSet;
		}





		


		
		
		
}
