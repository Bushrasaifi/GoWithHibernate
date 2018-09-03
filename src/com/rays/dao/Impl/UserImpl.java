package com.rays.dao.Impl;

import java.util.ArrayList;

import org.hibernate.Session;
import java.util.List;
import com.rays.dao.DaoDemo;
import com.rays.pojo.User;
import com.rays.util.HibernateUtil;

public class UserImpl implements DaoDemo
{

	public UserImpl() {
		
	// TODO Auto-generated constructor stub
	}

	@Override
	public <K>boolean create(K obj) {
		// TODO Auto-generated method stub
		boolean status=false;
		Session session=HibernateUtil.getSessionFac().openSession();
		try{
		
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();
		status=true;
		}catch (Exception e) {
			// TODO: handle exception
			session.getTransaction().rollback();
			status=false;
		}
		finally {
			session.close();
		}
		return status;
	}

	@Override
	public List<User> showAll() {
		// TODO Auto-generated method stub
		List<User> aD = new ArrayList<>();
		Session session=HibernateUtil.getSessionFac().openSession();
		try {
			aD=(List<User>)session.createQuery("FROM User").list();
		}catch (Exception e) {
			// TODO: handle exception
		}
		return aD;
	}


}
