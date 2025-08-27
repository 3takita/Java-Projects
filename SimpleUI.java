import javax.swing.*;
import java.awt.event.*;

public class SimpleUI {
	public static void main(String[] args) {
		// create the frame
		JFrame frame = new JFrame("Simple UI Example");
		frame.setSize(300,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null); // use absolute positioning
		// create components
		JLabel label = new JLabel("Enter your name:");
		label.setBounds(20,20,120,25);

		JTextField textField = new JTextField();
		textField.setBounds(140,20,120,25);

		JButton button = new JButton("Say Hello");
		button.setBounds(80,60,120,30);

		JLabel outputLabel = new JLabel("");
		outputLabel.setBounds(20,110,250,25);

		// Add action listen to the button
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				if(!name.trim().isEmpty()) {
					outputLabel.setText("Hello, " + name + "!");
				} else {
					outputLabel.setText("Please enter a name.");
				}
			}
		});

		// add components to the frame
		frame.add(label);
		frame.add(textField);
		frame.add(button);
		frame.add(outputLabel);

		// set frame visibility
		frame.setVisible(true);
	}
}


