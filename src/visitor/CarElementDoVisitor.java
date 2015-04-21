package visitor;

public class CarElementDoVisitor implements ICarElementVisitor{

	// bound at run time.  second dispatch
	@Override
	public void visit(Wheel wheel) {
		System.out.println("Kicking my " + wheel.getName() +" wheel");
		
	}

	@Override
	public void visit(Engine engine) {
		System.out.println("Starting my engine...");
		
	}

	@Override
	public void visit(Body body) {
		System.out.println("moving my body...");
		
	}

	@Override
	public void visit(Car car) {
		System.out.println("Starting my car...");
		
	}

}
