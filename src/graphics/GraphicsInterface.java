package graphics;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsInterface extends JFrame{
	
	GraphicsInterface(JPanel panel){
				
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints(); 
		
		//1. Adding Button Panel to the first row
		ButtonPanel btnpanel = new ButtonPanel();
		gbc.fill = GridBagConstraints.HORIZONTAL; 
		gbc.gridx = 0;  //specifies the cell 
	    gbc.gridy = 0; //specifies the row
	    gbc.gridwidth = 1; 
	    gbc.gridheight = 1; 
		this.add(btnpanel, gbc);
		
		//2. Adding Graphic Panel to the first row
		gbc.fill = GridBagConstraints.HORIZONTAL; 
		gbc.gridx = 0;  
	    gbc.gridy = 1; 
	    if(panel != null) {
	    	this.add(panel, gbc);
	    }
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setSize(1200, 700);
		this.pack();
		this.setResizable(true);
		this.setTitle("2D Graphics in Java");
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new GraphicsInterface(null);
	}

}
