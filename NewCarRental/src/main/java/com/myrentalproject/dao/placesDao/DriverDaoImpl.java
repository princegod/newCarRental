package com.myrentalproject.dao.placesDao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.myrentalproject.model.user.Driver;
import com.myrentalproject.model.user.Employee;

public class DriverDaoImpl implements DriverDao{
	
	@Autowired
	private SessionFactory sessionfactory;

	public Session getsession() {
		
		return sessionfactory.getCurrentSession();
	}

	@Override
	public int save(Driver driver) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean update(Driver driver) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean Delete(Driver driver) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


}
