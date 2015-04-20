package chain_of_responsibility;

public interface EmailHandler {
	
	public void setNext(EmailHandler emailHandler);
	
	public void handleRequest(Email email);
}
