package gpt.SistemaDeCursosOnline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Representa um aluno em um sistema de cursos online.
 * 
 * Um aluno pode se matricular em cursos, acompanhar seu progresso e avaliar os cursos.
 */
public class Aluno {

    private String nome;
    private String email;
    private List<Curso> cursosMatriculados = new ArrayList<>();
    private Map<Curso, Double> progresso = new HashMap<>();

    /**
     * Construtor que inicializa um aluno com nome e email.
     * 
     * @param nome  Nome do aluno
     * @param email Email do aluno
     */
    public Aluno(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    /**
     * Matricula o aluno em um curso.
     * Também inicializa o progresso do curso em 0%.
     * 
     * @param curso Curso a ser matriculado
     */
    public void matricular(Curso curso) {
        cursosMatriculados.add(curso);
        progresso.put(curso, 0.0);
    }

    /**
     * Lista todos os cursos em que o aluno está matriculado
     * com o respectivo progresso.
     */
    public void listarCursos() {
        for (Curso c : cursosMatriculados) {
            Double progressoCurso = progresso.get(c);
            System.out.println("Curso: " + c.getNome() + " | Progresso: " + progressoCurso + "%");
        }
    }

    /**
     * Atualiza o progresso do aluno em um determinado curso.
     * 
     * @param curso       Curso em andamento
     * @param porcentagem Progresso entre 0 e 100%
     */
    public void atualizarProgresso(Curso curso, double porcentagem) {
        if (!cursosMatriculados.contains(curso)) {
            System.out.println("Erro: Aluno não está matriculado neste curso\n");
            return;
        }

        if (porcentagem >= 0 && porcentagem <= 100) {
            progresso.put(curso, porcentagem);
        } else {
            System.out.println("Porcentagem inválida! Deve estar entre 0 e 100\n");
        }
    }

    /**
     * Permite que o aluno avalie um curso com uma nota de 0 a 10.
     * 
     * @param curso Curso avaliado
     * @param nota  Nota da avaliação
     */
    public void avaliarCurso(Curso curso, double nota) {
        if (nota >= 0 && nota <= 10) {
            curso.adicionarAvaliacao(nota);
            System.out.println("Avaliação de " + nota + " registrada com sucesso pelo aluno " + nome);
        } else {
            System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
        }
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Curso> getCursosMatriculados() {
        return cursosMatriculados;
    }

    public void setCursosMatriculados(List<Curso> cursosMatriculados) {
        this.cursosMatriculados = cursosMatriculados;
    }

    public Map<Curso, Double> getProgresso() {
        return progresso;
    }

    public void setProgresso(Map<Curso, Double> progresso) {
        this.progresso = progresso;
    }

}
