package com.myrentalproject.dao.userDao;

import java.util.List;

import com.myrentalproject.model.user.User;


public interface UserDao {

	public void saveOrUpdate(final User user);
    public void deleteUser(final int id);
	public User findUserById(final int id);
	public List<User> listAllUsers();
	


}
