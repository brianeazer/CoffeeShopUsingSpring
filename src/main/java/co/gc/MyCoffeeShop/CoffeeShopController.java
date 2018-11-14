package co.gc.MyCoffeeShop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.gc.MyCoffeeShop.dao.MenuItemDao;
import co.gc.MyCoffeeShop.dao.UserDao;
import co.grandcircus.foodsorm.entity.Food;


@Controller
public class CoffeeShopController {
	
	@Autowired
	private MenuItemDao menuItemDao;
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/register")
	public ModelAndView register() {
		return new ModelAndView("register");
	}
	
	@RequestMapping("/summary")
	public ModelAndView summary(User user, @RequestParam(name="box", required=false) boolean box) {
		ModelAndView mv = new ModelAndView("summary");
		userDao.create(user);
		mv.addObject("user", user);
		return mv;
	}
	
	@RequestMapping("/menu")
	public ModelAndView menu() {
		ModelAndView mv = new ModelAndView("menu");
		System.out.println("Test1");
		List<MenuItem> menu = menuItemDao.findAll();
		System.out.println("Test2");

		mv.addObject("menu", menu);
		return mv;
	}
	@RequestMapping("/single")
	public ModelAndView viewSingle(@RequestParam("searchname") String searchname) {
		MenuItem menuItem = menuItemDao.findByName(searchname);
		List<MenuItem> menu = new ArrayList<>();
		if (menuItem == null) {
			ModelAndView mv = new ModelAndView("menu");
			String error = "No results found";
			return mv.addObject("error", error);
		}
		menu.add(menuItem);
		ModelAndView mav = new ModelAndView("menu");
		mav.addObject("menu", menu);
		return mav;
	}
	@RequestMapping("/admin/menu")
	public ModelAndView adminMenu() {
		ModelAndView mv = new ModelAndView("menu");
		List<MenuItem> menu = menuItemDao.findAll();
		boolean admin = true;
		mv.addObject("menu", menu);
		mv.addObject("admin", admin);
		return mv;
	}
	@RequestMapping("/menu/delete")
	public ModelAndView delete(@RequestParam("id") Long id) {
		menuItemDao.delete(id);
		return new ModelAndView("redirect:/admin/menu");
	}
	@RequestMapping("/menu/edit")
	public ModelAndView showEditForm(@RequestParam("id") Long id) {
		ModelAndView mav = new ModelAndView("item");
		mav.addObject("menuItem", menuItemDao.findById(id));
		System.out.println("test");
		mav.addObject("title", "Edit Menu Item");
		return mav;
	}
	
	// same URL but different method
	@RequestMapping(value="/menu/edit", method=RequestMethod.POST)
	public ModelAndView submitEditForm(MenuItem menuItem) {
		menuItemDao.update(menuItem);
		return new ModelAndView("redirect:/admin/menu");
	}
	@RequestMapping("/menu/create")
	public ModelAndView showCreateForm() {
		// If there is only one model value to add, use this one-line shortcut. Equivalent to
		// ModelAndView mav = new ModelAndView("food-form");
		// mav.addObject("title", "Add a Food");
		return new ModelAndView("item", "title", "Add a Food");
	}
	
	@RequestMapping(value="/menu/create", method=RequestMethod.POST)
	public ModelAndView submitCreateForm(MenuItem menuItem) {
		menuItemDao.create(menuItem);
		return new ModelAndView("redirect:/admin/menu");
	}
	
}
