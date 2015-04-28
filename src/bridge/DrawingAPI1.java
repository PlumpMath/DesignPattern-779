package bridge;

/** "ConcreteImplementor"  1/2 */
public class DrawingAPI1 implements DrawingAPI{
	@Override
	public void drawCircle(double x, double y, double radius) {
		System.out.println("DrawingAPI1.drawCircle x,y,radius" +"x:" + x + "y:" + y +"radius:" + radius);
	}
}
