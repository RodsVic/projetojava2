package CodeWars;

public class SmallestIntegerFinder {

	public static int findSmallestInt(int[] args) {
		/**
		 * Como abordar esse problema? Entenda o problema: Você precisa encontrar o
		 * menor número dentro de um array de inteiros.
		 * 
		 * Planeje a solução:
		 * 
		 * Percorra todos os elementos do array.
		 * 
		 * Mantenha uma variável para armazenar o menor valor encontrado.
		 * 
		 * Compare cada número do array com esse menor valor e atualize-o se necessário.
		 * 
		 * Retorne o menor valor após verificar todos os elementos.
		 * 
		 * Dicas para resolver no Java: Como inicializar a variável do menor valor?
		 * 
		 * Qual estrutura de repetição usar para percorrer o array?
		 * 
		 * Como fazer a comparação para atualizar o menor valor?
		 */

		int menor = args[0]; // Começamos assumindo que o primeiro número é o menor

		for (int i = 1; i < args.length; i++) { // Percorremos a partir do segundo elemento
			if (args[i] < menor) { // Se encontrarmos um número menor, atualizamos a variável
				menor = args[i];
			}
		}

		return menor; // Retornamos o menor número encontrado
	}

	public static void main(String[] args) {
		int[] numbers1 = { 34, 15, 88, 2 };
		int[] numbers2 = { 34, -345, -1, 100 };

		System.out.println(findSmallestInt(numbers1)); // Saída: 2
		System.out.println(findSmallestInt(numbers2)); // Saída: -345
	}
}