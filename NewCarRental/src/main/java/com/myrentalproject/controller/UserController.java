package com.myrentalproject.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myrentalproject.model.user.User;
import com.myrentalproject.service.userService.AddressService;
import com.myrentalproject.service.userService.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	UserService userservice;
	
	@Autowired
	AddressService addressservice;
	
	@Autowired
	MessageSource messageSource;
	
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView list(){
		ModelAndView model=new ModelAndView("user/userlist");
		List<User> list=userservice.ListAllUser();
		model.addObject("list",list);
		
		return model;
		
		}
 
  
	//this method will provide the medium to add a new user
	@RequestMapping(value="/add",method= RequestMethod.GET)
    public ModelAndView add(){
		ModelAndView model=new ModelAndView("user/userform");
		User user=new User();
		model.addObject("userForm", user);
     	return model;	
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("userFrom") User user) {
		
		userservice.saveOrUpdate(user);
	
	
		return new  ModelAndView("redirect:/user/list");
	}

	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("id") int id){
		userservice.deleteUser(id);
	  
	  return new ModelAndView("redirect:/user/list");
	 }
	
	@RequestMapping(value="/update/{id}",method=RequestMethod.GET)
	public ModelAndView update(@PathVariable("id") int id) {
		
		ModelAndView model=new ModelAndView("user/form");
		User user=userservice.findById(id);
		model.addObject("userForm",user);
	 return model;
	}
	
}
	
	
	
	
		

