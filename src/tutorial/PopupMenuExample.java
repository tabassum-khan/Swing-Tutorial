package tutorial;

import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupMenuExample extends MouseAdapter implements ActionListener{
	
	final PopupMenu popupmenu;
	MenuItem cut;
	MenuItem copy;
	MenuItem paste;
	
	PopupMenuExample(){
		popupmenu = new PopupMenu("Edit");
		
		cut = new MenuItem("Cut");  
        cut.setActionCommand("Cut");  
        cut.addActionListener(this);
        
        copy = new MenuItem("Copy");  
        copy.setActionCommand("Copy");  
        copy.addActionListener(this);
        
        paste = new MenuItem("Paste");  
        paste.setActionCommand("Paste");  
        paste.addActionListener(this);
        
        popupmenu.add(cut);
        popupmenu.add(copy);
        popupmenu.add(paste);
	}
	
	 public void mouseClicked (MouseEvent e) { 
		 if(e.getButton() == MouseEvent.BUTTON3){
			 popupmenu.show(e.getComponent(), e.getX(), e.getY());
		}
	 }
	 
	 public PopupMenu getPopupMenu() {
		 return popupmenu;
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cut)
			System.out.println("Cut has been selected");
		if(e.getSource() == copy)
			System.out.println("Copy has been selected");
		if(e.getSource() == paste)
			System.out.println("Paste has been selected");
	}
}
