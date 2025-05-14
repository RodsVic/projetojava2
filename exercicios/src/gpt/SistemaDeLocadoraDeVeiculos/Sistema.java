package gpt.SistemaDeLocadoraDeVeiculos;

/**
 * Classe principal responsável por executar e testar o sistema de locadora de veículos.
 * 
 * Esta classe cria instâncias de diversos tipos de veículos (Carro, Moto, Caminhao),
 * adiciona-os à locadora, realiza operações de listagem, aluguel e devolução,
 * demonstrando o comportamento do sistema completo.
 * 
 * Funcionalidades demonstradas:
 * - Criação de frota variada
 * - Adição de veículos à locadora
 * - Listagem de todos os veículos
 * - Aluguel de veículos por modelo
 * - Listagem de veículos disponíveis e alugados
 * - Devolução de veículos alugados
 * 
 * @author [Martin]
 */
public class Sistema {

	/**
	 * Método principal que executa o sistema de testes da locadora de veículos.
	 * 
	 * @param args Argumentos da linha de comando (não utilizados)
	 */
	public static void main(String[] args) {

		// Criação de carros
		Carro carro1 = new Carro("Jeep", "Renegade", 2020, 4);
		Carro carro2 = new Carro("Audi", "R8", 2014, 2);
		Carro carro3 = new Carro("Lamborghini", "Murcielago", 2020, 2);

		// Criação de motos
		Moto moto1 = new Moto("Yamaha", "MT-03", 2022, 321);
		Moto moto2 = new Moto("Honda", "Fazer", 2023, 250);
		Moto moto3 = new Moto("Triumph", "Tiger", 2011, 799);

		// Criação de caminhões
		Caminhao caminhao1 = new Caminhao("Scania", "R 450", 2023, 5);
		Caminhao caminhao2 = new Caminhao("Scania", "R 550", 2023, 10);

		// Instanciando locadora
		Locadora locadora = new Locadora();

		// Adicionando veículos à locadora
		locadora.adicionarVeiculo(carro1);
		locadora.adicionarVeiculo(carro2);
		locadora.adicionarVeiculo(carro3);
		locadora.adicionarVeiculo(moto1);
		locadora.adicionarVeiculo(moto2);
		locadora.adicionarVeiculo(moto3);
		locadora.adicionarVeiculo(caminhao1);
		locadora.adicionarVeiculo(caminhao2);
		System.out.println();

		// Listagem inicial
		System.out.println("===== VEÍCULOS NA GARAGEM =====");
		locadora.listarTodos();

		System.out.println("===== VEÍCULOS DISPONÍVEIS =====");
		locadora.listarDisponiveis();

		// Alugando veículos
		System.out.println("===== VEÍCULOS RETIRADOS =====");
		locadora.alugarVeiculo("R8", 15);
		locadora.alugarVeiculo("Tiger", 7);
		System.out.println();

		// Pós-aluguel
		System.out.println("===== VEÍCULOS DISPONÍVEIS =====");
		locadora.listarDisponiveis();
		
		System.out.println("===== VEÍCULOS ALUGADOS =====");
		locadora.listarAlugados();

		// Devolução de veículo
		System.out.println("===== VEÍCULO DEVOLVIDO =====");
		locadora.devolverVeiculo("Tiger");

		// Pós-devolução
		System.out.println("===== VEÍCULOS DISPONÍVEIS =====");
		locadora.listarDisponiveis();
		
		System.out.println("===== VEÍCULOS ALUGADOS =====");
		locadora.listarAlugados();
		
	}
}
