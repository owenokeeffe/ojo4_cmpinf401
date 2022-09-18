package ojo4_lab3;

import javax.swing.JOptionPane;
public class UnitConverter {

	public static void main(String[] args) {

		String userInput = JOptionPane.showInputDialog("Enter the measurement and unit.");
		
		userInput = userInput.toLowerCase();
		
		System.out.println(converter(userInput));
	}
public static String converter (String input) {
	
	String strValue = input.substring(0, input.indexOf(' '));
	double conversionVal = Double.parseDouble(strValue);
	String unit = input.substring(input.indexOf(' ') + 1, input.length());
	
	if(unit.equalsIgnoreCase("cm")){
		double newVal = conversionVal / 2.54;
		return input + " = " + newVal + " in";
	}
	
	if(unit.equalsIgnoreCase("in")){
		double newVal = conversionVal * 2.54;
		return input + " = " + newVal + " cm";
	}
	
	if(unit.equalsIgnoreCase("m")){
		double newVal = conversionVal * 1.094;
		return input + " = " + newVal + " yd";
	}
	
	if(unit.equalsIgnoreCase("yd")){
		double newVal = conversionVal / 1.094;
		return input + " = " + newVal + " m";
	}
	
	if(unit.equalsIgnoreCase("oz")){
		double newVal = conversionVal * 28.45;
		return input + " = " + newVal + " gm";
	}
	
	if(unit.equalsIgnoreCase("gm")){
		double newVal = conversionVal / 28.45;
		return input + " = " + newVal + " oz";
	}
	
	if(unit.equalsIgnoreCase("lb")){
		double newVal = conversionVal / 2.205;
		return input + " = " + newVal + " kg";
	}
	
	if(unit.equalsIgnoreCase("kg")){
		double newVal = conversionVal * 2.205;
		return input + " = " + newVal + " lb";
	}
	

	return "";
}
		

		
	}

