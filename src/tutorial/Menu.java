package tutorial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu implements ActionListener{
	
	JMenuBar menu = new JMenuBar();
	
	JMenu fileMenu = new JMenu("File");
	JMenu editMenu = new JMenu("Edit");
	JMenu helpMenu = new JMenu("Help");
	
	JMenuItem loadItem = new JMenuItem("Load");
	JMenuItem saveItem = new JMenuItem("Save");
	JMenuItem exitItem = new JMenuItem("Exit");
	
	Menu(){
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		fileMenu.addActionListener(this);
//		fileMenu.setMnemonic(KeyEvent.VK_F); //cmd key for file menu
		
		loadItem.setMnemonic(KeyEvent.VK_L);//L key for load
		saveItem.setMnemonic(KeyEvent.VK_S);//S key for save
		exitItem.setMnemonic(KeyEvent.VK_E);//E key for exit
		
		menu.add(fileMenu);
		menu.add(editMenu);
		menu.add(helpMenu);
		
	}
	
	public JMenuBar getMenu() {
		return menu;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == fileMenu) {
			System.out.println("File Menu");
		}
		else if(e.getSource() == loadItem) {
			System.out.println("You have loaded file");
		}
		else if(e.getSource() == saveItem) {
			System.out.println("You have saved a file");
		}
		else if(e.getSource() == exitItem) {
			System.out.println("You have exited the file");
		}
	}
}
