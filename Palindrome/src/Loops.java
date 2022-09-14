
public class Loops {

	public static void main(String[] args) {

		for(int i = 1; i <= 10; i++) {
			//System.out.println(i);
		}
		
		//Looping through a string
		String temp = "Hello world";
		for(int i=0;i<temp.length();i++) {
		//	System.out.println(temp.charAt(i));
	}
	
		
		for(int i=temp.length();i>=0;i--) {
			System.out.println(temp.charAt(i));
		}
	}
}
