package CodeWars.Kyu_8;

public class OppositeNumber {

	public static void main(String[] args) {
		int num = 42;
		int num2 = -42;
		System.out.println(opposite(num));
		System.out.println(opposite(num2));
	}

	public static int opposite(int number) {

		int op = -number;
		return op;
	}
}
