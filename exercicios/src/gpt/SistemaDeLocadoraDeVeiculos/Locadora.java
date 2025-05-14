package gpt.SistemaDeLocadoraDeVeiculos;

import java.util.ArrayList;

/**
 * Classe que representa uma locadora de veículos, responsável pela gestão de frota,
 * controle de veículos alugados e operações de aluguel e devolução.
 * 
 * A locadora mantém duas listas:
 * - Uma com todos os veículos da frota
 * - Outra com os veículos atualmente alugados
 * 
 * Métodos permitem adicionar/remover veículos, listar todos, listar disponíveis/alugados,
 * alugar veículos por modelo e devolver veículos.
 * 
 * @author [Martin]
 */
public class Locadora {

	private ArrayList<Veiculo> frota;
	private ArrayList<Veiculo> alugados;

	/**
	 * Construtor que inicializa as listas de frota e alugados.
	 */
	public Locadora() {
		frota = new ArrayList<>();
		alugados = new ArrayList<>();
	}

	/**
	 * Adiciona um veículo à frota da locadora, se ainda não estiver presente.
	 * 
	 * @param veiculo Veículo a ser adicionado
	 */
	public void adicionarVeiculo(Veiculo veiculo) {
		if (!frota.contains(veiculo)) {
			frota.add(veiculo);
			System.out.println(veiculo.getModelo() + " foi adicionado à garagem\n");
		}
	}

	/**
	 * Remove um veículo da frota, se ele existir.
	 * 
	 * @param veiculo Veículo a ser removido
	 */
	public void removerVeiculo(Veiculo veiculo) {
		if (!frota.contains(veiculo)) {
			System.out.println("Veiculo não encontrado na garagem\n");
		} else {
			frota.remove(veiculo);
			System.out.println(veiculo.getModelo() + " foi removido da garagem\n");
		}
	}

	/**
	 * Lista todos os veículos da frota, disponíveis ou não.
	 */
	public void listarTodos() {
		for (Veiculo v : frota) {
			if (v != null) {
				System.out.println(v.mostrarDados());
				System.out.println("-------------------------\n");
			}
		}
	}

	/**
	 * Lista todos os veículos disponíveis para aluguel.
	 */
	public void listarDisponiveis() {
		for (Veiculo v : frota) {
			if (v != null && v.isDisponivel()) {
				System.out.println(v.mostrarDados());
				System.out.println("-------------------------\n");
			}
		}
	}

	/**
	 * Lista todos os veículos que estão atualmente alugados.
	 */
	public void listarAlugados() {
		for (Veiculo v : alugados) {
			System.out.println(v.mostrarDados());
			System.out.println("-------------------------\n");
		}
	}

	/**
	 * Realiza o aluguel de um veículo com base no modelo informado.
	 * 
	 * @param modelo Modelo do veículo a ser alugado
	 * @param dias   Quantidade de dias para aluguel
	 */
	public void alugarVeiculo(String modelo, int dias) {
		boolean encontrado = false;

		for (Veiculo v : frota) {
			if (v.getModelo().equalsIgnoreCase(modelo)) {
				encontrado = true;

				if (v.isDisponivel()) {
					v.alugar();
					alugados.add(v);
					double preco = v.calcularAluguel(dias);
					System.out.println(modelo + " alugado por " + dias + " dias");
					System.out.printf("Preço do aluguel: R$%.2f%n%n", preco);
				} else {
					System.out.println("O Veiculo " + modelo + " já está alugado\n");
				}
				break;
			}
		}

		if (!encontrado) {
			System.out.println("Veiculo " + modelo + " não encontrado na frota\n");
		}
	}

	/**
	 * Realiza a devolução de um veículo com base no modelo informado.
	 * 
	 * @param modelo Modelo do veículo a ser devolvido
	 */
	public void devolverVeiculo(String modelo) {
		boolean encontrado = false;

		for (Veiculo v : alugados) {
			if (v.getModelo().equalsIgnoreCase(modelo)) {
				encontrado = true;

				if (!v.isDisponivel()) {
					v.devolver();
					alugados.remove(v);
					System.out.println(modelo + " foi devolvido\n");
				}
				break;
			}
		}

		if (!encontrado) {
			System.out.println("Veículo " + modelo + " não encontrado na frota\n");
		}
	}
}
