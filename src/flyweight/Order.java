package flyweight;

public class Order {
	private final int tableNumber;
	private final CoffeeFlavour flavour;
	
	public Order(int tableNumber,CoffeeFlavour coffeeFlavour){
		this.tableNumber = tableNumber;
		this.flavour = coffeeFlavour;
	}
	
	public void serve(){
		System.out.println("Serving " + flavour +"to table" + tableNumber);
	}

}
