package template_method;

public class Client {
	public static void main(String[] args) {
		CrossCompiler c1 = new IPhoneCompiler();
		c1.crossCompil();
		CrossCompiler c2 = new AndroidCompiler();
		c2.crossCompil();
	}

}
