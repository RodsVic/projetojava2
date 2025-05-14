package CodeWars.Kyu_8;

public class DoubleChar {

	public static void main(String[] args) {
		System.out.println(doubleChar("String"));
		System.out.println(doubleChar("Hello World"));
		System.out.println(doubleChar("1234!_ "));
		return;
	}

	public static String doubleChar(String s) {
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			result.append(c).append(c);
		}

		return result.toString();
	}
}

/**
 * Given a string, you have to return a string in which each character
 * (case-sensitive) is repeated once. "String" -> "SSttrriinngg" "Hello World"
 * -> "HHeelllloo WWoorrlldd" "1234!_ " -> "11223344!!__ "
 */

/*
 * objetivo: adicionar um char a mais
 * 
 * busca o indice quando chegar no indice, ve o valor e duplicar ele
 */
