package tutorial;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow extends JFrame{
	
	JFrame frame = new JFrame();
	
	CreateImage c = new CreateImage();
	ImageIcon win_icon = c.createImageIcon("../assets/nerd.png", "New Window Icon");
	MyLabel label1 = new MyLabel("Label 1", null);
	MyLabel label2 = new MyLabel("Label 2", null);
	MyLabel label3 = new MyLabel("Label 3", null);
	MyLabel label4 = new MyLabel("Label 4", null);
	MyLabel label5 = new MyLabel("Label 5", null);
	
	JLabel l1 = label1.getLabel();
	JLabel l2 = label2.getLabel();
	JLabel l3 = label3.getLabel();
	JLabel l4 = label4.getLabel();
	JLabel l5 = label5.getLabel();
	
//	Border blackline = BorderFactory.createLineBorder(Color.black);
	
	public NewWindow(){
		l1.setPreferredSize(new Dimension(100, 100));
		l2.setPreferredSize(new Dimension(100, 100));
		l3.setPreferredSize(new Dimension(100, 100));
		l4.setPreferredSize(new Dimension(100, 100));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("New Window");
		frame.setLayout(new BorderLayout());
		
		l1.setBackground(Color.red);
		l2.setBackground(Color.blue);
		l3.setBackground(Color.darkGray);
		l4.setBackground(Color.green);
		l5.setBackground(Color.yellow);
		
		
		frame.add(l1, BorderLayout.NORTH);
		frame.add(l2, BorderLayout.EAST);
		frame.add(l3, BorderLayout.SOUTH);
		frame.add(l4, BorderLayout.WEST);
		frame.add(l5, BorderLayout.CENTER);
		
		
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
}
