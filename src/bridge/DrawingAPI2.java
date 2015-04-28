package bridge;

/** "ConcreteImplementor" 2/2 */
public class DrawingAPI2 implements DrawingAPI{
	@Override
	public void drawCircle(double x, double y, double radius) {
		System.out.println("DrawingAPI2.drawCircle x,y,radius" +"x:" + x + "y:" + y +"radius:" + radius);
	}

}
