import javax.swing.JOptionPane;
public class Lab2_Problem3 {

	public static void main(String[] args) {

		String userInput = JOptionPane.showInputDialog("Enter the amount of money: ");
		
		int dollars = Integer.parseInt(userInput);
		
		
		int grands = ((dollars/1000)%1000);
		System.out.println(grands + " grands");
		int benjamins = ((dollars/100)%10);
		System.out.println(benjamins + " benjamins");
		int sawbucks = ((dollars/10)%10);
		System.out.println(sawbucks + " sawbucks");
		int bucks = (dollars%10);
		System.out.println(bucks + " bucks");

	}

}
