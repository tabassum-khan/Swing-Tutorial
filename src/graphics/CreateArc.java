package graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class CreateArc extends Panel{
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		System.out.println("Oval Panel");
		g2D.setPaint(Color.pink);
		g2D.setStroke(new BasicStroke(5));
		g2D.drawArc(200, 100, 300, 400, 0, 180);
		g2D.drawArc(600, 100, 300, 200, 0, 270);
	}
}
