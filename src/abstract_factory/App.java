package abstract_factory;

public class App {
	
	public static void main(String[] args) {
		GUIBuilder builder = new GUIBuilder();
		AbstractWidgetFactory widgetFactory  = null;
		widgetFactory = new MacOSXWidgetFactory();
		builder.buildWindow(widgetFactory);
	}

}
