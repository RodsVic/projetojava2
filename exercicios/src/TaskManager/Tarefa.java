package TaskManager;

/**
 * Representa uma tarefa com a descrição e status de conclusão.
 */
public class Tarefa {
	
	/** Descrição da tarefa. */
	private String descricao;
	
	/** Indica se a tarefa foi concluída */
	private boolean concluida;

	/**
	 * Construtor que inicializa a tarefa com a descrição informada.
	 * 
	 * @param descricao Descrição da tarefa.
	 */
	public Tarefa(String descricao) {
		this.descricao = descricao;
	}
	
	/** Construtor padrão. */
	public Tarefa() {
		// Construtor vazio
	}
	
	/**
	 * Retorna a descrição da tarefa
	 * 
	 * @return A descrição da tarefa.
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Define a descrição da tarefa.
	 * 
	 * @param descricao A nova descrição da tarefa.
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * Verifica se a tarefa está concluída.
	 * 
	 * @return {@code true} se a tarefa estiver concluída, {@code false} caso contrário.
	 */
	public boolean isConcluida() {
		return concluida;
	}

	/** Marca a tarefa como concluída. */
	public void concluir() {
		this.concluida = true;
	}
}
