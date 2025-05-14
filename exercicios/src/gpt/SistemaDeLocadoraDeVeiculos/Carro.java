package gpt.SistemaDeLocadoraDeVeiculos;

/**
 * Classe que representa um carro na locadora.
 * Estende a classe abstrata {@link Veiculo} e implementa
 * a lógica específica para cálculo de aluguel e exibição de dados.
 * 
 * O valor do aluguel é fixo: R$100 por dia.
 * 
 * @author [Martin]
 */
public class Carro extends Veiculo {

	private int numeroDePortas;

	/**
	 * Construtor padrão.
	 */
	public Carro() {
	}

	/**
	 * Construtor completo para inicializar um carro com seus atributos.
	 * 
	 * @param marcaPadrao       Marca do carro
	 * @param modeloPadrao      Modelo do carro
	 * @param ano               Ano do carro
	 * @param numeroDePortas    Quantidade de portas
	 */
	public Carro(String marcaPadrao, String modeloPadrao, int ano, int numeroDePortas) {
		setMarca(marcaPadrao);
		setModelo(modeloPadrao);
		setAno(ano);
		this.numeroDePortas = numeroDePortas;
	}

	/**
	 * Calcula o valor do aluguel do carro.
	 * 
	 * @param dias Número de dias alugados
	 * @return Valor total do aluguel (R$100 por dia)
	 */
	@Override
	public double calcularAluguel(int dias) {
		int aluguel = dias * 100;
		return aluguel;
	}

	/**
	 * Retorna os dados do carro formatados como texto.
	 * 
	 * @return String com informações do carro
	 */
	@Override
	public String mostrarDados() {
		StringBuilder sb = new StringBuilder();
		sb.append("Marca: ").append(getMarca()).append("\n");
		sb.append("Modelo: ").append(getModelo()).append("\n");
		sb.append("Ano: ").append(getAno()).append("\n");
		sb.append("Número de portas: ").append(getNumeroDePortas()).append("\n");
		return sb.toString();
	}

	/** @return Quantidade de portas do carro */
	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	/** @param numeroDePortas Define o número de portas */
	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}
}
