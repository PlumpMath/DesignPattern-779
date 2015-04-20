package chain_of_responsibility;

public class EmailClient {
	
	private EmailProcessorBetter processor;
	
	public EmailClient(){
		createProcessor();
	}

	private void createProcessor() {
		processor = new EmailProcessorBetter();
		processor.addHandler(new BusinessMailHandler());
		processor.addHandler(new GmailMailHandler());
	}
	
	public void addRule(EmailHandler emailHandler){
		processor.addHandler(emailHandler);
	}
	
	public void emailReceived(Email email){
		processor.handleRequest(email);
	}
	
	public static void main(String[] args) {
		EmailClient emailClient = new EmailClient();
	}
	

}
