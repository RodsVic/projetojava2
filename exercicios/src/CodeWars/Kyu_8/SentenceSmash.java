package CodeWars.Kyu_8;

public class SentenceSmash {

	public static void main(String[] args) {
		System.out.println(smash("Hello", "world", "this", "is", "Java"));
		System.out.println(smash2("Hi", "world"));
	}

	public static String smash(String... words) {

		return String.join(" ", words);

	}

	public static String smash2(String... words) {

		if (words.length == 0) {
			return "";

		}

		StringBuilder result = new StringBuilder();

		for (String word : words) {

			if (result.length() > 0) {
				result.append(" ");
			}

			result.append(word);

		}

		return result.toString();
	}
}

/*
 * Write a function that takes an array of words and smashes them together into
 * a sentence and returns the sentence. You can ignore any need to sanitize
 * words or add punctuation, but you should add spaces between each word. Be
 * careful, there shouldn't be a space at the beginning or the end of the
 * sentence!
 * 
 * ['hello', 'world', 'this', 'is', 'great'] => 'hello world this is great']
 * 
 * words = ['hello', 'world', 'this', 'is', 'great'] smash(words) # returns
 * "hello world this is great"
 * 
 * Assumptions You can assume that you are only given words. You cannot assume
 * the size of the array. You can assume that you do get an array.
 * 
 */
