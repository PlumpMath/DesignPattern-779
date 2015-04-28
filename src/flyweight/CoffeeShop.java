package flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CoffeeShop {
	private final List<Order> orders = new CopyOnWriteArrayList<Order>();
	private final Menu menu = new Menu();
	
	public void takeOrder(String flavourName,int table){
		CoffeeFlavour flavour = menu.lookup(flavourName);
		Order order = new Order(table,flavour);
		orders.add(order);
	}

	public void service(){
		for(Order order : orders){
			order.serve();
			orders.remove(order);
		}
	}
	
	public String report(){
		return "\n total CoffeeFlavour objects made:" + menu.totalCoffeeFlavoursMade();
	}
	
	public static void main(String[] args) {
		CoffeeShop shop = new CoffeeShop();
		shop.takeOrder("Cappuccino", 2);
		shop.takeOrder("Cappuccino", 121);
		shop.takeOrder("Cappuccino", 3);
		shop.takeOrder("Cappuccino", 97);
	    shop.takeOrder("Espresso", 1);
	    shop.takeOrder("Espresso", 3);
	    shop.takeOrder("Espresso", 96);
	    shop.takeOrder("Espresso", 121);
	    shop.takeOrder("Frappe", 552);
	    shop.takeOrder("Frappe", 1);
	    shop.takeOrder("Frappe", 897);
	    shop.takeOrder("Frappe", 3);
	    shop.service();
	    System.out.println(shop.report());
	}
}
