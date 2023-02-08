package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class ButtonPanel extends JPanel implements ActionListener{
	Button b1;
	Button b2;
	Button b3;
	Button b4;
	Button b5;
	Button b6;
	Button b7;
	Button b8;
	Button b9;
	Button b10;
	Button b11;
	
	final Dimension btn_dim = new Dimension(150, 50);
	int index = 1; 
	
	ButtonPanel(){
		b1 = createButton("Draw a Line");
		b2 = createButton("Draw an Oval");
		b3 = createButton("Fill the Oval");
		b4 = createButton("Draw Arcs");
		b5 = createButton("Fill Arc");
		b6 = createButton("Draw Rectangle");
		b7 = createButton("Fill Rectangle");
		b8 = createButton("Create Polygon");
		b9 = createButton("Fill Polygon");
		b10 = createButton("Create a String");
		b11 = createButton("Free Hand Drawing");
		
		this.setBackground(Color.black);
		this.setPreferredSize(new Dimension(1200, 150));
		this.setLayout(new FlowLayout());
	}
	
	public Button createButton(String btn_name) {
		Button button = new Button (btn_name, btn_dim);
		button.addActionListener(this);
		this.add(button);
		return button;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == b1) 
			new GraphicsInterface(new LinePanel());
		else if(e.getSource() == b2)
			new GraphicsInterface(new CreateOvalPanel());
		else if(e.getSource() == b3)
			new GraphicsInterface(new FillOval());
		else if(e.getSource() == b4)
			new GraphicsInterface(new CreateArc());
		else if(e.getSource() == b5)
			new GraphicsInterface(new FillArc());
		else if (e.getSource() == b6)
			new GraphicsInterface(new CreateRectanglePanel());
		else if (e.getSource() == b7)
			new GraphicsInterface(new FillRectangle());
		else if (e.getSource() == b8)
			new GraphicsInterface(new CreatePolygonPanel());
		else if (e.getSource() == b9)
			new GraphicsInterface(new FillPolygon());
		else if (e.getSource() == b10)
			new GraphicsInterface(new CreateString());
		else if (e.getSource() == b11)
			new GraphicsInterface(new FreeHandPanel());
	}
	

}
