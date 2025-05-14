package CodeWars.Kyu_7;

public class FindTheStrayNumber {

	public static void main(String[] args) {
		
		int[] numbers = {1, 6, 1, 1 };
		System.out.println(stray(numbers));
	
	}

	public static int stray(int[] numbers) {
		
		int common;

		if (numbers[0] == numbers[1]) {
			common = numbers[0];

		} else if (numbers[0] == numbers[2]) {
			common = numbers[0];

		} else {
			common = numbers[1];

		}
		
		for (int num : numbers) {
			if (num != common) {
				return num;
			}
		}
		
		return 0;
	
	}
}
/**
 * You are given an odd-length array of integers, in which all of them are the
 * same, except for one single number.
 * 
 * Complete the method which accepts such an array, and returns that single
 * different number.
 * 
 * The input array will always be valid! (odd-length >= 3)
 * 
 * Examples 
 * [1, 1, 2] ==> 2 
 * [17, 17, 3, 17, 17, 17, 17] ==> 3
 * 
 */