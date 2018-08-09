package com.myrentalproject.service.userService;

import java.util.List;

import com.myrentalproject.model.user.Address;



public interface AddressService {
	public void saveOrUpdate(Address address);
	public void deleteAddress(int id);
	public Address findById(int id);
	boolean isUserUnique(Integer id,String username);
	public List<Address> ListAllAddress();
    
	

}
