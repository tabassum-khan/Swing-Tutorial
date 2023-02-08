package tutorial;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvents extends JFrame implements MouseListener {
	
	JLabel label;
	
	MouseEvents(){
		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.addMouseListener(this);
		
		this.add(label);
		this.addMouseListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(700, 600);
		this.setTitle("MOUSE EVENTS");
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MouseEvents();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource() == label)
			System.out.println("Mouse Pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getSource() == label)
			System.out.println("Mouse Released");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Your mouse location is: " + MouseInfo.getPointerInfo().getLocation());
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
