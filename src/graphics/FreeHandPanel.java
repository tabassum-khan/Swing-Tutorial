package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class FreeHandPanel extends Panel{
	
	FreeHandPanel(){
		this.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged (MouseEvent e) {    
				// creating the Graphics object and fetching them from the Frame object using getGraphics() method  
				    Graphics g = getGraphics();
				    g.setColor (Color.RED);
				    g.fillOval (e.getX(), e.getY(), 10, 10);    
			}    
		});
		
		this.setBackground(Color.white);
	}

//	@Override
//	public void mouseDragged(MouseEvent e) {
//		 Graphics g= getGraphics();  
//		 g.setColor(Color.BLUE);  
//		    g.fillOval(e.getX(),e.getY(),20,20);  
//		
//	}
//
//	@Override
//	public void mouseMoved(MouseEvent e) {
//		// TODO Auto-generated method stub
//		
//	}	
}
