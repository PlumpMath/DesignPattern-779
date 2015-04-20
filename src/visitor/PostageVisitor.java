package visitor;

public class PostageVisitor implements Visitor{

	private double totalPostageForCart;
	@Override
	public void visit(Book book) {
		
	}

	@Override
	public void visit(CD cd) {
		
	}

	@Override
	public void visit(DVD dvd) {
		
	}
	
	public double getTotalPostage(){
		return totalPostageForCart;
	}
}
