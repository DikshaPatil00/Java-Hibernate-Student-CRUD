package com.web;


import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.student;
import com.utils.Hibernetutils;


public class createStudent {

	
	public static void main(String[] args) {
		
	SessionFactory sessionFactory = Hibernetutils.getSessionFactory();
		
    Session session = sessionFactory.openSession();
  
    Transaction transaction = session.beginTransaction();
    
    //object saving code
    student s = new student();   
    s.setName("xyz");
    s.setMarks(55);
    s.setRollnum(14);
    s.setGrade("C");
    s.setCity("nashik");
    
    session.save(s);
    
    
    transaction.commit();

	
	}

}
