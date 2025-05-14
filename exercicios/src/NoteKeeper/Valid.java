package NoteKeeper;

public class Valid {
	public static boolean vazio() {
		return GerenciadorNotas.getNotas().isEmpty();
	}
	
	public static void linha() {
		System.out.println();
	}
}
