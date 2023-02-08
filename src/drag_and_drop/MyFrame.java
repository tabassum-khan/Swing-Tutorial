package drag_and_drop;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	DragPanel dragPanel;
	
	MyFrame(){
		
		dragPanel = new DragPanel();
		
		this.add(dragPanel);
		
		this.setTitle("Drag and Drop Demo");
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
