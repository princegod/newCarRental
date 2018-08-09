package com.myrentalproject.service.userService;

import java.util.List;

import com.myrentalproject.model.user.User;


public interface UserService {
	public void saveOrUpdate(User add);
	public void deleteUser(int id);
	public User findById(int id);
	boolean isUserUnique(Integer id,String username);
	public List<User> ListAllUser();
    
	

}
