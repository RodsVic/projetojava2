package TaskManager;

import java.io.IOException;
import java.util.Scanner;

/**
 * Classe principal que inicia o Task Manager.
 * <p>
 * Essa classe inicializa o gerenciador de tarefas, carrega as tarefas e o histórico,
 * e apresenta um menu interativo para o usuário manipular as tarefas.
 * </p>
 * 
 * @author Victor
 */
public class TaskManager {
	
	/**
	 * Método principal que inicia a execução do Task Manager.
	 * 
	 * @param args Argumentos da linha de comando.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GerenciadorTarefas gerenciador = new GerenciadorTarefas();

		try {
			gerenciador.carregarTarefas();
		} catch (IOException e) {
			System.out.println("Erro ao carregar tarefas: " + e.getMessage());
		}
		
		try {
			gerenciador.carregarHistorico();
		} catch (IOException e) {
			System.out.println("Erro ao carregar histórico: " + e.getMessage());
		}
		
		int opcao;

		do {
			System.out.println("Opção:");
			System.out.println("[1] - Adicionar");
			System.out.println("[2] - Remover");
			System.out.println("[3] - Listar");
			System.out.println("[4] - Tarefa concluída");
			System.out.println("[5] - Histórico de tarefas");
			System.out.println("[9] - Sair");
			System.out.println();

			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				gerenciador.adicionarTarefa(scanner);
				break;

			case 2:
				gerenciador.removerTarefa(scanner);
				break;

			case 3:
				gerenciador.listarTarefas();
				break;
			
			case 4:
				gerenciador.tarefaConcluida(scanner);
				break;
				
			case 5:
				gerenciador.listarHistoricoTarefas();
				break;
			
			case 9:
				System.out.println("Saindo");
				
				try {
					gerenciador.salvarTarefas();
				} catch (IOException e) {
					System.out.println("Erro ao salvar tarefas: " + e.getMessage());
				}
				
				break;

			default:
				System.out.println("Opção inválida");
			}

		} while (opcao != 9);
		scanner.close();
	}
}
