package gpt.SistemaDeVeículos;

/**
 * Classe que representa um carro, que é um tipo de veículo.
 * Contém informações adicionais como número de portas.
 * 
 * Herda atributos e métodos da classe abstrata {@link Veiculo}.
 * 
 * @author [Martin]
 */
public class Carro extends Veiculo {

	private int numeroDePortas;

	/**
	 * Construtor padrão da classe Carro.
	 */
	public Carro() {
		// Construtor vazio
	}

	/**
	 * Construtor com parâmetros para inicializar um carro com os dados básicos.
	 * 
	 * @param marcaPadrao     Marca do carro
	 * @param modeloPadrao    Modelo do carro
	 * @param ano             Ano de fabricação
	 * @param numeroDePortas  Quantidade de portas
	 */
	public Carro(String marcaPadrao, String modeloPadrao, int ano, int numeroDePortas) {
		setMarca(marcaPadrao);
		setModelo(modeloPadrao);
		setAno(ano);
		this.numeroDePortas = numeroDePortas;
	}

	/**
	 * Simula a abertura do porta-malas do carro, exibindo mensagem no console.
	 */
	public void abrirPortaMalas() {
		System.out.println("Abrindo a porta do " + getModelo());
		System.out.println();
	}

	/**
	 * Retorna uma representação textual com os dados do carro.
	 * 
	 * @return String com informações do carro.
	 */
	@Override
	public String mostrarDados() {
		StringBuilder sb = new StringBuilder();
		sb.append("Marca: ").append(getMarca()).append("\n");
		sb.append("Modelo: ").append(getModelo()).append("\n");
		sb.append("Ano: ").append(getAno()).append("\n");
		sb.append("Número de portas: ").append(numeroDePortas);
		return sb.toString();
	}

	/**
	 * Redefine o método {@code toString()} para exibir os dados do carro.
	 */
	@Override
	public String toString() {
		return mostrarDados();
	}

	/** @return Número de portas do carro */
	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	/**
	 * Define o número de portas do carro, se o valor for maior que zero.
	 * 
	 * @param numeroDePortas Número de portas a ser atribuído
	 */
	public void setNumeroDePortas(int numeroDePortas) {
		if (numeroDePortas > 0) {
			this.numeroDePortas = numeroDePortas;
		} else {
			System.out.println("Número de portas inválido\n");
		}
	}
}
