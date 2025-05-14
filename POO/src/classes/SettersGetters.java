package classes;

public class SettersGetters {

	public class Aluno {	
		
		String nome;
		int idade;
		String dataNascimento;
		String registroGeral;
		String numeroCpf;
		String nomeMae;
		String nomePai;
		String dataMatricula;
		String nomeEscola;
		String serieMatriculado;
		
		public Aluno () {
			
		}
		
		public Aluno (String nomePadrao) {
			nome = nomePadrao;
		}
		
		public Aluno (String nomePadrao, int idadePadrao) {
			nome = nomePadrao;
			idade = idadePadrao;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getNome() {
			return nome;
		}
	}
}

/*exemplo para aplicar na classe Aluno*/
/*Aluno aluno1 = new Aluno();
 *aluno1.setNome("Joao");
 *System.out.println("Nome = " + aluno.getNome()); */
 