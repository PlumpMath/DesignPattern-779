package flyweight;

public class ConcurrentWebSite extends WebSite{

	public ConcurrentWebSite(String type) {
		super(type);
	}

	@Override
	public void use(User user) {
	   System.out.println("The web site's type is: " + type);
       System.out.println("User: " + user.getUserName());
       System.out.println("Passwd: " + user.getPassword());
       System.out.println();
	}

}
