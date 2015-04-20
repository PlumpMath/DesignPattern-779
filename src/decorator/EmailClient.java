package decorator;

public class EmailClient {
	
	public static void main(String[] args) {
		EmailSender emailSender = new EmailSender();
		emailSender.sendEmail(new IEmail() {
			
			@Override
			public String getContents() {
				return "ºÚÉ«ÃÎÖĞ";
			}
		});
	}

}
