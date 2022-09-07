import javax.swing.JOptionPane;
public class Lab2_Problem1 {

	public static void main(String[] args) {

		String userInput1 = JOptionPane.showInputDialog("Please enter the length of side 1: ");
		
		int userInputInt1 = Integer.parseInt(userInput1);
		
		String userInput2 = JOptionPane.showInputDialog("Please enter the length of side 2: ");
		
		int userInputInt2 = Integer.parseInt(userInput2);
		
		double hypotenuse = (Math.sqrt((Math.pow(userInputInt1, 2) + Math.pow(userInputInt2, 2))));
	
		hypotenuse = (hypotenuse * 100);
		hypotenuse = (Math.round(hypotenuse));
		hypotenuse = (hypotenuse/100);
	JOptionPane.showMessageDialog(null, "The hypotenuse is " + hypotenuse);
		
	}

}
