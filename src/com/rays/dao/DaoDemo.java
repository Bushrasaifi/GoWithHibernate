package com.rays.dao;


import java.util.List;

import com.rays.pojo.User;

public interface DaoDemo {
	
	public <K> boolean create(K obj);
	public List<User> showAll();
	

}
