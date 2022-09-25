package ojo4_lab4;

import javax.swing.JOptionPane;
public class logSolver {

	public static void main(String[] args) {

		String userInput1 = "";
		String userInput2 = "";
		double xInput = 0;
		double bInput = 0;
		int yValue = 0;
		
		while(!(xInput > 0 && bInput > 1)){
		
			
		userInput1 = JOptionPane.showInputDialog("Input the X value (Y = logbX)");		
		userInput2 = JOptionPane.showInputDialog("Input the b value (Y = logbX)");

		xInput = Double.parseDouble(userInput1);
		bInput = Double.parseDouble(userInput2);
	}
		
		for(int i = 0;xInput >= bInput; i++) {
			xInput = xInput/bInput;
			yValue = i;
		}
		System.out.println("Y = "+ (yValue+1));
		}
	}

