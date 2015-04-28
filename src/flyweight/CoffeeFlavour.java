package flyweight;

public class CoffeeFlavour {
	private final String name;
	CoffeeFlavour(String newFlavour){
		this.name = newFlavour;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
