package com.phonebook.dao;

import java.util.List;
import com.phonebook.model.Contact;

public interface ContactDAO {
	
	void save(Contact contact);
	List<Contact> findAllContacts();
	Contact findContact(int id);
	void update(Contact contact);
}
