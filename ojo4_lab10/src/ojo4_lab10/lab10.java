package ojo4_lab10;

public class lab10 {


	 static int sumOfDigits(int x) 
	 {
		 
		 if(x == 0) {
			 return 0;
		 }
			 return (x % 10 + sumOfDigits(x / 10));
		 
	 }
	 
	 static void printArrayElements(int a[], int index) {
		 if(index >= a.length) {
			 return;
		 }
		 System.out.print(a[index] + " ");
		 printArrayElements(a, index+1);
	 }
	 
	 public static void printCombos(int[] a, String out, int startIndex, int k) {
		 
	 }

	 
	 
		 public static void main(String [] args) {
			 int number = 12345;
			 int result = sumOfDigits(number);
			 System.out.println("The sum of digits in " + number + " is " + result);
			 int[] a = new int[] {2, 3, 1, 5, 6};
			 printArrayElements(a, 0);

	}
	 }

