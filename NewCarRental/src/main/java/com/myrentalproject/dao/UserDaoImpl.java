package com.myrentalproject.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myrentalproject.model.User;

@Repository//@Repository annotation is a marker for any class that fulfills the role or stereotype (also known as Data Access Object or DAO) of a repository
public class UserDaoImpl  implements UserDao {

	@Autowired
	private  SessionFactory sessionFactory;
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void saveOrUpdate(User user) {
		getSession().saveOrUpdate(user);		
		
	}

	public void deleteUser(int id) {
		User user=(User)getSession().get(User.class, id);
		getSession().delete(user);
	}

	public User findUserById(int id) {
		User user=(User)getSession().get(User.class,id);
		
		return user;
	}

	@SuppressWarnings("unchecked")
	public List listAllUsers() {
		
		Criteria criteria=getSession().createCriteria(User.class);
		return (List)criteria.list();
	}

	
		
}
