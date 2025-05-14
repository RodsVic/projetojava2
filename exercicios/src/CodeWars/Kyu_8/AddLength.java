package CodeWars.Kyu_8;

import java.util.Arrays;

public class AddLength {

	public static void main(String[] args) {
		String str = "Java so cool";
		String str2 = "Jesse Pinkman";
		System.out.println(Arrays.toString(addLength(str)));
		System.out.println(Arrays.toString(addLength(str2)));
	}

	public static String[] addLength(String str) {

		String[] split = str.split(" ");
		String[] res = new String[split.length];

		for (int i = 0; i < split.length; i++) {

			StringBuilder sb = new StringBuilder();
			sb.append(split[i]);
			sb.append(" ");
			sb.append(split[i].length());
			res[i] = sb.toString();
		}

		return res;

	}

}

/**
 * What if we need the length of the words separated by a space to be added at
 * the end of that same word and have it returned as an array?
 * 
 * Example(Input --> Output)
 * 
 * "apple ban" --> ["apple 5", "ban 3"] "you will win" -->["you 3", "will 4",
 * "win 3"]
 * 
 * Your task is to write a function that takes a String and returns an
 * Array/list with the length of each word added to each element .
 * 
 * Note: String will have at least one element; words will always be separated
 * by a space.
 * 
 */

/*
 * dar split() separar as palavras da frase em itens de lista
 * percorrer cada letra de cada item
 * retornar a palavra e quantas letras foram percorridas em
 * cada item
 * 
 */