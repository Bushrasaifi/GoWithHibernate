 package com.rays.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public HibernateUtil() {	}
	public static SessionFactory getSessionFac()
	{
		return new Configuration().configure().buildSessionFactory();
	}

}
