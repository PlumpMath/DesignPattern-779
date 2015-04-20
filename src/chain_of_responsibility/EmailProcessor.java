package chain_of_responsibility;

public class EmailProcessor {
	private EmailHandler prevHandler;
	
	public void addHandler(EmailHandler emailHandler){
		if(prevHandler != null){
			prevHandler.setNext(emailHandler);
		}
		prevHandler = emailHandler;
	}

}
