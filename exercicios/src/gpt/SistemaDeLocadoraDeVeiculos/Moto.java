package gpt.SistemaDeLocadoraDeVeiculos;

/**
 * Classe que representa uma moto no sistema de locadora.
 * Estende a classe abstrata {@link Veiculo} e implementa os métodos específicos
 * para cálculo do aluguel e exibição dos dados.
 * 
 * O valor do aluguel é fixo: R$70 por dia.
 * 
 * @author [Martin]
 */
public class Moto extends Veiculo {

	private int cilindradas;

	/**
	 * Construtor padrão.
	 */
	public Moto() {
	}

	/**
	 * Construtor completo para inicializar uma moto com seus atributos.
	 * 
	 * @param marcaPadrao   Marca da moto
	 * @param modeloPadrao  Modelo da moto
	 * @param ano           Ano da moto
	 * @param cilindradas   Capacidade do motor em cilindradas
	 */
	public Moto(String marcaPadrao, String modeloPadrao, int ano, int cilindradas) {
		setMarca(marcaPadrao);
		setModelo(modeloPadrao);
		setAno(ano);
		this.cilindradas = cilindradas;
	}

	/**
	 * Calcula o valor do aluguel da moto.
	 * 
	 * @param dias Número de dias alugados
	 * @return Valor total do aluguel (R$70 por dia)
	 */
	@Override
	public double calcularAluguel(int dias) {
		int aluguel = dias * 70;
		return aluguel;
	}

	/**
	 * Retorna os dados da moto formatados como texto.
	 * 
	 * @return String com informações da moto
	 */
	@Override
	public String mostrarDados() {
		StringBuilder sb = new StringBuilder();
		sb.append("Marca: ").append(getMarca()).append("\n");
		sb.append("Modelo: ").append(getModelo()).append("\n");
		sb.append("Ano: ").append(getAno()).append("\n");
		sb.append("Cilindradas: ").append(getCilindradas()).append("\n");
		return sb.toString();
	}

	/** @return Quantidade de cilindradas da moto */
	public int getCilindradas() {
		return cilindradas;
	}

	/** @param cilindradas Define a cilindrada da moto */
	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
}
