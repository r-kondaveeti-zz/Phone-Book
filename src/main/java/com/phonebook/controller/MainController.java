package com.phonebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.phonebook.daoimpl.ContactDAOImpl;
import com.phonebook.model.Contact;

@Controller
public class MainController {
	
	@Autowired
	private ContactDAOImpl daoimpl;
	
	@RequestMapping("/save")
	public String save(@ModelAttribute("contact") Contact contact) {
		contact.setUser_id(01);
		daoimpl.save(contact);
		return "welcome";
	}
	
	
	@RequestMapping("/listAllContacts")
	public String listAllContacts(ModelMap map) {
		map.addAttribute("contacts", daoimpl.findAllContacts());
		return "list";
	}
	
	@RequestMapping("/viewContact")
	public String viewContact(@RequestParam("id") int contactId, ModelMap map) {
		map.addAttribute("contact", daoimpl.findContact(contactId));
		return "editContact";
	}
	
	@RequestMapping("/updateContact")
	public String updateContact(@ModelAttribute("contact") Contact contact, ModelMap map) {
		daoimpl.update(contact);
		System.out.println(contact.getLast_name());
		map.addAttribute("contacts", daoimpl.findAllContacts());
		return "list";
	}
	
}

