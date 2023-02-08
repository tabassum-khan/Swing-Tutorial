package graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class FillArc extends Panel{
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		System.out.println("Oval Panel");
		g2D.setPaint(Color.pink);
		g2D.setStroke(new BasicStroke(5));
		g2D.fillArc(400, 100, 300, 300, 0, 180);
		g2D.setPaint(Color.red);
		g2D.fillArc(400, 100, 300, 300, 180, 180);
	}
}
