package graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class FillPolygon extends Panel{
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		System.out.println("Create Polygon");
		g2D.setPaint(Color.pink);
		g2D.setStroke(new BasicStroke(5));
		int[] xPoints = {150, 250, 350};
		int[] yPoints = {300, 150, 300};
		g2D.fillPolygon(xPoints, yPoints, 3);
	}
}
