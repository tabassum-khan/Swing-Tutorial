package tutorial;


import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MyLabel extends JLabel {
	JLabel label;
	
	MyLabel(String label_text, ImageIcon label_icon){
		label = new JLabel(label_text);
		label.setIcon(label_icon);
//		label.setHorizontalAlignment(JLabel.LEFT);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setOpaque(true);
//		can set font-color and everything 	
	}
	
	public JLabel getLabel() {
		return label;
	}
	

}
