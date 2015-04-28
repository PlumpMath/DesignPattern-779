package flyweight;

import java.util.HashMap;
import java.util.Map;

public class Menu {

	private Map<String,CoffeeFlavour> flavours 
	= new HashMap<String,CoffeeFlavour>();
	
	public CoffeeFlavour lookup(String flavourName){
		if(!flavours.containsKey(flavourName)){
			flavours.put(flavourName, new CoffeeFlavour(flavourName));
		}
		return flavours.get(flavourName);
	}
	
	public int totalCoffeeFlavoursMade(){
		return flavours.size();
	}
}
