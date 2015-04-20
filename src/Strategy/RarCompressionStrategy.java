package Strategy;

import java.io.File;
import java.util.ArrayList;

public class RarCompressionStrategy implements CompressionStrategy{

	@Override
	public void compressFiles(ArrayList<File> files) {
		// use rar compression
		System.out.println("use rar compression.....");
	}

}
