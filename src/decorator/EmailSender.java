package decorator;

public class EmailSender {
	
	public void sendEmail(IEmail iEmail){
		ExternalEmailDecorator external = new ExternalEmailDecorator(iEmail);
		System.out.println(external.getContents());
	}

}
