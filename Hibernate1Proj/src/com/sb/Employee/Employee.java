package com.sb.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sb.test.TestClass;

public class Employee {

	public static void main(String[] args)throws Exception {
		Configuration config= new Configuration();
		config.configure("com/sb/test/hibernate.cfg.xml");
		SessionFactory sessionFactory= config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		TestClass ts = new TestClass();
		ts.setEno(104);
		ts.setEname("Rajeev");
		ts.setSal(5000);
		ts.setEaddr("Cnb");
		//int eno = (Integer)session.save(ts);
		session.persist(ts);
		tx.commit();
		System.out.println("Employee inserted successfully");
		/*tx.commit();
		if(eno==102) {
			System.out.println("Employee Record Inserted");
		}
		else {
			System.out.println("Employee insertion failur");
		}*/
		
		session.close();
		sessionFactory.close();
	}
}
