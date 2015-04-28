package proxy;

import java.net.URL;

public class RealImage implements Image{

	public RealImage(URL url){
		loadImage(url);
	}
	
	private void loadImage(URL url) {
		System.out.println("load image...");
	}
	@Override
	public void displayImage() {
		System.out.println("display image....");
	}
}
