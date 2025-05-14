package gpt;

import java.util.Random;

import javax.swing.JOptionPane;

public class adivinhacao {

	public static void main(String[] args) {
		// 
		Random gerador = new Random();
		int numero = gerador.nextInt(11);
		int contador = 0;
		int resposta = -1;
		
		
		do {
			try {
				resposta = Integer.parseInt(JOptionPane.showInputDialog("Número: "));
				contador++;
				
				if (resposta > numero) {
					JOptionPane.showMessageDialog(null, "Menos!");
				} else if (resposta < numero) {
					JOptionPane.showMessageDialog(null, "Mais!");
				} else {
					JOptionPane.showMessageDialog(null, "Você acertou em " + contador + " tentativas.");
				}
				
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Insira um número válido.");
			}
		
		} while (resposta != numero);	
	}
}
