package gpt;

public class Biblioteca {

	public static class Livro {
		
		private String titulo;
		private String autor;
		private boolean disponivel;

		public Livro (String titulo, String autor, boolean disponivel) {
			
			this.titulo = titulo;
			this.autor = autor;
			this.disponivel = disponivel;
		
		}
		
		public void emprestarLivro() {
			
			disponivel = false;
		
		}
		
		public void devolverLivro() {
			
			disponivel = true;
		
		}
		
		public void mostrarDados() {
		
			System.out.println("Titulo: " + titulo);
			System.out.println("Autor: " + autor);
			System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
			System.out.println();
			
		}
		
		public String getTitulo() {
			return titulo;
		}

		public String getAutor() {
			return autor;
		}

		public boolean isDisponivel() {
			return disponivel;
		}

		public void setDisponivel(boolean disponivel) {
			this.disponivel = disponivel;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}
		
	}
		
	public static class Usuario {
		
		private String nome;
		private Livro[] livrosEmprestados = new Livro[3];
		
		public Usuario(String nome) {
			
			this.nome = nome;
			this.livrosEmprestados = new Livro[3];
			
		}
		
		public void emprestarLivroUsuario(Livro livro) {
			
			if (!livro.isDisponivel()) {
				System.out.println("Livro indisponível para empréstimo\n");
				return;
				
			}
			
			int contador = 0;
			
			for (Livro l : livrosEmprestados) {
				if (l != null) {
					contador++;
				}
			}
			
			if (contador >= 3) {
				System.out.println("Usuário já aitngiu o limite de livros emprestados\n");
				return;
			}
			
			for (int i = 0; i < livrosEmprestados.length; i++) {
				if (livrosEmprestados[i] == null) {
					livrosEmprestados[i] = livro;
					livro.setDisponivel(false);
					System.out.println("Livro " + livro.getTitulo() + " emprestado com sucesso ao usuário " + nome + "\n");
					return;
					
				}
			}
			
		}
		
		public void devolverLivroUsuario(String titulo) {
			
			for (int i = 0; i < livrosEmprestados.length; i++) {
				Livro livro = livrosEmprestados[i];
				if (livro != null && livro.getTitulo().equals(titulo)) {
					livrosEmprestados[i] = null;
					livro.setDisponivel(true);
					break;
				
				}
			}
		}
		
		public void mostrarLivrosEmprestados() {
			
			System.out.println("Livros emprestados por " + nome);
			boolean temLivros = false;
			
			for (Livro livro : livrosEmprestados) {
				if (livro != null) {
					System.out.println("Título: " + livro.getTitulo());
					temLivros = true;
					
				}
			}
			
			if (!temLivros) {
				System.out.println("Nenhum livro emprestado\n");
				
			}
			System.out.println("-------------------------------------------------------");
		}
		

		public String getNome() {
			return nome;
		}

		public Livro[] getLivrosEmprestados() {
			return livrosEmprestados;
		}

		public void setLivrosEmprestados(Livro[] livrosEmprestados) {
			this.livrosEmprestados = livrosEmprestados;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
			Livro livro1 = new Livro("A Guerra dos Tronos", "George R R Martin", true);
			Livro livro2 = new Livro("A Fúria dos Reis", "George R R Martin", true);
			Livro livro3 = new Livro("A Tormenta de Espadas", "George R R Martin", true);
			Livro livro4 = new Livro("O Festim dos Corvos", "George R R Martin", true);
			Livro livro5 = new Livro("A Dança dos Dragões", "George R R Martin", true);
			
			Livro[] livros = {livro1, livro2, livro3, livro4, livro5};
			
			Usuario usuario1 = new Usuario("Vic");
			
			Usuario usuario2 = new Usuario("Martin");
		
			Usuario[] usuarios = {usuario1, usuario2};
		
			usuarios[0].emprestarLivroUsuario(livro1);
			usuario1.emprestarLivroUsuario(livro2);
			usuario1.mostrarLivrosEmprestados();
			
			System.out.println();

			usuarios[1].emprestarLivroUsuario(livro3);
			usuario2.emprestarLivroUsuario(livro4);
			usuario2.emprestarLivroUsuario(livro5);
			usuario2.mostrarLivrosEmprestados();
			
			for (Usuario usuario : usuarios) {
				usuario.mostrarLivrosEmprestados();
			}
			
			usuario2.devolverLivroUsuario("A Tormenta de Espadas");
			usuario2.mostrarLivrosEmprestados();
			System.out.println();
		
		
		
	}

}

	
