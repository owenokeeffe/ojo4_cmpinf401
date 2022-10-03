package ojo4_lab4;
import java.util.Random;
import javax.swing.JOptionPane;
public class lab5 {
	private static void rollDice(Random rand, int count) {
		int[] counter = new int[13];
		for(int i = 0; i < count; i++) {
			counter[(1+ rand.nextInt(6)) + (1+ rand.nextInt(6))]++;
		}
		String result = "";
		for(int i = 2; i <= 12; i++) {
			result += ("When " + i + " is rolled, the calculated probability is " + (((double) counter[i] / (double) count)*100) + "%" + "\n");
		}
		JOptionPane.showMessageDialog(null, result);
	}
	public static void main(String[] args) {
		do {
			int countNum = Integer.parseInt(JOptionPane.showInputDialog("Enter amount of dice rolls: "));
			rollDice(new Random(), countNum);
		}while(JOptionPane.showInputDialog("Do you want to continue (Yes/No): ").equals("Yes"));
	}
}