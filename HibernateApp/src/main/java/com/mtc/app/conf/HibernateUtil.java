package com.mtc.app.conf;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.persistence.criteria.Order;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.mtc.app.vo.Customers;
import com.mtc.app.vo.Employees;
import com.mtc.app.vo.Offices;
import com.mtc.app.vo.OrderDetails;
import com.mtc.app.vo.Orders;
import com.mtc.app.vo.Payments;
import com.mtc.app.vo.Products;
import com.mtc.app.vo.productLines;

public class HibernateUtil {
	private static final SessionFactory SESSION_FACTORY;
	static {
		Configuration configuration = new Configuration();
		configuration.configure();
		
		configuration.addAnnotatedClass(Products.class);
		configuration.addAnnotatedClass(productLines.class);
		configuration.addAnnotatedClass(Orders.class);
		configuration.addAnnotatedClass(OrderDetails.class);
		configuration.addAnnotatedClass(Customers.class);
		configuration.addAnnotatedClass(Payments.class);
		configuration.addAnnotatedClass(Employees.class);
		configuration.addAnnotatedClass(Offices.class);
		
		
		ServiceRegistry serviceRegistry =  new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SESSION_FACTORY = configuration.buildSessionFactory(serviceRegistry);
		
	}
	
	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}

}
