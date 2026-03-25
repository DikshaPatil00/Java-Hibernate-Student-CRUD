package com.web;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.student;
import com.utils.Hibernetutils;


public class UpdateStudent {

	
	public static void main(String[] args) {
		
	SessionFactory sessionFactory = Hibernetutils.getSessionFactory();
		
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();
  
    //get entity class name , primary no
    student s = session.get(student.class, 9);
    s.setName("patil");
    s.setMarks(35);
    s.setRollnum(15);
    s.setGrade("D");
    s.setCity("pune");
    
    session.update(s);
    
    transaction.commit();
    
    session.close();

	
	}

}
