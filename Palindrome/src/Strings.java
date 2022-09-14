
public class Strings {

	public static void main(String[] args) {
		String temp = "Hello world";
		
		System.out.println(temp.charAt(0));
		System.out.println(temp.charAt(3));
		
		System.out.println((int) temp.charAt(3));
		
		System.out.println(temp.indexOf('H'));
		System.out.println(temp.indexOf('x'));
		
		if(temp.indexOf('o') == -1) {
			System.out.println("Not found");
		}
		else {
			System.out.println("Found at position " + temp.indexOf('o'));
		}

		
		//getting a part of a string
		System.out.println(temp.substring(6));
		System.out.println(temp.substring(6,8));
		
		
		//Replacing characters or substrings
		System.out.println(temp.replace('o', 'z'));
		System.out.println(temp.replace("world", "universe"));

		
		
	}

}
