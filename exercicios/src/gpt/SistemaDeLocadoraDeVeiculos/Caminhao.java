package gpt.SistemaDeLocadoraDeVeiculos;

/**
 * Classe que representa um caminhão no sistema de locadora de veículos.
 * Estende a classe abstrata {@link Veiculo} e implementa os métodos específicos
 * para cálculo de aluguel e exibição de dados.
 * 
 * O valor do aluguel é calculado como: R$150 por dia + R$20 por tonelada de carga.
 * 
 * @author [Martin]
 */
public class Caminhao extends Veiculo {

	private int capacidadeDeCarga; // em toneladas

	/**
	 * Construtor padrão.
	 */
	public Caminhao() {
	}

	/**
	 * Construtor completo para inicializar um caminhão com seus atributos.
	 * 
	 * @param marcaPadrao        Marca do caminhão
	 * @param modeloPadrao       Modelo do caminhão
	 * @param ano                Ano do caminhão
	 * @param capacidadeDeCarga  Capacidade de carga em toneladas
	 */
	public Caminhao(String marcaPadrao, String modeloPadrao, int ano, int capacidadeDeCarga) {
		setMarca(marcaPadrao);
		setModelo(modeloPadrao);
		setAno(ano);
		this.capacidadeDeCarga = capacidadeDeCarga;
	}

	/**
	 * Calcula o valor do aluguel do caminhão.
	 * 
	 * @param dias Número de dias alugados
	 * @return Valor total do aluguel (R$150 por dia + R$20 por tonelada de carga)
	 */
	@Override
	public double calcularAluguel(int dias) {
		int aluguel = dias * 150 + (capacidadeDeCarga * 20);
		return aluguel;
	}

	/**
	 * Retorna os dados do caminhão formatados como texto.
	 * 
	 * @return String com informações do caminhão
	 */
	@Override
	public String mostrarDados() {
		StringBuilder sb = new StringBuilder();
		sb.append("Marca: ").append(getMarca()).append("\n");
		sb.append("Modelo: ").append(getModelo()).append("\n");
		sb.append("Ano: ").append(getAno()).append("\n");
		sb.append("Capacidade de carga: ").append(getCapacidadeDeCarga()).append("\n");
		return sb.toString();
	}

	/** @return Capacidade de carga do caminhão (em toneladas) */
	public int getCapacidadeDeCarga() {
		return capacidadeDeCarga;
	}

	/** @param capacidadeDeCarga Define a capacidade de carga em toneladas */
	public void setCapacidadeDeCarga(int capacidadeDeCarga) {
		this.capacidadeDeCarga = capacidadeDeCarga;
	}
}
