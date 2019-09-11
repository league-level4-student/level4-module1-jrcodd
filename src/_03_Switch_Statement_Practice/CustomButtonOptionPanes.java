package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];

		// use a switch statement to do something cool for each option
		for (int i = 0; i == 0;)  {

			switch (choice) {
			case "Sunday":
				JOptionPane.showMessageDialog(null, "it's daysun");
				break;
			case "Monday":
				JOptionPane.showMessageDialog(null, "it's mandoy");

				break;
			case "Tuesday":
				JOptionPane.showMessageDialog(null, "it's tosdey");

				break;
			case "Wednesday":
				JOptionPane.showMessageDialog(null, "it's wanday");

				break;
			case "Thursday":
				JOptionPane.showMessageDialog(null, "it's truck");
				break;
			case "Friday":
				JOptionPane.showMessageDialog(null, "it's fidiy");

				break;
			case "Saturday":
				JOptionPane.showMessageDialog(null, "it's sitdownday");

				break;
			default:

				break;
			}
			input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
					options, 0);
			choice = options[input];
			
		}
	}
}
