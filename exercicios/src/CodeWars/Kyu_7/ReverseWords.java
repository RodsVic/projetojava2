package CodeWars.Kyu_7;

public class ReverseWords {

	public static void main(String[] args) {
		System.out.println(reverseWords("Victor"));
		System.out.println(reverseWords("Wagner"));
		System.out.println(reverseWords("Raisa"));
		System.out.println(reverseWords("Luana"));
		System.out.println(reverseWords("Mike"));
		System.out.println(reverseWords("double  spaces"));
	}

	public static String reverseWords(final String original) {

		String[] split = original.split(" ");
		
		for (int i = original.length() - 1; i >= 0; i--) {
			StringBuilder result = new StringBuilder();
			result.append(original.charAt(i));
		}
		return result.toString();
	}

}

/**
 * Complete the function that accepts a string parameter, and reverses each word
 * in the string. All spaces in the string should be retained.
 * 
 * Examples 
 * "This is an example!" ==> "sihT si na !elpmaxe" 
 * "double spaces" ==> "elbuod secaps"
 */

/*
 * criar string builder percorrer string de tras pra frente adicionar na string
 * nova retornar string nova
 */
