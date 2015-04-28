package factory_method;

public class Client {
	
	private void log(AbstractLoggerCreator logCreator){
		Logger logger = logCreator.createLogger();
		logger.log("MESSAGE");
	}
	
	
	public static void main(String[] args) {
		AbstractLoggerCreator creator = new XMLLoggerCreator();
		Client client = new Client();
		client.log(creator);
	}

}
