package com.myrentalproject.service.userService;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myrentalproject.dao.userDao.AddressDao;
import com.myrentalproject.model.user.Address;



@Service
@Transactional
public class AddressServiceImpl implements  AddressService {

	@Autowired
	AddressDao addao;
	
	
	
	public void  getAddao(AddressDao addao) {
		this.addao=addao;
	}

	

	@Override
	public void saveOrUpdate(Address add) {
		
		addao.saveOrUpdate(add);
	
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
