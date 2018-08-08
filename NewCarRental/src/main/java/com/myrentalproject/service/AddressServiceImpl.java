package com.myrentalproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myrentalproject.dao.AddressDao;

import com.myrentalproject.model.*;


@Service
@Transactional
public class AddressServiceImpl implements  AddressService {

	@Autowired
	AddressDao addao;
	
	
	
	public void  getAddao(AddressDao addao) {
		this.addao=addao;
	}

	

	@Override
	public void saveOrUpdate(int id,Address add) {
		
		addao.saveOrUpdate(id, add);
	
	}

	@Override
	public void deleteAddress(int id) {
		addao.deleteUser(id);
		
	}

	@Override
	public Address findById(int id) {
		
		return addao.findUserById(id);
		
	}

	@Override
	public boolean isUserUnique(Integer id, String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Address> ListAllAddress() {
		// TODO Auto-generated method stub
		return addao.listAllAddress();
	}

}
