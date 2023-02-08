package tutorial;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEvents extends JFrame implements KeyListener{
	JLabel label;
	
	KeyEvents(){
		label = new JLabel();
		label.setBounds(0, 0, 20, 20);
		label.setBackground(Color.black);
		label.setOpaque(true);
		
		this.add(label);
		this.addKeyListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(700, 600);
		this.setTitle("KEY EVENTS");
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new KeyEvents();
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case 37: label.setLocation(label.getX()-10, label.getY());
		break;
		case 38: label.setLocation(label.getX(), label.getY()-10);
		break;
		case 39: label.setLocation(label.getX()+10, label.getY());
		break;
		case 40: label.setLocation(label.getX(), label.getY()+10);
	}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}
