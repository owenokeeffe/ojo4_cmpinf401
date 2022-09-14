package ojo4_lab3;
import javax.swing.JOptionPane;
public class UnitConverter {

	public static void main(String[] args) {

		String userInput = JOptionPane.showInputDialog("Enter the measurement and unit.");
		
	}

	public static String converter(String userInput) {
		
		String[] convert = userInput.split(userInput);
		
		double conversionFactor = Double.parseDouble(convert[0]);
		
		if(convert[1].equalsIgnoreCase("cm")) {
			double newMeasure = conversionFactor / 2.54;
			return userInput + " = " + newMeasure + " in";
		}
		
	}
	
}
