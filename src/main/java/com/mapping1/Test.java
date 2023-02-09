package com.mapping1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setName("Akash");
		emp.setAddress("pune");
		
		BankAccount bankaccount = new BankAccount();
		bankaccount.setType("NoAccount");
		
		emp.setBankaccount(bankaccount);
		
		session.save(emp);
		transaction.commit();
		session.close();
		System.out.println(" Record Added Successfully");
	}

}
