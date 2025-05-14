package gpt.SistemaDeCursosOnline;

/**
 * Representa um curso online.
 * 
 * Um curso online tem um link de acesso e implementa a interface {@link Interativo} para permitir
 * que os alunos interajam com o conteúdo do curso.
 */
public class CursoOnline extends Curso implements Interativo {

    private String linkAcesso;

    /**
     * Construtor que inicializa um curso online.
     * 
     * @param nome       Nome do curso
     * @param descricao Descrição do curso
     * @param cargaHoraria Carga horária do curso
     * @param linkAcesso Link de acesso ao conteúdo do curso
     */
    public CursoOnline(String nome, String descricao, int cargaHoraria, String linkAcesso) {
        super(nome, descricao, cargaHoraria);
        this.linkAcesso = linkAcesso;
    }

    /**
     * Exibe o tipo do curso, que no caso é um curso online, juntamente com o link de acesso.
     * 
     * @return Tipo do curso
     */
    @Override
    public String exibirTipoCurso() {
        return "Curso Online - Acesso: " + this.linkAcesso;
    }

    /**
     * Método que simula a interação do aluno com o conteúdo online do curso.
     * Exibe o nome do curso e o link de acesso.
     */
    @Override
    public void interagir() {
        System.out.println("Você está interagindo com o conteúdo online do curso: " + this.getNome());
        System.out.println("Acesse o conteúdo através deste link: " + this.linkAcesso);
    }

    /**
     * Retorna o link de acesso ao conteúdo do curso.
     * 
     * @return Link de acesso
     */
    public String getLinkAcesso() {
        return linkAcesso;
    }

    /**
     * Define o link de acesso ao conteúdo do curso.
     * 
     * @param linkAcesso Link de acesso
     */
    public void setLinkAcesso(String linkAcesso) {
        this.linkAcesso = linkAcesso;
    }

}
