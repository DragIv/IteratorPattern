package Cafe.withCafe;


import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
	ArrayList<Menu> menus;


	public Waitress(ArrayList<Menu> menus) {
		this.menus = menus;
	}



	public void print() {
		for (Menu menu : menus) {
			printMenu(menu.createIterator());
		}
	}

	void printMenu(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
