package composite;

public class Program {
	
	public static void main(String[] args) {
		Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();
	        
        //Initialize three composite graphics
        CompositeGrapic graphic = new CompositeGrapic();
        CompositeGrapic graphic1 = new CompositeGrapic();
        CompositeGrapic graphic2 = new CompositeGrapic();
 
        //Composes the graphics
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);
 
        graphic2.add(ellipse4);
 
        graphic.add(graphic1);
        graphic.add(graphic2);
 
        //Prints the complete graphic (four times the string "Ellipse").
        graphic.print();
	}

}
