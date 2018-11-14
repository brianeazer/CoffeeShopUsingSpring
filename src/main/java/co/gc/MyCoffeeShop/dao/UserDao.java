package co.gc.MyCoffeeShop.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


import org.springframework.stereotype.Repository;

import co.gc.MyCoffeeShop.User;



@Repository
@Transactional
public class UserDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void create(User user) {
		em.persist(user);
	}

}
