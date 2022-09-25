import javax.swing.JOptionPane;

public class WhileLoop {

	public static void main(String[] args) {

	/*	boolean i = true;
		while(i == true) {
			System.out.println("I'm inside a loop");
			
	*/
		
		String userInput = JOptionPane.showInputDialog("Please enter a word. Enter 'quit' to exit.");
				while(!userInput.equalsIgnoreCase("quit")) {
					System.out.println(userInput);
			
		}
		
		
	}

}
