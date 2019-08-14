package com.phonebook.dao;

import com.phonebook.model.User;

public interface UserDAO {
	public void save(User user);
	public User loginCheck(User user);
}
