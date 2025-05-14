package CodeWars.Kyu_8;

public class ALTerNAtiNGCaSe {

	public static void main(String[] args) {
		System.out.println(toAlternativeString("String"));
		System.out.println(toAlternativeString("Hello World"));
		System.out.println(toAlternativeString("1234!_ "));
		return;
	}

	public static String toAlternativeString(String string) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (Character.isUpperCase(c)) {
				result.append(Character.toLowerCase(c));
			} else if (Character.isLowerCase(c)) {
				result.append(Character.toUpperCase(c));
			} else {
				result.append(c);
			}
		}

		return result.toString();
	}
}

/**
 * altERnaTIng cAsE <=> ALTerNAtiNG CaSe Define
 * 
 * String.prototype.toAlternatingCase (or a similar function/method such as
 * to_alternating_case/toAlternatingCase/ToAlternatingCase in your selected
 * language; see the initial solution for details) such that each lowercase
 * letter becomes uppercase and each uppercase letter becomes lowercase. For
 * example:
 */
