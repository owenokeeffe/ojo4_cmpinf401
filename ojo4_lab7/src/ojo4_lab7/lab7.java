package ojo4_lab7;
import javax.swing.JOptionPane;

import java.util.Arrays;
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
	System.out.println(Arrays.toString(nums));
	System.out.println("The max is: "+ (max(nums)));
	System.out.println("The minimum is: " + (min(nums)));
	System.out.println("The sum is: " + (sum(nums)));
	System.out.println("The average is: " + (ave(nums)));

	}

	public static double max(int[] nums) {
		int max = nums[0];
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] > max) {
				max = nums[i];
			}
		}
		return max;
	}
	
	public static double min(int[] nums) {
		int min = nums[0];
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] < min) {
				min = nums[i];
			}
		}
		return min;
	}
	
	public static double sum(int [] nums) {
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		
		return sum;
	}
	
	public static double ave(int [] nums) {
		double ave = 0;
		
		ave = ((sum(nums)) / nums.length);
		
		return ave;
	}
	
}
