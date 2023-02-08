package graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class LinePanel extends Panel{
	
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		
			System.out.println("Line Panel");
			g2D.setPaint(Color.blue);
			g2D.setStroke(new BasicStroke(5));
			g2D.drawLine(0,  0, 1200, 450);
	}
}
