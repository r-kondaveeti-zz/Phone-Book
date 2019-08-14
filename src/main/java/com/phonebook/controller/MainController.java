package com.phonebook.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.phonebook.daoimpl.ContactDAOImpl;
import com.phonebook.model.Contact;
import com.phonebook.model.User;

@Controller
public class MainController {
	
	@Autowired
	private ContactDAOImpl daoimpl;
	
	@RequestMapping("/save")
	public String save(@ModelAttribute("contact") Contact contact, @SessionAttribute("user") User user) {
		contact.setUser_id(user.getId());
		daoimpl.save(contact);
		return "redirect:/listAllContacts";
	}
	
	
	@RequestMapping("/listAllContacts")
	public String listAllContacts(ModelMap map, @SessionAttribute("user") User user) {
		map.addAttribute("userId", user.getId());
		map.addAttribute("contacts", daoimpl.findAllContacts(user.getId()));
		return "list";
	}
	
	@RequestMapping("/viewContact")
	public String viewContact(@RequestParam("id") int contactId, ModelMap map) {
		map.addAttribute("contact", daoimpl.findContact(contactId, (Integer) map.get("userId")));
		return "editContact";
	}
	
	@RequestMapping("/updateContact")
	public String updateContact(@ModelAttribute("contact") Contact contact, ModelMap map) {
		daoimpl.update(contact);
		map.addAttribute("contacts", daoimpl.findAllContacts((Integer) map.get("userId")));
		return "list";
	}
	
	@RequestMapping("/deleteContact")
	public String deleteContact(@RequestParam("id") int contactId, ModelMap map) {
		daoimpl.delete(contactId, (Integer) map.get("userId"));
		return "redirect:/listAllContacts";
	}
	
	@RequestMapping("/")
	public String registration() {
		return "registration";
	}
	
	@RequestMapping("/addContact")
	public String addContact() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
}

