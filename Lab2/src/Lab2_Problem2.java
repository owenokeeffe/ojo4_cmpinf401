import javax.swing.JOptionPane;
public class Lab2_Problem2 {

	public static void main(String[] args) {

		String userInput = JOptionPane.showInputDialog("Input the radius of the circle");

		double userInputDouble1 = Double.parseDouble(userInput);

		double perimeter = (2*userInputDouble1*Math.PI);
		
		double area = (Math.pow(userInputDouble1, 2)*Math.PI);
		
		JOptionPane.showMessageDialog(null, "The circle with radius " + userInputDouble1 + " has an area of " + area + " and a perimeter of " + perimeter);
	}

}
