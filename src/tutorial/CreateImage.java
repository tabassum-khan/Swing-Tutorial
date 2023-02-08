package tutorial;

import java.awt.Image;

import javax.swing.ImageIcon;

public class CreateImage {
	
	protected ImageIcon createImageIcon(String path,String description) {
		java.net.URL imgURL = getClass().getResource(path);
		
		if (imgURL != null) {
		return new ImageIcon(imgURL, description);
		} else {
		System.err.println("Couldn't find file: " + path);
		return null;
		}
	}
	
	public ImageIcon resize(ImageIcon icon, int w, int h) {
		Image image = icon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(w, h,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		icon = new ImageIcon(newimg); 
		
		return icon;
	}
	
}
