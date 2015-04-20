package chain_of_responsibility;

public class GmailMailHandler implements EmailHandler{

	private EmailHandler next;
	@Override
	public void setNext(EmailHandler emailHandler) {
		next = emailHandler;
	}

	@Override
	public void handleRequest(Email email) {
		if(!email.getFrom().equals("@gmail.com")){
			next.handleRequest(email);
		}else{
			System.out.println("GmailMailHandler handle the request......");
		}
	}

}
