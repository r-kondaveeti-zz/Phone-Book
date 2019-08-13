package com.phonebook.util;
 
import java.sql.ResultSet;
import java.sql.SQLException;
 
import org.springframework.jdbc.core.RowMapper;
 
import com.phonebook.model.Contact;
 
public class ContactRowMapper implements RowMapper {
 
    public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
        Contact contact = new Contact();
        contact.setId(rs.getInt("id"));
        contact.setFirst_name(rs.getString("first_name"));
        contact.setLast_name(rs.getString("last_name"));
        contact.setEmail(rs.getString("email"));
        contact.setPhonenumber(rs.getInt("phonenumber"));
        contact.setUser_id(rs.getInt("user_id"));
 
        return contact;
    }
}