package graphics;

import java.awt.Dimension;

import javax.swing.JButton;

public class Button extends JButton{
	
	Button(String name, Dimension d){
		this.setText(name);
		this.setPreferredSize(d);
	}
}
