import javax.swing.JOptionPane;
public class Palindrome {

	//A palindrome is a word or phrase that reads the same backwards
	//Should ignore capitalization
	//Ignore everything that is not a letter
	
	//1. User provides input
	//2. convert everything to lower case
	//3. Remove all non-letter characters
	//4. Reverse the word
	//5. Compare the two strings
	
	public static void main(String[] args) {
		//1. User provides input
		String phrase = JOptionPane.showInputDialog("Please enter a word or phrase: ");
		System.out.println(phrase);

		//2. convert everything to lower case
		phrase = phrase.toLowerCase();
		System.out.println(phrase);
		
		//3. Remove all non-letter characters
		int lowerBound = (int) 'a';
		int upperBound = (int) 'z';
		String cleanPhrase = "";
		
		for(int i = 0; i < phrase.length(); i++) {
			char letter = phrase.charAt(i);
			int asciiLetter = (int) letter;
			
			if(asciiLetter >= lowerBound && asciiLetter <= upperBound) {
				cleanPhrase = cleanPhrase + letter;
		}
		
		}
		
		System.out.println(cleanPhrase);
		String reversedPhrase = "";
		for(int i= cleanPhrase.length()-1; i>=0; i--) {
			//System.out.print(cleanPhrase.charAt(i));
			reversedPhrase += cleanPhrase.charAt(i);
		}
		System.out.println(reversedPhrase);
		
		if(cleanPhrase.equals(reversedPhrase)) {
			System.out.println(phrase + " is a palidrome");
		}
		else {
			System.out.println(phrase + " is NOT a palindrome");
		}
	}

}
