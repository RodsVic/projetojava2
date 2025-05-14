package DevDojo;

import javax.swing.JOptionPane;

public class IfElseExercise {

	public static void main(String[] args) {
		//
		String receita = JOptionPane.showInputDialog("Receita anual: ");
		
		double receitaDouble = Double.parseDouble(receita);
		double imposto = 0;
		
		if (receitaDouble <= 34712) {
			imposto = receitaDouble * (9.70 / 100);
		} else if (receitaDouble >= 34713 && receitaDouble <= 68507) {
			imposto = receitaDouble * (37.35 / 100);
		} else {
			imposto = receitaDouble * (49.50 / 100);
		}
		
		double receitaFinal = receitaDouble - imposto;
		
		String mensagem = String.format(
				"Receita Anual: %.2f$\nImposto: %.2f$\nReceita Final: %.2f$",
				receitaDouble, imposto, receitaFinal
		);
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
