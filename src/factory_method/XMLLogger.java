package factory_method;

public class XMLLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("message is:" + message);
		System.out.println("logging....");
	}

}
