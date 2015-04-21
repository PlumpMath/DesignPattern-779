package visitor;

public interface ICarElementVisitor {
	public void visit(Wheel wheel);
	public void visit(Engine engine);
	public void visit(Body body);
	public void visit(Car car);

}
