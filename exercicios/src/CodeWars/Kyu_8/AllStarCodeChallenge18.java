package CodeWars.Kyu_8;

public class AllStarCodeChallenge18 {

	public static void main(String[] args) {
		System.out.println(strCount("Hello", 'l'));
		System.out.println(strCount("Victor Rodrigues", 'r'));
		System.out.println(strCount("Walter White", 'e'));
		System.out.println(strCount("Inconstitucionalissimamente", 's'));
		
		
	}

	public static int strCount(String str, char letter) {
		
		int cont = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == letter) {
				cont += 1;
			}
		}
		
		return cont;
	}
}

/**
 * Create a function that accepts a string and a single character, and returns
 * an integer of the count of occurrences the 2nd argument is found in the first
 * one.
 * 
 * If no occurrences can be found, a count of 0 should be returned.
 * 
 * ("Hello", 'o') => 1
 * ("Hello", 'l') => 2
 * ("", 'z') => 0
 *   
 *    Notes 
 * The first argument can be an empty string In languages with no distinct character data
 * type, the second argument will be a string of length 1
 */