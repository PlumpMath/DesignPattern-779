package Strategy;

import java.io.File;
import java.util.ArrayList;

public class ZipCompresssionStrategy implements CompressionStrategy{

	@Override
	public void compressFiles(ArrayList<File> files) {
		//using ZIP approach
		System.out.println("use zip compression.....");
	}
	

}
