import java.util.Scanner;

public class ModifyStrings {

	/*
	This code takes in a phrase and an integer (k) from the user and then return the same phrase
	but shortened to the length of k or if k is greater than the length of the phrase then it returns
	an error message to alert the user of this.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a phrase: ");
		String phrase = scan.nextLine();
		
		System.out.println("Enter an integer: ");
		int k = scan.nextInt();
		int length = phrase.length(); 
		if (k<length) {
			String new_phrase = phrase.substring(0,k); 
			System.out.println(new_phrase);
		}
		else
			System.out.println("Error: integer exceeds length of string (" + length + ").");
		
		scan.close();
		
	}

}
