package graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class CreateString extends Panel{
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		System.out.println("String Panel");
		g2D.setPaint(Color.pink);
		g2D.setStroke(new BasicStroke(5));
		g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
		g2D.drawString("Hey, You have done it! : )", 300, 200);
	}
}
