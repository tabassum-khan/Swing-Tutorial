package graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class FillOval extends Panel{
	
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		System.out.println("Oval Panel");
		g2D.setPaint(Color.pink);
		g2D.setStroke(new BasicStroke(5));
		g2D.fillOval(450, 100, 300, 300);
	}
}
