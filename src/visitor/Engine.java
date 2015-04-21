package visitor;

public class Engine implements ICarElement{

	@Override
	public void accept(ICarElementVisitor visitor) {
		visitor.visit(this);
	}

}
