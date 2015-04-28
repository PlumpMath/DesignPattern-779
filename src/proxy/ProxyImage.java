package proxy;

import java.net.URL;

public class ProxyImage implements Image{

	private URL url;
	
	public ProxyImage(URL url){
		this.url = url;
	}
	
	@Override
	public void displayImage() {
		RealImage real = new RealImage(url);
		real.displayImage();
		
	}

}
