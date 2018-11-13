package co.gc.MyCoffeeShop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.gc.MyCoffeeShop.dao.MenuItemDao;
import co.gc.MyCoffeeShop.dao.UserDao;



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
		List<MenuItem> menu = menuItemDao.findAll();
		mv.addObject("menu", menu);
		return mv;
	}
	@RequestMapping("/single")
	public ModelAndView viewSingle(@RequestParam("searchname") String searchname) {
		ModelAndView mv = new ModelAndView("single");
		MenuItem menuItem = menuItemDao.findByName(searchname);
		mv.addObject("item", menuItem);
		return mv;
	}
	
}
