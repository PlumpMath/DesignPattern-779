package abstract_factory;

public class MacOSXWindow implements Window{

	@Override
	public void setTitle(String text) {
		System.out.println("MacOSXWindow title:" + text);
		
	}

	@Override
	public void repaint() {
		System.out.println("MaxOSXWindow repaint()");
	}

}
