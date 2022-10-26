package ojo4_lab7;
import javax.swing.JOptionPane;

import java.util.Random;
public class lab7 {

	public static void main(String[] args) {


		String userInput = JOptionPane.showInputDialog("Input the number of items:");
	int input = Integer.parseInt(userInput);
	int[] nums = new int[input];
	Random random = new Random();
	for(int i = 0; i < nums.length; i++) {
		nums[i] = random.nextInt(10);
	}
    max(nums);
	}

	public static double max(int[] nums) {
		int max = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] < nums[i+1]) {
				nums[i] = max;
			}
		}
		return max;
	}
	
	
}
