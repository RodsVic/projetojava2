package NoteKeeper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class GerenciadorNotas {

	// TODO Auto-generated method stub
	private static List<Nota> notas = new ArrayList<Nota>();

	private HashMap<String, List<Nota>> maps = new HashMap<String, List<Nota>>();

	public void adicionarNota(Scanner scanner) {
		Nota nota = new Nota();
		System.out.println(Mensagens.NOME_NOTA);
		String entrada = scanner.nextLine();
		System.out.println();
		nota.setNome(entrada);
		notas.add(nota);
		System.out.println(Mensagens.NOTA_ADICIONADA);
		Valid.linha();
	}

	public void removerNota(Scanner scanner) {
		listarNotas();
		if (Valid.vazio()) {
			System.out.println(Mensagens.NENHUMA_NOTA);
			Valid.linha();
			return;
		} else {

			int indice = obterIndiceValido(scanner);
			if (indice != -1) {
				notas.remove(indice);
			}
		}
		Valid.linha();
	}

	public void listarNotas() {
		if (Valid.vazio()) {
			System.out.println(Mensagens.NENHUMA_NOTA);
			Valid.linha();
		} else {
			System.out.println(Mensagens.LISTA_NOTAS);
			for (int i = 0; i < notas.size(); i++) {
				Nota nota = notas.get(i);
				System.out.println((i + 1) + " - " + nota.getNome());
			}
		}
		Valid.linha();
	}

	private int obterIndiceValido(Scanner scanner) {
		System.out.println(Mensagens.LISTA_NOTAS);

		if (!scanner.hasNextInt()) {
			System.out.println(Mensagens.ENTRADA_INVALIDA);
			scanner.nextLine();
			return -1;
		}
		int entrada = scanner.nextInt();
		scanner.nextLine();

		if (entrada > 0 && entrada <= notas.size()) {
			return entrada - 1;
		} else {
			System.out.println(Mensagens.INDICE_INVALIDO);
			return -1;
		}
	}

	public static List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}

}
