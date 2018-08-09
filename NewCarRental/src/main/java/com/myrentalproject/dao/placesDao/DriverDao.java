package com.myrentalproject.dao.placesDao;

import java.util.List;

import com.myrentalproject.model.user.Driver;
import com.myrentalproject.model.user.Employee;


public interface DriverDao {
	  public int save(final Driver driver);
	 	public boolean update(final Driver driver);
	 	public Employee find(final String id);
	 	public boolean Delete(final Driver driver);
	 	public List<Employee> findAll();
}
