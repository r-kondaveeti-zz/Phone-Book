package com.phonebook.daoimpl;

import java.util.HashMap;
import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.phonebook.dao.BaseDAO;
import com.phonebook.dao.ContactDAO;
import com.phonebook.model.Contact;
import com.phonebook.util.ContactRowMapper;

@Repository
public class ContactDAOImpl extends BaseDAO implements ContactDAO {
	
	
	public void save(Contact contact) {
		String sql = "INSERT INTO contacts (first_name, last_name, phonenumber, email, user_id)" +
				"values (:first_name, :last_name, :phonenumber, :email, :user_id)";
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("first_name", contact.getFirst_name());
		map.put("last_name", contact.getLast_name());
		map.put("phonenumber", contact.getPhonenumber());
		map.put("email", contact.getEmail());
		map.put("user_id", contact.getUser_id());
		
		KeyHolder kh = new GeneratedKeyHolder(); //takes generated id from database, useful for rest apis
		
		SqlParameterSource ps = new MapSqlParameterSource(map);
	    getNamedParameterJdbcTemplate().update(sql, ps,kh);
	}
	
	
	public List<Contact> findAllContacts() {
		String sql = "SELECT * FROM contacts";		
		List<Contact> list =  getNamedParameterJdbcTemplate().query(sql, new ContactRowMapper());
		return list;
	}
	
	public Contact findContact(int id) {
		String sql = "SELECT * FROM contacts WHERE id="+id;
		List<Contact> list =  getNamedParameterJdbcTemplate().query(sql, new ContactRowMapper());
		return list.get(0);
	}
	
	public void update(Contact contact) {
		String sql = "UPDATE contacts SET first_name=:first_name, last_name=:last_name, phonenumber=:phonenumber, email=:email "
				+ "WHERE id="+contact.getId();
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("first_name", contact.getFirst_name());
		map.put("last_name", contact.getLast_name());
		map.put("phonenumber", contact.getPhonenumber());
		map.put("email", contact.getEmail());
		map.put("user_id", contact.getUser_id());
		System.out.println(contact.getLast_name());
		System.out.println(contact.getId());
		KeyHolder kh = new GeneratedKeyHolder(); //takes generated id from database, useful for rest apis
		
		SqlParameterSource ps = new MapSqlParameterSource(map);
	    getNamedParameterJdbcTemplate().update(sql, ps,kh);
	}
}
