package gpt;

public class Aluno {

	private String nome;
	private int idade;
	private double nota;

	public Aluno(String nome, int idade, double nota) {
		
		this.nome = nome;
		this.idade = idade;
		this.nota = nota;

	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Nota: " + nota);
	}
	
	public boolean foiAprovado() {
		return nota >= 6;
	}

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João", 17, 8.5);
		Aluno aluno2 = new Aluno("Maria", 16, 5.0);
		Aluno aluno3 = new Aluno("Pedro", 18, 7.2);

		Aluno[] alunos = {aluno1, aluno2, aluno3};
		
		for (Aluno a : alunos) {
            a.mostrarDados();
            if (a.foiAprovado()) {
                System.out.println("Situação: Aprovado\n");
            } else {
                System.out.println("Situação: Reprovado\n");
            }
        }
	}
}
