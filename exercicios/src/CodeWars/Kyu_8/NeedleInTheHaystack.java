package CodeWars.Kyu_8;

public class NeedleInTheHaystack {

	public static void main(String[] args) {

		Object[] haystack = { "hay", "vic", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk" };

		String resultado = findNeedle(haystack);
		System.out.println(resultado);
	}

	public static String findNeedle(Object[] haystack) {

		for (int i = 0; i < haystack.length; i++) {
			String needle = "needle";
			if ("needle".equals(haystack[i])) {
				return "found the needle at position " + i;
			}
		}
		return "needle not found";
	}
}

/**
 * Write a function findNeedle() that takes an array full of junk but containing
 * one "needle"
 * 
 * After your function finds the needle it should return a message (as a string)
 * that says:
 * 
 * "found the needle at position " plus the index it found the needle, so:
 * 
 * Example(Input --> Output)
 * 
 * ["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found
 * the needle at position 5"
 */
