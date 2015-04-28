package abstract_factory;

public class MacOSXWidgetFactory implements AbstractWidgetFactory{
	
	@Override
	public Window createWindow(){
		MacOSXWindow window = new MacOSXWindow();
		return window;
	}

}
