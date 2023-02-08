package tutorial;

//import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
	JPanel panel;
	
	MyPanel(Color bg, int x, int y, int h, int w){
		panel = new JPanel();		
		panel.setBackground(bg);
		panel.setBounds(x, y, h, w);
		panel.setLayout(null);
//		panel.revalidate();
	}
		
	public JPanel getPanel() {
		return panel;
	}
	
}
