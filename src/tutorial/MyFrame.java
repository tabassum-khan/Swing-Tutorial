package tutorial;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class MyFrame extends JFrame{
	
	MyLabel label2;
	MyPanel yellowPanel;
	JButton b1;
	JButton b3;
	JButton b4;
	Color defaultPaneColor;
	
	MyFrame(FrameData d1){
		
		JMenuBar menu = new Menu().getMenu();
		
		CreateImage c = new CreateImage();
		ImageIcon label_icon = c.createImageIcon("../assets/nerd.png", "label1 icon");
		
		MyLabel label1 = new MyLabel("Label1", label_icon);
		label1.getLabel().setBounds(25, 0, 200, 280);
		
		
		ImageIcon button_icon = c.createImageIcon("../assets/button.jpeg", "button icon");
		button_icon = c.resize(button_icon, 35, 35);
		
		MyButton button1 = new MyButton(0, 75, 250, 100);
		b1 = button1.getButton();
		b1.setText("Launch BorderLayout Window");
		b1.setFocusable(false);
		b1.addActionListener((e) -> launchWindow(e));
		b1.setIcon(button_icon);
		b1.setFont(new Font("Comic Sans", Font.BOLD, 12));
		
		MyButton button3 = new MyButton(0, 520, 250, 100);
		b3 = button3.getButton();
		b3.setText("Launch Forms");
		b3.setFocusable(false);
		b3.addActionListener((e) -> launchForms(e));
		b3.setFont(new Font("Comic Sans", Font.BOLD, 16));
		
		MyButton button4 = new MyButton(260, 520, 250, 100);
		b4 = button4.getButton();
		b4.setText("Change Color");
		b4.setFocusable(false);
		b4.addActionListener((e) -> changeColor(e));
		b4.setFont(new Font("Comic Sans", Font.BOLD, 16));
		
		
		ImageIcon yellow_icon = c.createImageIcon("../assets/logo.jpeg", "yellow panel icon");
//		button_icon = c.resize(yellow_icon, 50, 50);
		label2 = new MyLabel("Yellow Panel", yellow_icon);
		label2.getLabel().setBounds(25, 0, 200, 350);
		label2.getLabel().setVisible(false);
		
		MyButton button2 = new MyButton(0,100, 250, 50);
		button2.getButton().addActionListener((e) -> changeText(e));
		
		MyPanel redPanel = new MyPanel(Color.red, 0, 0, 250, 250);
		MyPanel greenPanel = new MyPanel(Color.green, 250, 0, 250, 250);
		MyPanel blackPanel = new MyPanel(Color.black, 0, 250, 250, 250);
		yellowPanel = new MyPanel(Color.yellow, 250, 250, 250, 250);
		
		
//		this.add(label1.getLabel());//set label
		redPanel.getPanel().add(label1.getLabel());
		greenPanel.getPanel().add(button1.getButton());
		blackPanel.getPanel().add(button2.getButton());
		yellowPanel.getPanel().add(label2.getLabel());
		
		//add mouse clicked event
		PopupMenuExample popup = new PopupMenuExample();
		this.addMouseListener(popup);
		
		this.add(b3);
		this.add(b4);
		this.add(redPanel.getPanel());
		this.add(greenPanel.getPanel());
		this.add(blackPanel.getPanel());
		this.add(yellowPanel.getPanel());
		this.add(menu);
		this.add(popup.getPopupMenu());
		
		
		this.setTitle(d1.name);//sets this title
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application
		this.setSize(d1.height, d1.width); //height and width of frame
		this.setResizable(true);
		this.setIconImage(d1.icon.getImage()); //change this icon
		
		defaultPaneColor = d1.color;
		this.getContentPane().setBackground(defaultPaneColor);//set background color
		
		this.setLayout(null);
		this.setVisible(true);
		
//		using the windowClosing() method of WindowAdapter class  
		this.addWindowListener(new WindowAdapter() {
			
			public void windowActivated (WindowEvent arg0) {    
			    System.out.println("Window Activated");    
			}   
			
			public void windowClosing(WindowEvent e) {
				System.out.println("Window Closing");
				dispose();
			}
		});
	}

	public void changeText(ActionEvent e) {
//		 String buttonText = (((AbstractButton) e.getSource()).getText() == "Clicked" ? "Click Again" : "Clicked");
		label2.getLabel().setVisible(true);
		((AbstractButton) e.getSource()).setText("Can only Click once");
		((AbstractButton) e.getSource()).setEnabled(false);
	}	
	
//	public void changeText(ActionEvent e, MyButton button) {
//		String buttonText = button.getButton().getText() == "Clicked" ? "Click Again" : "Clicked";
//		button.getButton().setText(buttonText);
//	}
	
	public void launchWindow(ActionEvent e) {
		if(e.getSource() == b1) {
			System.out.println("Launching Window");
			this.dispose();
			new NewWindow();
		}
	}
	
	public void launchForms(ActionEvent e) {
		if(e.getSource() == b3) {
			System.out.println("Launching Forms");
			this.dispose();
			new Forms();
		}
	}
	
	public void changeColor(ActionEvent e) {
		if(e.getSource() == b4) {
//			JColorChooser colorChooser = new JColorChooser();
			
			Color color = JColorChooser.showDialog(null, "Pick a Color...", Color.black);
			System.out.println("Changing Color from " + defaultPaneColor + " to " + color);
			defaultPaneColor = color;
			this.getContentPane().setBackground(defaultPaneColor);//set background color
					
		}
	}
}
