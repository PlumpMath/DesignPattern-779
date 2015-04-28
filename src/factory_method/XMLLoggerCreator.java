package factory_method;

public class XMLLoggerCreator extends AbstractLoggerCreator{

	@Override
	public Logger createLogger() {
		XMLLogger logger = new XMLLogger();
		return logger;
	}

}
