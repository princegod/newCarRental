package com.myrentalproject.dao.userDao;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myrentalproject.model.user.Address;


@Repository
public class AddressDaoImpl implements AddressDao {
	
	@Autowired
	private SessionFactory sessionfactory;

	public Session getsession() {
		
		return sessionfactory.getCurrentSession();
	}
	@Override
	public void saveOrUpdate(Address add) {
		
		getsession().saveOrUpdate(add);
		
	}

	@Override
	public void deleteUser(int id) {
	
		Address add=(Address)getsession().get(Address.class,id);
		getsession().delete(add);
		
	}

	@Override
	public Address findUserById(int id) {
	
		Address add=(Address)getsession().get(Address.class, id);
		return add;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Address> listAllAddress() {
		Criteria criteria=getsession().createCriteria(Address.class);
		
		return criteria.list();
	}

}
