package Strategy;

import java.io.File;
import java.util.ArrayList;

public class Client {
	
	public static void main(String[] args) {
		CompressionContext context = new CompressionContext();
		context.setCompressionStrategy(new ZipCompresssionStrategy());
		context.createArchive(new ArrayList<File>());
	}

}
