package gpt.SistemaDeCursosOnline;

/**
 * Interface que representa a capacidade de interação em um curso.
 * 
 * Implementações dessa interface devem definir como ocorre a interação
 * com os alunos (ex: fóruns, chats, chamadas ao vivo, etc).
 */
public interface Interativo {

    /**
     * Realiza uma ação de interação no curso.
     */
    public void interagir();

}
