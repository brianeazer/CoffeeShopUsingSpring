package co.gc.MyCoffeeShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.foods.FoodService;

@Controller
public class CoffeeShopController {
	
	@Autowired // This makes it so we never have to set this variable. The annotation makes it so Spring fills it in. It's called wiring. 
	//Wires things to other places. Enforces the singleton pattern
	CoffeeMenu coffeeMenu;
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
		mv.addObject("user", user);
		return mv;
	}
	
	@RequestMapping("/menu")
	public ModelAndView summary() {
		ModelAndView mv = new ModelAndView("menu");
		mv.addObject("menu", coffeeMenu.getAllMenuItems());
		return mv;
	}
}
