package com.phonebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.phonebook.daoimpl.UserDAOImpl;
import com.phonebook.model.User;

@Controller
@SessionAttributes("user")
public class UserController {
	
	@Autowired
	private UserDAOImpl daoimpl;
	
	@RequestMapping("/register")
	public String register(@ModelAttribute("user") User user) {
		daoimpl.save(user);
		return "registered";
	}
	
	@RequestMapping("/loginUser")
	public String loginUser(@ModelAttribute("user") User user, ModelMap map) {
		User userFromDb = daoimpl.loginCheck(user);
		map.addAttribute("user", userFromDb);
		return "redirect:/listAllContacts?id="+userFromDb.getId();
	}
	
	@ModelAttribute("user")
	public User populateForm() {
	    return new User();
	}
		
}
