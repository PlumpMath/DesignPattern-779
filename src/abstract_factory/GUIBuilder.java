package abstract_factory;

public class GUIBuilder {
	
	public void buildWindow(AbstractWidgetFactory widgetFactory){
		Window  window = widgetFactory.createWindow();
		window.setTitle("NEW WINDOW");
	}

}
