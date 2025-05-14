package CodeWars.Kyu_8;

public class NoSpace {

	public static void main(String[] args) {
		String x = "kasjdjka a aa a s  123 2ssss";

		System.out.println(noSpace(x));
	}

	public static String noSpace(final String x) {
		return x.replace(" ", "");
	}
}
