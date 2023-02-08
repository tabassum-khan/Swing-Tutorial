package tutorial;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Forms extends JFrame implements ActionListener, ChangeListener{
	JFrame frame = new JFrame();
	
	Menu menu = new Menu();
	
	//text and password
	JTextField text = new JTextField();
	JPasswordField pass = new JPasswordField(10);
	
	//Radio buttons
	JLabel empty_label = new JLabel();
	JRadioButton pizza_button = new JRadioButton("Pizza");
	JRadioButton hamburger_button = new JRadioButton("HamBurger");
	JRadioButton hotdog_button = new JRadioButton("HotDog");
	ButtonGroup btngroup =  new ButtonGroup();
	
	//combo-box
	JLabel label = new JLabel("Your Favourite animal: ");
	String[] animals = {"lions", "tigers", "wolves", "hyenas", "penguins"};
	JComboBox<String> combo = new JComboBox<>(animals);
	
	//slider
	JSlider slider = new JSlider(0, 100, 37); //start value, end value, intial value
	JLabel temp = new JLabel(" Temperature is: " + slider.getValue() + "°C");
	
	//Select a file
	JButton select_file_btn = new JButton("Upload File");	
	JLabel selected_file = new JLabel();
	
	//checkbox
	JCheckBox checkbox = new JCheckBox();
		
	JButton submit = new JButton("Submit");
	
	public Forms() {
		
		//textfield
		text.setPreferredSize(new Dimension(400, 40));
		text.setText("Type your Name");
		
		
		//password
		pass.setPreferredSize(new Dimension(400, 40));
		pass.setText("Set your Password");
		
		//grouping radio buttons
		btngroup.add(pizza_button);
		btngroup.add(hamburger_button);
		btngroup.add(hotdog_button);
		
		//combobox properties
		combo.insertItemAt("polar bears", 4);
		combo.setSelectedIndex(0);
		combo.removeItem("hyenas");
//		combo.removeItemAt(2);
		
		//customising slider 
		slider.setPreferredSize(new Dimension(250, 30));
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		slider.setPaintLabels(true);
		slider.setFont(new Font("MV Boli", Font.PLAIN, 13));
		slider.addChangeListener(this);
//		slider.setOrientation(SwingConstants.VERTICAL);
		
		//Selecting a file
		select_file_btn.addActionListener(this);
		
		//checkbox
		checkbox.setText("I am not a robot");
		checkbox.setSelected(true);
		
		//submit button
		submit.setPreferredSize(new Dimension(200, 40));
		submit.addActionListener(this);
		
		//add components to frame
		frame.setJMenuBar(menu.getMenu());
		frame.add(text);
		frame.add(pass);
		
		frame.add(pizza_button);
		frame.add(hamburger_button);
		frame.add(hotdog_button);
		frame.add(empty_label);
		
		frame.add(label);
		frame.add(combo);
		
		frame.add(temp);
		frame.add(slider);
		
		frame.add(select_file_btn);
		frame.add(selected_file);
		
		frame.add(checkbox);
		frame.add(submit);
		
		//customise frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(8, 2, 10, 10)); //grid layout
//		frame.setLayout(new FlowLayout());
		frame.pack();
		frame.setTitle("Forms");
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = text.getText();
		String password = new String(pass.getPassword());
		
		if(e.getSource() == select_file_btn) {
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setCurrentDirectory(new File("/Users/mac/Desktop/"));
			
			int response = fileChooser.showOpenDialog(null); //select file dialog
			
			if(response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				selected_file.setText(file.toString());
			}
		}
		
		
		if(e.getSource() == submit && name.length() != 0 && password.length() != 0) {
			System.out.println("Form submitted is: ");
			
			System.out.println(name + ", " + password);
			
			if(pizza_button.isSelected())
				System.out.println("You ordered Pizza!");
			if(hamburger_button.isSelected())
				System.out.println("You ordered HamBurger!");
			if(hotdog_button.isSelected())
				System.out.println("You ordered HotDog!");
			
			System.out.println("Your fav animal is: " + combo.getSelectedItem());
			System.out.println("File Selected is: " + selected_file.getText());
			
			System.out.println("CheckBox is set to: " + checkbox.isSelected());
//			submit.setEnabled(false);
		}		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		temp.setText("temperature is: " + slider.getValue() + "°C");
	}
	

}
