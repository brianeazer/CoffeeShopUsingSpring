package co.gc.MyCoffeeShop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.gc.MyCoffeeShop.MenuItem;
import co.grandcircus.foodsorm.entity.Food;


@Repository
@Transactional
public class MenuItemDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<MenuItem> findAll() {
		return em.createQuery("FROM MenuItem", MenuItem.class).getResultList();
	}
	public MenuItem findById(Long id) {
		return em.find(MenuItem.class, id);
	}

	public void delete(Long id) {
		// Deleting with Hibernate entity manager requires fetching a reference first.
		MenuItem menuItem = em.getReference(MenuItem.class, id);
		em.remove(menuItem);
	}
	public MenuItem findByName(String searchname) {
		// TODO Auto-generated method stub
		return null;
	}
	public void update(MenuItem menuItem) {
		em.merge(menuItem);
	}
	public void create(MenuItem menuItem) {
		em.persist(menuItem);
	}
}