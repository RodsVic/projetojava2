package gpt.SistemaDeVeículos;

import java.util.ArrayList;

/**
 * Classe que representa uma garagem, responsável por armazenar e gerenciar veículos.
 * Permite adicionar, remover, listar, ligar e desligar veículos.
 * 
 * Armazena os veículos em uma lista do tipo {@code ArrayList<Veiculo>}.
 * 
 * @author [Martin]
 */
public class Garagem {

	private ArrayList<Veiculo> veiculos;

	/**
	 * Construtor que inicializa a lista de veículos.
	 */
	public Garagem() {
		veiculos = new ArrayList<>();
	}

	/**
	 * Adiciona um veículo à garagem e exibe uma mensagem de confirmação.
	 * 
	 * @param veiculo Veículo a ser adicionado
	 */
	public void adicionarVeiculo(Veiculo veiculo) {
		veiculos.add(veiculo);
		System.out.println(veiculo.getModelo() + " foi adicionado à garagem.");
	}

	/**
	 * Remove um veículo da garagem, se ele existir.
	 * 
	 * @param veiculo Veículo a ser removido
	 */
	public void removerVeiculo(Veiculo veiculo) {
		if (veiculos.remove(veiculo)) {
			System.out.println(veiculo.getModelo() + " foi removido da garagem.");
		} else {
			System.out.println("Veículo não encontrado na garagem.");
		}
	}

	/**
	 * Exibe os dados de todos os veículos atualmente na garagem.
	 */
	public void mostrarTodos() {
		for (Veiculo v : veiculos) {
			if (v != null) {
				System.out.println(v.mostrarDados());
				System.out.println("------------------");
			}
		}
	}

	/**
	 * Liga todos os veículos da garagem e exibe os modelos que foram ligados.
	 */
	public void ligarTodos() {
		System.out.println("Ligando:");

		for (Veiculo v : veiculos) {
			if (v != null) {
				v.ligar();
				System.out.println(v.getClass().getSimpleName() + " " + v.getModelo());
			}
		}

		System.out.println("Todos os veículos foram ligados\n");
	}

	/**
	 * Desliga todos os veículos da garagem e exibe os modelos que foram desligados.
	 */
	public void desligarTodos() {
		System.out.println("Desligando:");

		for (Veiculo v : veiculos) {
			if (v != null) {
				v.desligar();
				System.out.println(v.getClass().getSimpleName() + " " + v.getModelo());
			}
		}

		System.out.println("Todos os veículos foram desligados\n");
	}

	/** @return Lista de veículos armazenados na garagem */
	public ArrayList<Veiculo> getVeiculos() {
		return veiculos;
	}

	/** 
	 * Define a lista de veículos da garagem.
	 * 
	 * @param veiculos Lista de veículos a ser atribuída
	 */
	public void setVeiculos(ArrayList<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
}

/*Se quiser, posso sugerir também um pequeno ajuste posterior: evitar usar null em listas, 
 * já que a verificação if (v != null) normalmente não é necessária se a lista for bem gerenciada (
 * ou seja, não permitir elementos null). Mas isso é mais sobre boas práticas de uso do ArrayList.*/
