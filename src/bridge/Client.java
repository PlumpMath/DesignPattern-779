package bridge;

public class Client {
	
	public static void main(String[] args) {
		Shape[] shapes = new Shape[]{
				new CircleShape(1,3,5,new DrawingAPI1()),
				new CircleShape(2,8,10,new DrawingAPI2())
		};
		
		for(Shape shape : shapes){
			shape.resizeByPercentage(2.5);
			shape.draw();
		}
	}

}
