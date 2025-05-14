package executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import classes.Aluno;
import classes.Diretor;
import classes.Disciplina;
import classesauxiliares.FuncaoAutenticacao;
import constantes.StatusAlunos;
import exceptions.ExceptionProcessarNota;
import interfaces.PermitirAcesso;

public class PrimeiraClasseJava {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		try {

		
		try {
			
			File fill = new File("c://lines.txt");
			Scanner scanner = new Scanner(fill);
			
		} catch (FileNotFoundException e) {
			throw new ExceptionProcessarNota("Erro no processamento das notas\n");
		}
			
			String login = JOptionPane.showInputDialog("Informe o login");
			String senha = JOptionPane.showInputDialog("Informe a senha");

			PermitirAcesso permitirAcesso = new Diretor(login, senha);

			if (new FuncaoAutenticacao(permitirAcesso).autenticar()) {

				List<Aluno> alunos = new ArrayList<Aluno>();

				// lista que contém uma chave para identificar uma sequência de valores
				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

				for (int qtd = 1; qtd <= 1; qtd++) {

					String nome = JOptionPane.showInputDialog("Nome do aluno " + qtd + ":");

					Aluno aluno1 = new Aluno();
					aluno1.setNome(nome);

					for (int pos = 1; pos <= 1; pos++) {
						String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + ":");
						String notaDisciplina = JOptionPane.showInputDialog("Nota " + pos + ":");

						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina(nomeDisciplina);
						disciplina.setNota(Double.valueOf(notaDisciplina));

						aluno1.getDisciplinas().add(disciplina);
					}

					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

					if (escolha == 0) {
						int continuarRemover = 0;
						int posicao = 1;

						while (continuarRemover == 0) {
							String disciplinaRemover = JOptionPane.showInputDialog("Disciplina a ser removida:");
							aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
							posicao++;
							continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
						}
					}

					alunos.add(aluno1);
				}

				maps.put(StatusAlunos.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAlunos.REPROVADO, new ArrayList<Aluno>());
				maps.put(StatusAlunos.RECUPERACAO, new ArrayList<Aluno>());

				for (Aluno aluno : alunos) {
					if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAlunos.APROVADO)) {
						maps.get(StatusAlunos.APROVADO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAlunos.RECUPERACAO)) {
						maps.get(StatusAlunos.RECUPERACAO).add(aluno);
					} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAlunos.REPROVADO)) {
						maps.get(StatusAlunos.REPROVADO).add(aluno);
					}
				}

				System.out.println("---------- Lista dos aprovados ----------");
				for (Aluno aluno : maps.get(StatusAlunos.APROVADO)) {
					System.out.println("Nome do aluno = " + aluno.getNome());
					System.out.println("Resultado = " + aluno.getAlunoAprovado2());
					System.out.println("Média = " + aluno.getMediaNota());
					System.out.println("------------------------------");
					System.out.println();
				}

				System.out.println("---------- Lista de recuperação ---------- ");
				for (Aluno aluno : maps.get(StatusAlunos.RECUPERACAO)) {
					System.out.println("Nome do aluno = " + aluno.getNome());
					System.out.println("Resultado = " + aluno.getAlunoAprovado2());
					System.out.println("Média = " + aluno.getMediaNota());
					System.out.println("------------------------------");
					System.out.println();
				}

				System.out.println("---------- Lista dos reprovados ---------- ");
				for (Aluno aluno : maps.get(StatusAlunos.REPROVADO)) {
					System.out.println("Nome do aluno = " + aluno.getNome());
					System.out.println("Resultado = " + aluno.getAlunoAprovado2());
					System.out.println("Média = " + aluno.getMediaNota());
					System.out.println("------------------------------");
					System.out.println();
				}

			} else {

				JOptionPane.showMessageDialog(null, "Acesso não permitido");

			}

		} catch (Exception e) {
			
			StringBuilder saida = new StringBuilder();

			e.printStackTrace();

			System.out.println("Mensagem: " + e.getMessage());
			
			for (int i = 0; i < e.getStackTrace().length; i++) {
				
				saida.append("\nClasse de erro: " + e.getStackTrace()[i].getClassName());
				saida.append("Método de erro: " + e.getStackTrace()[i].getMethodName());
				saida.append("Linha de erro: " + e.getStackTrace()[i].getLineNumber());
				saida.append("Classe: " + e.getClass().getName());
				System.out.println();
				
			}
			
			JOptionPane.showMessageDialog(null, "Erro ao processar notas" + saida.toString());

		}
	}
}
