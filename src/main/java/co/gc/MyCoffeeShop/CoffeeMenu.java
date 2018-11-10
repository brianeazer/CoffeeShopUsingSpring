package co.gc.MyCoffeeShop;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Component;


//I used singleton to centralize the menu, in other words, I only want one menu, to permit others from being created
@Component
public class CoffeeMenu {
	
	

	private List<MenuItem> list = new ArrayList<>();
	
	public CoffeeMenu() {
		list.add(new MenuItem("Cup of chino", "A cup of pants", 35.99));
		list.add(new MenuItem("Expresso", "For quickest results", 3.01));
		list.add(new MenuItem("Classic Coughfee", "Where it all started!", 2.51));
		list.add(new MenuItem("Kidz blend", "NO PARENTS ALLOWED-IT IS COFFEE FOR CHILDREN", 3.00));
		list.add(new MenuItem("Pineapple coffee", "Coffee with pineapple on the side", 6.01));
		list.add(new MenuItem("Tearjerker", "Possibly the worst", 1.23));
		list.add(new MenuItem("Hot coffee bath", "We will give you a hot coffee bath", 30.01));
	}
	
	public List<MenuItem> getAllMenuItems() {
		return list;
	}
	
	public List<MenuItem> getMenuItemsByKeyword(String keyword) {
		keyword = keyword.toLowerCase();
		List<MenuItem> matches = new ArrayList<>();
		for(MenuItem menuItem : list) {
			if (menuItem.getName().toLowerCase().contains(keyword)) {
				matches.add(menuItem);
			}
		}
		return matches;
	}

	public void addMenuItem(MenuItem menuItem) {
		list.add(menuItem);
	}
}
