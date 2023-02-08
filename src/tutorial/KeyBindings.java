package tutorial;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

public class KeyBindings {
	
	JFrame frame;
	JLabel label;
	
	UpAction up;
	DownAction down;
	LeftAction left;
	RightAction right;
	
	KeyBindings(){
		frame = new JFrame();
		
		label = new JLabel();
		label.setBounds(100, 100, 50, 50);
		label.setBackground(Color.red);
		label.setOpaque(true);
		
		up = new UpAction();
		down = new DownAction();
		left = new LeftAction();
		right = new RightAction();
		
		label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
		label.getActionMap().put("upAction", up);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
		label.getActionMap().put("downAction", down);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
		label.getActionMap().put("leftAction", left);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
		label.getActionMap().put("rightAction", right);
		
		frame.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Key Bidings Demo");
		frame.setLayout(null);
		frame.setSize(700, 700);
		frame.setVisible(true);
		
		
	}
	
	public class UpAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX(), label.getY()-10);
			
		}
		
	}
	
	public class DownAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX(), label.getY()+10);
		}
		
	}
	public class LeftAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX()-10, label.getY());
		}
		
	
	}
	public class RightAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX()+10, label.getY());
		}
		
	}
	
	public static void main(String[] args) {
		new KeyBindings();
	}

}
