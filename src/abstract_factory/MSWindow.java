package abstract_factory;

// ConcreteProductA1
public class MSWindow implements Window{

	@Override
	public void setTitle(String text) {
		System.out.println("MSWindow title:" + text);
	}

	@Override
	public void repaint() {
		System.out.println("MSWindow  start repaint()");
	}

}
