package gpt.SistemaDeCursosOnline;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe abstrata que representa um curso genérico.
 * Fornece atributos e métodos comuns para diferentes tipos de cursos.
 */
public abstract class Curso {

    protected String nome;
    protected String descricao;
    protected int cargaHoraria;
    protected List<Double> avaliacoes = new ArrayList<>();

    /**
     * Construtor da classe Curso.
     * 
     * @param nome         Nome do curso.
     * @param descricao    Descrição do conteúdo do curso.
     * @param cargaHoraria Duração do curso em horas.
     */
    public Curso(String nome, String descricao, int cargaHoraria) {
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    /**
     * Método abstrato que deve ser implementado para exibir o tipo do curso.
     * 
     * @return Tipo do curso (ex: "Online", "Presencial").
     */
    public abstract String exibirTipoCurso();

    /**
     * Exibe as informações principais do curso e suas avaliações, se existirem.
     */
    public void exibirInformacoes() {
        System.out.println("Nome do curso: " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Carga Horária: " + this.cargaHoraria + " horas");

        if (!avaliacoes.isEmpty()) {
            System.out.println("Avaliações do curso:");
            for (Double avaliacao : avaliacoes) {
                System.out.println("- Nota: " + avaliacao);
            }
        } else {
            System.out.println("Ainda não há avaliações para este curso\n");
        }
    }

    /**
     * Calcula a média das avaliações do curso.
     * 
     * @return Média das notas ou 0.0 se não houver avaliações.
     */
    public double calcularMediaAvaliacao() {
        if (avaliacoes.isEmpty()) {
            return 0.0;
        }

        double soma = 0.0;
        for (double nota : avaliacoes) {
            soma += nota;
        }

        return soma / avaliacoes.size();
    }

    /**
     * Adiciona uma nova nota de avaliação ao curso.
     * 
     * @param nota Nota a ser adicionada (deve estar entre 0 e 10).
     */
    public void adicionarAvaliacao(double nota) {
        if (nota >= 0 && nota <= 10) {
            avaliacoes.add(nota);
        } else {
            System.out.println("Nota inválida! Deve ser entre 0 e 10\n");
        }
    }

    // Métodos getters e setters

    /**
     * @return Nome do curso.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do curso.
     * 
     * @param nome Novo nome do curso.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return Descrição do curso.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do curso.
     * 
     * @param descricao Nova descrição do curso.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return Carga horária do curso.
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * Define a carga horária do curso.
     * 
     * @param cargaHoraria Nova carga horária em horas.
     */
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    /**
     * @return Lista de avaliações do curso.
     */
    public List<Double> getAvaliacoes() {
        return avaliacoes;
    }

    /**
     * Substitui a lista de avaliações do curso.
     * 
     * @param avaliacoes Nova lista de avaliações.
     */
    public void setAvaliacoes(List<Double> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

}
