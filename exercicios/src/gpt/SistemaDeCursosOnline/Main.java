package gpt.SistemaDeCursosOnline;

public class Main {
	public static void main(String[] args) {

		// Criando alguns cursos
		CursoOnline cursoJava = new CursoOnline("Java Básico", "Curso introdutório de Java", 40, "www.cursojava.com");
		CursoPresencial cursoPython = new CursoPresencial("Python Avançado", "Curso presencial de Python", 60,
				"Sala 101 - SP");

		// Criando alunos
		Aluno aluno1 = new Aluno("Maria", "maria@email.com");
		Aluno aluno2 = new Aluno("João", "joao@email.com");

		// Matriculando alunos
		aluno1.matricular(cursoJava);
		aluno1.matricular(cursoPython);

		aluno2.matricular(cursoJava);

		// Atualizando progresso
		aluno1.atualizarProgresso(cursoJava, 45.5);
		aluno1.atualizarProgresso(cursoPython, 20);

		aluno2.atualizarProgresso(cursoJava, 75);

		// Avaliando cursos
		aluno1.avaliarCurso(cursoJava, 9.5);
		aluno1.avaliarCurso(cursoPython, 8.0);

		aluno2.avaliarCurso(cursoJava, 7.5);

		// Listando cursos e progresso
		System.out.println("\nCursos de Maria:");
		aluno1.listarCursos();

		System.out.println("\nCursos de João:");
		aluno2.listarCursos();

		// Chamando interação do curso online
		System.out.println("\nInteração no curso online:");
		cursoJava.interagir();
	}
}
