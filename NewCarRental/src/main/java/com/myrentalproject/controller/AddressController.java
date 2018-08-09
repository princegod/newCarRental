package com.myrentalproject.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.myrentalproject.model.user.Address;
import com.myrentalproject.model.user.User;
import com.myrentalproject.service.userService.AddressService;
import com.myrentalproject.service.userService.UserService;

@Controller
@RequestMapping(value="/address")
public class AddressController {
	@Autowired
	UserService userservice;
	@Autowired
	AddressService addressservice;
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView model=new ModelAndView("address/addresslist");
		List<Address> list=addressservice.ListAllAddress();
		return model;
		
		
	}
	
	@RequestMapping(value="/addAddress/{id}",method=RequestMethod.GET)
	public ModelAndView addAddress(@PathVariable("id") int id) {
	
		ModelAndView model=new ModelAndView("address/addressform");//address of ur form
		Address address=new Address();
		address.setId(id);
	
		model.addObject("addressForm", address);//contain modelattribute and refernce of model class
		
		return model;
	}
	
	
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("addressFrom") Address address) {
		addressservice.saveOrUpdate(address);
	    return new  ModelAndView("redirect:/address/list");//path of your method in your address class
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
