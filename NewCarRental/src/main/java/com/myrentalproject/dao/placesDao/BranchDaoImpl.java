package com.myrentalproject.dao.placesDao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.myrentalproject.model.places.Branch;
import com.myrentalproject.model.user.User;


public class BranchDaoImpl implements BranchDao{

	@Autowired
	private SessionFactory sessionfactory;

	public Session getsession() {
		
		return sessionfactory.getCurrentSession();
	}
	
	@Override
	public void saveorupdate(Branch branch) {
		
		getsession().saveOrUpdate(branch);;
	}

	@Override
	public boolean update(Branch branch) {
		
		return false;
	}

	@Override
	public Branch findBranchById(int id) {
		Branch branch=(Branch)getsession().get(Branch.class, id);
				
				return branch;
	}

	@Override
	public void DeleteBranch(int id) {
		Branch branch=(Branch)getsession().get(Branch.class,id);
		getsession().delete(branch);
	}

	@Override
	public List<Branch> listAllbranch() {
	
		Criteria criteria=getsession().createCriteria(User.class);
		return (List)criteria.list();
	}

	
	
}
