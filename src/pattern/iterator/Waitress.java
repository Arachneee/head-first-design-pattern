package pattern.iterator;

import java.util.*;

public class Waitress {

	List<Menu> menus;
 
	public Waitress(List<Menu> menus) {
		this.menus= menus;
	}
 
	public void printMenu() {
		Iterator<Menu> menuIterator = menus.iterator();
		while (menuIterator.hasNext()) {
			Menu menu = menuIterator.next();
			printMenu(menu.createIterator());
		}
	}
 
	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
 
//	public void printVegetarianMenu() {
//		printVegetarianMenu(pancakeHouseMenu.createIterator());
//		printVegetarianMenu(dinerMenu.createIterator());
//	}
//
//	public boolean isItemVegetarian(String name) {
//		Iterator breakfastIterator = pancakeHouseMenu.createIterator();
//		if (isVegetarian(name, breakfastIterator)) {
//			return true;
//		}
//		Iterator dinnerIterator = dinerMenu.createIterator();
//		if (isVegetarian(name, dinnerIterator)) {
//			return true;
//		}
//		return false;
//	}


	private void printVegetarianMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			if (menuItem.isVegetarian()) {
				System.out.print(menuItem.getName());
				System.out.println("\t\t" + menuItem.getPrice());
				System.out.println("\t" + menuItem.getDescription());
			}
		}
	}

	private boolean isVegetarian(String name, Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			if (menuItem.getName().equals(name)) {
				if (menuItem.isVegetarian()) {
					return true;
				}
			}
		}
		return false;
	}
}
