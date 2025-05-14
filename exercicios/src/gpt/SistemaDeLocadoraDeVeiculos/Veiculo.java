package gpt.SistemaDeLocadoraDeVeiculos;

/**
 * Classe abstrata que representa um veículo genérico em um sistema de locadora.
 * Define atributos e comportamentos comuns a todos os tipos de veículos, como
 * marca, modelo, ano e disponibilidade.
 * 
 * As subclasses devem implementar os métodos {@code calcularAluguel} e {@code mostrarDados}.
 * 
 * @author [Martin]
 */
public abstract class Veiculo {

	protected String marca;
	protected String modelo;
	protected int ano;
	protected boolean disponivel = true;

	/**
	 * Calcula o valor do aluguel com base na quantidade de dias.
	 * Deve ser implementado pelas subclasses.
	 * 
	 * @param dias Quantidade de dias a serem alugados
	 * @return Valor total do aluguel
	 */
	public abstract double calcularAluguel(int dias);

	/**
	 * Retorna uma representação textual com os dados do veículo.
	 * Deve ser implementado pelas subclasses.
	 * 
	 * @return Dados formatados do veículo
	 */
	public abstract String mostrarDados();

	/**
	 * Marca o veículo como alugado (indisponível).
	 */
	public void alugar() {
		disponivel = false;
	}

	/**
	 * Marca o veículo como disponível.
	 */
	public void devolver() {
		disponivel = true;
	}

	/** @return Marca do veículo */
	public String getMarca() {
		return marca;
	}

	/** @param marca Marca do veículo */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/** @return Modelo do veículo */
	public String getModelo() {
		return modelo;
	}

	/** @param modelo Modelo do veículo */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/** @return Ano de fabricação do veículo */
	public int getAno() {
		return ano;
	}

	/** @param ano Ano de fabricação */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/** @return {@code true} se o veículo estiver disponível para aluguel, caso contrário {@code false} */
	public boolean isDisponivel() {
		return disponivel;
	}

	/** @param disponivel Define se o veículo está disponível */
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
}
