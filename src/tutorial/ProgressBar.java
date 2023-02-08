package tutorial;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBar {
	JFrame frame = new JFrame();
	JProgressBar progress = new JProgressBar(0, 100);
	
	ProgressBar(){
		progress.setValue(0);
		progress.setBounds(0, 0, 400, 50);
		progress.setStringPainted(true);
		progress.setBackground(Color.black);
		progress.setForeground(Color.red);
		
		frame.add(progress);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(400, 400);
		frame.setTitle("Processing...");
		frame.setVisible(true);
		
		fill();
	}
	
	public void fill() {
		int counter = 0;
		while (counter<=100) {
			progress.setValue(counter);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			counter += 1;
		}
		progress.setString("Done :)");
		new Forms();
	}
	
	public static void main(String[] args) {
		new ProgressBar();
	}
}
