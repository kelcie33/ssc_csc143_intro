// EnigmaClient.java

/****
 * CSC 143, Homework #1 Enigma
 * Encryption using Alan Turing's Enigma system
 * @version 1.0, 04/26/2015
 * @author Kelcie Feeney
 */

import java.util.Scanner; // Scanner

public class EnigmaClient {
	
	private static final String sTestString = "OKNNWRDHGERPILRLAMFZF#FMUC";
	private static final String sTestString1 = "A";
	private static final String sTestString2 = "AA";
	
	/****
	 * main is the entry point for the program
	 * @param args: not used
	 */
	public static void main(String[] args) {
		EnigmaDecTest(new Scanner(sTestString), true);
		EnigmaEncDecTest(new Scanner(sTestString), true);
		EnigmaEncDecTest(new Scanner(sTestString1), true);
		EnigmaEncDecTest(new Scanner(sTestString2), true);
	}
	
	private static void EnigmaDecTest(Scanner s, boolean t) {
		// Read given information
		System.out.println("What is the string to decode: ");
	    System.out.print("  ");
		String user_str = s.next();
		if(t == true) {
			System.out.print(user_str);
		}
	    System.out.println("");
	    
	    // Print decoded information
	    System.out.println("The decoded information is: ");
	    System.out.print("  ");
	    Enigma e = new Enigma();
	    String user_str_dec_rev = "";
	    //for(int i = user_str.length() - 1; i >= 0; i--) {
	    for(int i = 0; i < user_str.length(); i++) {
	    	char dec = e.Decode(user_str.charAt(i));
	    	user_str_dec_rev += dec;
	    }
	    //System.out.println(new StringBuilder(user_str_dec_rev).reverse().toString());
	    System.out.println(user_str_dec_rev);
	    System.out.println("");
	}
	
	private static void EnigmaEncDecTest(Scanner s, boolean t) {
		// Read given information
		System.out.println("What is the string to encode & decode: ");
	    System.out.print("  ");
		String user_str = s.next();
		if(t == true) {
			System.out.print(user_str);
		}
	    System.out.println("");
	    
	    // Print encoded information
	    System.out.println("The encoded information is: ");
	    System.out.print("  ");
	    Enigma e = new Enigma();
	    String user_str_enc = "";
	    for(int i = 0; i < user_str.length(); i++) {
	    	char enc = e.Encode(user_str.charAt(i));
	    	user_str_enc += enc;
	    }
	    System.out.println(user_str_enc);
	    
	    // Print decoded information
	    System.out.println("The decoded information is: ");
	    System.out.print("  ");
	    String user_str_dec_rev = "";
	    for(int i = user_str_enc.length() - 1; i >= 0; i--) {
	    	char dec = e.Decode(user_str_enc.charAt(i));
	    	user_str_dec_rev += dec;
	    }
	    System.out.println(new StringBuilder(user_str_dec_rev).reverse().toString());
	    System.out.println("");
	}
}