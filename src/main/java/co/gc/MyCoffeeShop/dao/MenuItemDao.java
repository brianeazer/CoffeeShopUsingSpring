package co.gc.MyCoffeeShop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.gc.MyCoffeeShop.MenuItem;

@Repository
public class MenuItemDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<MenuItem> findAll() {
		return jdbcTemplate.query("SELECT * FROM coffeetable", new BeanPropertyRowMapper<>(MenuItem.class));
	}
	
	public MenuItem findByName(String name) {
		return jdbcTemplate.queryForObject("SELECT * FROM coffeetable WHERE name = ?",
				new BeanPropertyRowMapper<>(MenuItem.class), name);
	}
}