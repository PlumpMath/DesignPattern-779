package chain_of_responsibility;

public class BusinessMailHandler implements EmailHandler{
	
	private EmailHandler next;
	
	@Override
	public void setNext(EmailHandler emailHandler) {
		this.next = emailHandler;
	}

	@Override
	public void handleRequest(Email email) {
		if(!email.getFrom().equals("@businessaddress.com")){
			next.handleRequest(email);
		}else{
			System.out.println("BusinessMailHandler handle the request.......");
		}
	}

}
