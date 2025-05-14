package CodeWars;

public class Greet {

	public static void main(String[] args) {
		String name = "vic";
		String owner = "vic";

		System.out.println(greet(name, owner));
	}

	static String greet(String name, String owner) {
		if (name.equals(owner)) {
			return "Hello boss";
		} else {
			return "Hello guest";
		}
	}
}
