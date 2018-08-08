package com.myrentalproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myrentalproject.dao.UserDao;
import com.myrentalproject.model.User;


@Service
@Transactional
public class UserServiceImpl  implements UserService{
   
    UserDao userdao;
    @Autowired
    public void setUserDao(UserDao userdao ) {
    	this.userdao=userdao;
    }

	public void saveOrUpdate(User user) {
		userdao.saveOrUpdate(user);
	}

	public void deleteUser(int id) {
		userdao.deleteUser(id);
   }
	

	public User findById(int id) {
		
        return userdao.findUserById(id);
	}

	public boolean isUserUnique(Integer id, String username) {
		
		return false;
	}

	public List ListAllUser() {
		
		return userdao.listAllUsers();
	}
	
   
}
