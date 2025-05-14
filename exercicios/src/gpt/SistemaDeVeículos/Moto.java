package gpt.SistemaDeVeículos;

/**
 * Classe que representa uma moto, que é um tipo de veículo.
 * Inclui informações específicas como a quantidade de cilindradas.
 * 
 * Herda os atributos e métodos da classe {@link Veiculo}.
 * 
 * @author [Martin]
 */
public class Moto extends Veiculo {

	private int cilindradas;

	/**
	 * Construtor padrão da classe Moto.
	 */
	public Moto() {
		// Construtor vazio
	}

	/**
	 * Construtor com parâmetros para inicializar uma moto com os dados básicos.
	 * 
	 * @param marcaPadrao  Marca da moto
	 * @param modeloPadrao Modelo da moto
	 * @param ano          Ano de fabricação
	 * @param cilindradas  Cilindrada do motor
	 */
	public Moto(String marcaPadrao, String modeloPadrao, int ano, int cilindradas) {
		setMarca(marcaPadrao);
		setModelo(modeloPadrao);
		setAno(ano);
		setCilindradas(cilindradas);
	}

	/**
	 * Simula a ação de empinar a moto, exibindo uma mensagem no console.
	 */
	public void empinar() {
		System.out.println("Empinando a moto " + getModelo());
		System.out.println();
	}

	/**
	 * Retorna uma representação textual com os dados da moto.
	 * 
	 * @return String com informações da moto.
	 */
	@Override
	public String mostrarDados() {
		StringBuilder sb = new StringBuilder();
		sb.append("Marca: ").append(getMarca()).append("\n");
		sb.append("Modelo: ").append(getModelo()).append("\n");
		sb.append("Ano: ").append(getAno()).append("\n");
		sb.append("Cilindradas: ").append(getCilindradas());
		return sb.toString();
	}

	/**
	 * Redefine o método {@code toString()} para exibir os dados da moto.
	 */
	@Override
	public String toString() {
		return mostrarDados();
	}

	/** @return Quantidade de cilindradas da moto */
	public int getCilindradas() {
		return cilindradas;
	}

	/**
	 * Define a quantidade de cilindradas da moto, se o valor for maior que zero.
	 * 
	 * @param cilindradas Cilindradas do motor
	 */
	public void setCilindradas(int cilindradas) {
		if (cilindradas > 0) {
			this.cilindradas = cilindradas;
		} else {
			System.out.println("Número de cilindradas inválido. Deve ser maior que zero.\n");
		}
	}
}
