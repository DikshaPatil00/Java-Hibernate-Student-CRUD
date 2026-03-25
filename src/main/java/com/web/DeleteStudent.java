package com.web;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.entity.student;
import com.utils.Hibernetutils;


public class DeleteStudent {

	
	public static void main(String[] args) {
		
	SessionFactory sessionFactory = Hibernetutils.getSessionFactory();
		
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();
  
    //get entity class name , primary no
    student s = session.get(student.class, 9);
    
    session.delete(s);
    
    transaction.commit();
    
    session.close();

	
	}

}

