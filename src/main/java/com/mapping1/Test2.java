package com.mapping1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		
		Session session = sessionFactory.openSession();
		
		Employee emp = (Employee) session.get(Employee.class, 1);
		System.out.println(" "+emp.getName()+" "+emp.getAddress()+" "+emp.getBankaccount());
		
		session.update(emp);
		session.close();
		System.out.println(" Record Added Successfully");
	}

}
