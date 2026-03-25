package com.web;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

import com.entity.student;
import com.utils.Hibernetutils;


public class AllStudent {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
	SessionFactory sessionFactory = Hibernetutils.getSessionFactory();
		
    Session session = sessionFactory.openSession();
  
     Criteria criteria = session.createCriteria(student.class);
    
     criteria.add(Restrictions.eq("marks", 95.0));
     
     //select * from student::criteria
     //select * from student where marks<80::criteria with restiction
     //want to apply where clause on criteria list u have to add Restiction
     
     
     List<student> list = criteria.list();
     
     System.out.println(list);
    
    session.close();

	
	}

}
