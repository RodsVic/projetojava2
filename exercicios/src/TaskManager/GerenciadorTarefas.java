package TaskManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Gerencia as operações relacionadas às tarefas.
 * <p>
 * Possui métodos para adicionar, remover, listar e atualizar o status das
 * tarefas, além de carregar e salvar tarefas e histórico em arquivos.
 * </p>
 */
public class GerenciadorTarefas {
	/*
	 * Criar uma classe GerenciadorTarefas que contém uma List<Tarefa>. Essa classe
	 * deve ter métodos para: Adicionar uma tarefa. Listar todas as tarefas. Marcar
	 * uma tarefa como concluída (por índice). Remover uma tarefa (por índice).
	 */

	/** Lista que armazena as tarefas ativas. */
	private List<Tarefa> tarefas = new ArrayList<Tarefa>();

	/** Lista que armazena as tarefas concluídas. */
	private List<TarefaConcluida> tarefasConcluidas = new ArrayList<TarefaConcluida>();

	/** Lista que armazena o histórico de tarefas concluídas. */
	private List<String> historico = new ArrayList<String>();

	/**
	 * Adiciona uma nova tarefa, solicitando a descrição ao usuário.
	 * 
	 * @param scanner Objeto Scanner para ler a entrada do usuário.
	 */
	public void adicionarTarefa(Scanner scanner) {
		Tarefa tarefa = new Tarefa();
		System.out.println("Tarefa: ");
		String entrada = scanner.nextLine();
		System.out.println();
		tarefa.setDescricao(entrada);
		tarefas.add(tarefa);
		System.out.println("Tarefa adicionada\n");

	}

	/**
	 * Remove uma tarefa existente, solicitando o índice da tarefa ao usuário.
	 * 
	 * @param scanner Objeto Scanner para ler a entrada do usuário.
	 */
	public void removerTarefa(Scanner scanner) {
		listarTarefas();
		if (tarefas.isEmpty()) {
			System.out.println("Nenhuma tarefa\n");
			return;
		}

		int indice = obterIndiceValido(scanner);
		if (indice != -1) {
			tarefas.remove(indice);
			System.out.println("Tarefa removida\n");
		}
	}

	/**
	 * Lista todas as tarefas ativas com seu status (concluída ou pendente).
	 */
	public void listarTarefas() {
		if (tarefas.isEmpty()) {
			System.out.println("Nenhuma tarefa cadastrada\n");
		} else {
			System.out.println("Lista de tarefas:");
			for (int i = 0; i < tarefas.size(); i++) {
				Tarefa tarefa = tarefas.get(i);
				String status = tarefa.isConcluida() ? "[✔] " : "[ ] ";
				System.out.println((i + 1) + " - " + status + tarefa.getDescricao());
			}
		}
		System.out.println();
	}

	/**
	 * Marca uma tarefa como concluída, atualiza o histórico e salva o histórico em
	 * arquivo.
	 * 
	 * @param scanner Objeto Scanner para ler a entrada do usuário.
	 */
	public void tarefaConcluida(Scanner scanner) {
		listarTarefas();
		if (tarefas.isEmpty()) {
			System.out.println("Nenhuma tarefa\n");
			return;
		}

		int indice = obterIndiceValido(scanner);
		if (indice != -1) {
			Tarefa tarefa = tarefas.get(indice);
			tarefa.concluir();
			historico.add(tarefa.getDescricao());
			System.out.println("Tarefa concluida\n");

			try {
				salvarHistorico();
			} catch (IOException e) {
				System.out.println("Erro ao salvar histórico: " + e.getMessage());
			}

			tarefas.remove(indice);
		}
	}

	/**
	 * Lista as tarefas concluídas (armazenadas na lista de tarefas concluídas).
	 */
	public void listarTarefasConcluidas() {
		if (tarefasConcluidas.isEmpty()) {
			System.out.println("Nenhuma tarefa concluída\n");
		} else {
			System.out.println("Tarefas concluídas:");
			for (int i = 0; i < tarefasConcluidas.size(); i++) {
				System.out.println((i + 1) + " - " + tarefasConcluidas.get(i).getDescricao());
			}
			System.out.println();
		}
	}

	/**
	 * Lista o histórico de tarefas concluídas.
	 */
	public void listarHistoricoTarefas() {
		if (historico.isEmpty()) {
			System.out.println("Nenhuma tarefa disponível\n");
		} else {
			for (int i = 0; i < historico.size(); i++) {
				System.out.println((i + 1) + " - " + historico.get(i));
			}
		}

		System.out.println();
	}

	/**
	 * Salva o histórico de tarefas concluídas em um arquivo de texto.
	 * 
	 * @throws IOException Se ocorrer algum erro de escrita no arquivo.
	 */
	public void salvarHistorico() throws IOException {
		if (historico.isEmpty()) {
			System.out.println("Nenhuma tarefa concluída para salvar\n");
			return;
		}

		try (FileWriter writer = new FileWriter("historico.txt")) {
			for (String descricao : historico) {
				writer.write(descricao + "\n");
			}
			System.out.println("* Histórico salvo com sucesso *\n");
		} catch (IOException e) {
			System.out.println("Erro ao salvar histórico: " + e.getMessage());
		}
	}

	/**
	 * Carrega o histórico de tarefas concluídas de um arquivo de texto.
	 * 
	 * @throws IOException Se ocorrer algum erro ao ler o arquivo.
	 */
	public void carregarHistorico() throws IOException {
		File arquivo = new File("historico.txt");
		if (!arquivo.exists()) {
			arquivo.createNewFile();
		}

		try (Scanner fileScanner = new Scanner(arquivo)) {
			while (fileScanner.hasNextLine()) {
				String linha = fileScanner.nextLine();
				historico.add(linha);
			}
		}
	}

	/**
	 * Lê um índice válido informado pelo usuário para seleção de tarefa.
	 * 
	 * @param scanner Objeto Scanner para leitura de entrada.
	 * @return O índice da tarefa (baseado em zero) ou -1 se a entrada for inválida.
	 */
	private int obterIndiceValido(Scanner scanner) {
		System.out.println("Índice da tarefa:");

		if (!scanner.hasNextInt()) {
			System.out.println("Entrada inválida\n");
			scanner.next();
			return -1;
		}

		int entrada = scanner.nextInt();
		scanner.nextLine();

		if (entrada > 0 && entrada <= tarefas.size()) {
			return entrada - 1;
		} else {
			System.out.println("Índice inválido\n");
			return -1;
		}
	}

	/**
	 * Salva as tarefas ativas em um arquivo de texto.
	 * 
	 * @throws IOException Se ocorrer algum erro ao salvar o arquivo.
	 */
	public void salvarTarefas() throws IOException {
		try (FileWriter writer = new FileWriter("tarefas.txt")) {
			for (Tarefa tarefa : tarefas) {
				writer.write(tarefa.getDescricao() + ";" + tarefa.isConcluida() + "\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Carrega as tarefas ativas de um arquivo de texto.
	 * 
	 * @throws IOException Se ocorrer algum erro ao ler o arquivo.
	 */
	public void carregarTarefas() throws IOException {
		File arquivo = new File("tarefas.txt");
		if (!arquivo.exists()) {
			arquivo.createNewFile();
		}

		try (Scanner fileScanner = new Scanner(arquivo)) {
			while (fileScanner.hasNextLine()) {
				String linha = fileScanner.nextLine();
				String[] partes = linha.split(";");
				if (partes.length < 2)
					continue;

				Tarefa tarefa = new Tarefa(partes[0]);
				if (Boolean.parseBoolean(partes[1])) {
					tarefa.concluir();
				}
				tarefas.add(tarefa);
			}
		} catch (IOException e) {
			System.out.println("Erro ao carregar tarefas: " + e.getMessage());
		}
	}
}
