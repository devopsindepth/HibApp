package com.mtc.app.vo;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mtc.app.conf.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session  session = sessionFactory.openSession();
//		productLines prod = session.get(productLines.class, "Ships");
//		System.out.println(prod);
//		
//		System.out.println("product details \n");
////		OrderDetails orderDetails = session.get(OrderDetails.class, "orderNumber");
//		Set<Products> products = prod.getProducts();
//		products.forEach(System.out::println);
		
		Customers customer= session.get(Customers.class, 103);
		System.out.println(customer);
		System.out.println(customer.getEmployees());
		Employees empl = customer.getEmployees();
		System.out.println(empl.getOffices());		
		
		
		session.close();
		sessionFactory.close();
	}

}
