package com.myrentalproject.service;

import java.util.List;

import com.myrentalproject.model.Address;


public interface AddressService {
	public void saveOrUpdate(Address address);
	public void deleteAddress(int id);
	public Address findById(int id);
	boolean isUserUnique(Integer id,String username);
	public List<Address> ListAllAddress();
    
	

}
