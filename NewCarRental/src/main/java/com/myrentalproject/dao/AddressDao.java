package com.myrentalproject.dao;
import java.util.List;
import com.myrentalproject.model.Address;

public interface AddressDao {
	public void saveOrUpdate(final Address add);
    public void deleteUser(final int id);
	public Address findUserById(final int id);
	public List<Address> listAllAddress();

}
