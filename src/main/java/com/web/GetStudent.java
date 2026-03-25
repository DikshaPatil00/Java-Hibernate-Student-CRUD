package com.web;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.student;
import com.utils.Hibernetutils;


public class GetStudent {

	
	public static void main(String[] args) {
		
	SessionFactory sessionFactory = Hibernetutils.getSessionFactory();
		
    Session session = sessionFactory.openSession();
  
    //get entity class name , primary no
    student s = session.get(student.class, 9);
    System.out.println(s);
    
    session.close();

	
	}

}
