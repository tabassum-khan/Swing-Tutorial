package tutorial;

import java.awt.Color;

import javax.swing.ImageIcon;

public class FrameData {
	String name;
	int height;
	int width;
	ImageIcon icon;
	Color color;
	
	FrameData(String name, int height, int width, ImageIcon icon, Color color){
		this.name = name;
		this.height = height;
		this.width = width;
		this.icon = icon;
		this.color = color;
	}
}
