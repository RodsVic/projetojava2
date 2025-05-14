package gpt.SistemaDeCursosOnline;

/**
 * Representa um curso presencial.
 * 
 * Um curso presencial tem um local onde as aulas acontecem.
 */
public class CursoPresencial extends Curso {

    private String local;

    /**
     * Construtor que inicializa um curso presencial.
     * 
     * @param nome       Nome do curso
     * @param descricao Descrição do curso
     * @param cargaHoraria Carga horária do curso
     * @param local     Local onde as aulas acontecem
     */
    public CursoPresencial(String nome, String descricao, int cargaHoraria, String local) {
        super(nome, descricao, cargaHoraria);
        this.local = local;
    }

    /**
     * Exibe o tipo do curso, que no caso é um curso presencial, juntamente com o local das aulas.
     * 
     * @return Tipo do curso
     */
    @Override
    public String exibirTipoCurso() {
        return "Curso Presencial - Local: " + this.local;
    }

    /**
     * Retorna o local onde as aulas do curso presencial acontecem.
     * 
     * @return Local das aulas
     */
    public String getLocal() {
        return local;
    }

    /**
     * Define o local onde as aulas do curso presencial acontecem.
     * 
     * @param local Local das aulas
     */
    public void setLocal(String local) {
        this.local = local;
    }

}
