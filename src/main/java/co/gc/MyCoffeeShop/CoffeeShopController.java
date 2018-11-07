package co.gc.MyCoffeeShop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeShopController {
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/register")
	public ModelAndView register() {
		return new ModelAndView("register");
	}
	
	@RequestMapping("/summary")
	public ModelAndView summary(@RequestParam("firstName")String firstName, @RequestParam("lastName")String lastName,
			@RequestParam("email")String email, @RequestParam("phoneNumber")String phoneNumber, @RequestParam("birthday")String birthday,
			@RequestParam("password")String password) {
		ModelAndView mv = new ModelAndView("summary");
		mv.addObject("firstName", firstName);
		mv.addObject("lastName", lastName);
		mv.addObject("email", email);
		mv.addObject("phoneNumber", phoneNumber);
		mv.addObject("birthday", birthday);
		mv.addObject("password", password);
		return mv;
	}
}
