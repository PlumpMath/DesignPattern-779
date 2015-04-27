package composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeGrapic implements Graphic{
	
	private List<Graphic> chidGraphics = new ArrayList<Graphic>();

	@Override
	public void print() {
		for(Graphic graphic : chidGraphics){
			graphic.print();
		}
	}
	
	public void add(Graphic graphic){
		chidGraphics.add(graphic);
	}
	
	public void remove(Graphic graphic){
		chidGraphics.remove(graphic);
	}

}
