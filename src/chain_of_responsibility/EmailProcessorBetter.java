package chain_of_responsibility;

public class EmailProcessorBetter {
	private EmailHandler first;
	private EmailHandler successor;
	
	public void addHandler(EmailHandler emailHandler){
		if(first == null){
			this.first = emailHandler;
		}else{
			this.successor.setNext(emailHandler);
		}
		this.successor = emailHandler;
	}
	
	
	public void handleRequest(Email email){
		first.handleRequest(email);
	}

}
