package graphics;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Panel extends JPanel{
	
	Panel(){
		this.setPreferredSize(new Dimension(1200, 450));
		this.setBackground(Color.red);
	}
}
