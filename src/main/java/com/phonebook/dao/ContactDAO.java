package com.phonebook.dao;

import java.util.List;
import com.phonebook.model.Contact;

public interface ContactDAO {
	
	void save(Contact contact);
	public List<Contact> findAllContacts(int userId);
	public Contact findContact(int id, int userId);
	void update(Contact contact);
	public void delete(int id, int userId);
}
