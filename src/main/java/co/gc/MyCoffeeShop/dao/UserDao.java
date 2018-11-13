package co.gc.MyCoffeeShop.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.gc.MyCoffeeShop.User;


@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void create(User user) {
		String sql = "INSERT INTO users (firstname, lastname, email, phonenumber, birthday, newsletter, password) VALUES (?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, user.getFirstname(), user.getLastname(), user.getEmail(), user.getPhonenumber(), user.getBirthday(), user.getNewsletter(), user.getPassword());
	}

}
