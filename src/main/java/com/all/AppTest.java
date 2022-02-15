package com.all;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppTest {

	public static void main(String[] args) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("rel_per");
		EntityManager emanager = emFactory.createEntityManager();
		emanager.getTransaction().begin();		
	        Scanner sc = new Scanner(System.in); 
		//For Address
//Create Entity Address
	        
	        System.out.println(" Enter Your Address: ");
            String ad= sc.next();
       
	        
	        
		Address add = new Address();
		add.setAddress(ad);
											
//Storing Address
		emanager.persist(add);	
//		
		
		//For Books
// Create book Entity
		System.out.println("Enter your books");
		
		 System.out.println("Enter book 1 : ");
         String b1= sc.next();
		Books book1 = new Books();
		book1.setBname(b1);
		
		 System.out.println("Enter Book 2 : ");
         String b2= sc.next();
		Books book2 = new Books();
		book2.setBname(b2);
		
		 System.out.println("Enter Book 3 : ");
         String b3= sc.next();
		Books book3 = new Books();
		book3.setBname(b3);
		
// Storing Book Entity		
		emanager.persist(book1);
		emanager.persist(book2);
		emanager.persist(book3);

// Create Book Set		
		Set<Books>  bookSet1 = new HashSet();
			bookSet1.add(book1);
			bookSet1.add(book2);
			bookSet1.add(book3);
			
			
		Set<Books> bookSet2 = new HashSet();
			bookSet2.add(book2);
			bookSet2.add(book1);
			bookSet2.add(book3);


// Create Contact Entity	
			 System.out.println(" Enter your Contact :");
	            int cno= sc.nextInt();
		ContactNo contno1 = new ContactNo();
		contno1.setNo(cno);

// Storing Contact Entity		
		emanager.persist(contno1);

// Create Student Entity	
			 System.out.println("Enter name : ");
         String name= sc.next();
		Student stud1 = new Student();
		stud1.setName(name);
		stud1.setBookSet(bookSet1);
		stud1.setContno(contno1);
		stud1.setAddress(add);

// Storing Student Entity		
		emanager.persist(stud1);
// Create Student List	
		List<Student>studlist = new ArrayList<>();
		studlist.add(stud1);

// Create Laptop Entity
		 System.out.println("Enter Laptop : ");
         String laptop= sc.next();
		Laptop lap1 = new Laptop();
		lap1.setLmodel(laptop);
		lap1.setStudentList(studlist);
						
// Storing Laptop Entity
		emanager.persist(lap1);
		emanager.getTransaction().commit();
		emanager.close();
		emFactory.close();
		
	}

}
