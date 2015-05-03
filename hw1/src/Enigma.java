// Enigma.java

/****
 * CSC 143, Homework #1 Enigma
 * Encryption using Alan Turing's Enigma system
 * @version 1.0, 04/26/2015
 * @author Kelcie Feeney
 */

public class Enigma {

	private static final String sOuterRing  = "#BDFHJLNPRTVXZACEGIKMOQSUWY";
	private static final String sMiddleRing = "#EJOTYCHMRWAFKPUZDINSXBGLQV";
	private static final String sInnerRing  = "#GNUAHOVBIPWCJQXDKRYELSZFMT";

	private int mMiddleRotation;
	private int mInnerRotation;
	
	/****
	 * Enigma constructor defines all object data
	 */
	public Enigma() {
		mMiddleRotation = 0;
		mInnerRotation = 0;
	}
	
	/****
	 * Encode processes the given character using Enigma encryption.
	 * It updates the rotation values and returns the encoded character.
	 * @param c: given character
	 * @return: encoded character
	 */
	public char Encode(char c) {
		int n = sOuterRing.length();
		
		// Calculate the matching between inner and outer rings
		// using the given character
		String outerStr1 = MatchRings(String.valueOf(c), 
				sInnerRing, sOuterRing, mInnerRotation, 0);
		
		// Calculate the matching between middle and outer rings
		// using the outer character from the first match result
		String outerStr2 = MatchRings(outerStr1, 
				sMiddleRing, sOuterRing, mMiddleRotation, 0);
		
		// Rotate inner ring after each character is encoded
		// and ensure the result is limited to (0, n-1)
		mInnerRotation = (mInnerRotation + 1 + n) % n;
		
		// Rotate middle ring after inner ring does a full rotation
		// and ensure the result is limited to (0, n-1)
		if(mInnerRotation == 0) {
			mMiddleRotation = (mMiddleRotation + 1 + n) % n;
		}
		
		// Return outer character from second match result
		// using the first character in the result string (length 1)
		return outerStr2.charAt(0);		
	}
	
	/****
	 * Decode processes the given character using Enigma encryption.
	 * It updates the rotation values and returns the decoded character.
	 * @param c: given character
	 * @return: decoded character
	 */
	public char Decode(char c) {
		int n = sOuterRing.length();

		/*
		// Rotate middle ring before inner ring does a full rotation
		// and ensure the result is limited to (0, n-1)
		if(mInnerRotation == 0) {
			//mMiddleRotation = (mMiddleRotation - 1 + n) % n;
			mMiddleRotation = (mMiddleRotation + 1 + n) % n;
		}
		
		// Rotate inner ring before each character is decoded
		// and ensure the result is limited to (0, n-1)
		//mInnerRotation = (mInnerRotation - 1 + n) % n;
		mInnerRotation = (mInnerRotation + 1 + n) % n;
		*/
		
		// Calculate the matching between outer and middle rings
		// using the given character
		String outerStr1 = MatchRings(String.valueOf(c), 
				sOuterRing, sMiddleRing, 0, mMiddleRotation);
		
		// Calculate the matching between outer and inner rings
		// using the middle character from the first match result
		String outerStr2 = MatchRings(outerStr1, 
				sOuterRing, sInnerRing, 0, mInnerRotation);

		
		// Rotate inner ring before each character is decoded
		// and ensure the result is limited to (0, n-1)
		//mInnerRotation = (mInnerRotation - 1 + n) % n;
		mInnerRotation = (mInnerRotation + 1 + n) % n;
		
		// Rotate middle ring before inner ring does a full rotation
		// and ensure the result is limited to (0, n-1)
		if(mInnerRotation == 0) {
			//mMiddleRotation = (mMiddleRotation - 1 + n) % n;
			mMiddleRotation = (mMiddleRotation + 1 + n) % n;
		}
		
		
		// Return outer character from second match result
		// using the first character in the result string (length 1)
		return outerStr2.charAt(0);
	}

	/****
	 * MatchRings finds the matching character between two rings
	 * and rotates by the given amounts
	 * @param str: given character
	 * @param srcRing: source ring
	 * @param dstRing: destination ring
	 * @param srcRotation: source ring rotation (for encoding)
	 * @param dstRotation: destination ring rotation (for decoding)
	 * @return: matching character
	 */
	private String MatchRings(String str, 
			String srcRing, String dstRing, int srcRotation, int dstRotation) 
	{
		// Find the given character in the source string
		int ringPos = srcRing.indexOf(str);
		
		// Rotate the given character forward for encoding
		// and backward for decoding
		ringPos = (ringPos + srcRotation - dstRotation + srcRing.length())
				% srcRing.length();
		
		// Return the matching character
		return String.valueOf(dstRing.charAt(ringPos));
	}
}