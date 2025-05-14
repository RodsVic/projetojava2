package DevDojo;

public class SwitchExercise {

	public static void main(String[] args) {
		// utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou fim de semana
		// considere domingo como o primeiro dia da semana
		
		byte dia = 1;
		
		switch (dia) {
		case 1:
			System.out.println("Domingo! Fim de semana.");
			break;
		case 2:
			System.out.println("Segunda-feira! Dia útil.");
			break;
		case 3:
			System.out.println("Terça-feira! Dia útil.");
			break;
		case 4:
			System.out.println("Quarta-feira! Dia útil.");
			break;
		case 5:
			System.out.println("Quinta-feira! Dia útil.");
			break;
		case 6:
			System.out.println("Sexta-feira! Dia útil.");
			break;
		case 7:
			System.out.println("Sábado! Fim de semana.");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		
		
	}

}
