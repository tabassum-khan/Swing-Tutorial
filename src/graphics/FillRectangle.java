package graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class FillRectangle extends JPanel{
	FillRectangle(){
		this.setPreferredSize(new Dimension(1200, 450));
		this.setBackground(Color.red);
	}
	
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		System.out.println("Rectangle Panel");
		g2D.setPaint(Color.pink);
		g2D.setStroke(new BasicStroke(5));
		g2D.fillRect(450, 100, 300, 300);
	}
}
