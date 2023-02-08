package tutorial;

import javax.swing.JButton;

public class MyButton extends JButton{
	JButton button;
	
	public MyButton(int x, int y, int w, int h){
		button = new JButton();
		button.setText("Click Here!");
		button.setBounds(x, y, w, h);
	}
	
	public JButton getButton() {
		return button;
	}
	
	
	
}
