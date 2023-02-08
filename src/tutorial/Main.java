package tutorial;

import java.awt.Color;

import javax.swing.ImageIcon;

public class Main {
	
	public static void main(String[] args) {
		CreateImage c = new CreateImage();
		ImageIcon frame_icon = c.createImageIcon("../assets/logo.jpeg", "frame icon");
		
		FrameData data1 = new FrameData("Frame Example", 
				700, 700, frame_icon, new Color(123, 50, 250));
		
		MyFrame frame_exmaple = new MyFrame(data1);
		System.out.println("App is running...");
	}
}
