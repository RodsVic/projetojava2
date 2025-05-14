package gpt.SistemaDeVeículos;

/**
 * Classe principal responsável por inicializar e executar o sistema de veículos.
 * 
 * Cria instâncias de {@link Carro} e {@link Moto}, adiciona os veículos em uma {@link Garagem},
 * realiza ações específicas como ligar/desligar veículos, mostrar dados e executar
 * ações específicas de cada tipo de veículo.
 * 
 * Este é o ponto de entrada da aplicação.
 * 
 * @author [Martin]
 */
public class SistemaDeVeiculos {

	/**
	 * Método principal que executa o sistema de veículos.
	 * 
	 * @param args Argumentos da linha de comando (não utilizados)
	 */
	public static void main(String[] args) {

		// Criação de carros
		Carro carro1 = new Carro("Honda", "New Civic", 2023, 4);
		Carro carro2 = new Carro("Peugeot", "207", 2013, 4);
		Carro carro3 = new Carro("Hyundai", "Veloster", 2023, 3);

		// Criação de motos
		Moto moto1 = new Moto("Yamaha", "MT-03", 2022, 321);
		Moto moto2 = new Moto("Honda", "CG 160", 2021, 162);

		// Criação da garagem e adição dos veículos
		Garagem garagem = new Garagem();
		garagem.adicionarVeiculo(carro1);
		garagem.adicionarVeiculo(carro2);
		garagem.adicionarVeiculo(carro3);
		garagem.adicionarVeiculo(moto1);
		garagem.adicionarVeiculo(moto2);
		System.out.println();

		// Exibição dos dados de todos os veículos
		System.out.println("== VEÍCULOS NA GARAGEM ==");
		garagem.mostrarTodos();

		// Ligando todos os veículos
		System.out.println("== LIGANDO TODOS ==");
		garagem.ligarTodos();

		// Executando ações específicas por tipo de veículo
		System.out.println("== AÇÕES ESPECIAIS ==");
		for (Veiculo v : garagem.getVeiculos()) {
			if (v instanceof Carro) {
				((Carro) v).abrirPortaMalas();
			} else if (v instanceof Moto) {
				((Moto) v).empinar();
			}
		}

		// Desligando todos os veículos
		System.out.println("== DESLIGANDO TODOS ==");
		garagem.desligarTodos();
	}
}
