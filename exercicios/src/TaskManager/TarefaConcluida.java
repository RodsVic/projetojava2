package TaskManager;

/**
 * Representa uma tarefa que foi concluída.
 * <p>
 * Essa classe pode ser utilizada para armazenar informações adicionais
 * ou para diferenciar as tarefas concluídas das ativas, se necessário.
 * </p>
 */
public class TarefaConcluida {

	/** Descrição da tarefa concluída. */
	String descricao;

	/**
	 * Retorna a descrição da tarefa concluída.
	 * 
	 * @return A descrição da tarefa concluída.
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * Define a descrição da tarefa concluída.
	 * 
	 * @param descricao A nova descrição da tarefa concluída.
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
