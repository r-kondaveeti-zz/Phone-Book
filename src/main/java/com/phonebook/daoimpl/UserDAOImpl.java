package com.phonebook.daoimpl;

import java.util.HashMap;
import java.util.List;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.phonebook.dao.BaseDAO;
import com.phonebook.dao.UserDAO;
import com.phonebook.model.User;
import com.phonebook.util.UserRowMapper;

@Repository
public class UserDAOImpl extends BaseDAO implements UserDAO {
	
	public void save(User user) {
		String sql = "INSERT INTO users (first_name, last_name, email, password)" +
				"values (:first_name, :last_name, :email, :password)";
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("first_name", user.getFirst_name());
		map.put("last_name", user.getLast_name());
		map.put("email", user.getEmail());
		map.put("password", user.getPassword());		
		KeyHolder kh = new GeneratedKeyHolder(); //takes generated id from database, useful for rest apis		
		SqlParameterSource ps = new MapSqlParameterSource(map);
	    getNamedParameterJdbcTemplate().update(sql, ps,kh);
	}
	
	public User loginCheck(User user) {
		User returnUser = null;
		String sql = "SELECT * FROM users WHERE email='"+user.getEmail()+"'";
		List<User> list =  getNamedParameterJdbcTemplate().query(sql, new UserRowMapper());
		User userFromDb = (User) list.get(0);
		if(userFromDb.getPassword().equals(user.getPassword())) {
			return userFromDb;
		}
		else {
			return returnUser;
		}
	}
	
}
