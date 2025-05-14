package gpt.SistemaDeVeículos;

/**
 * Classe abstrata que representa um veículo genérico.
 * Fornece atributos e comportamentos comuns a todos os veículos.
 * 
 * @author [Martin]
 */
public abstract class Veiculo {

	protected String marca;
	protected String modelo;
	protected int ano;
	protected boolean ligado;

	/**
	 * Método abstrato que deve ser implementado pelas subclasses para exibir
	 * os dados específicos do veículo.
	 * 
	 * @return String com as informações do veículo.
	 */
	public abstract String mostrarDados();

	/**
	 * Liga o veículo, se ele não estiver ligado.
	 * Exibe uma mensagem no console indicando o estado atual.
	 */
	public void ligar() {
		if (!ligado) {
			ligado = true;
			System.out.println("O veículo " + modelo + " foi ligado\n");
		} else {
			System.out.println("O veículo " + modelo + " já está ligado\n");
		}
	}

	/**
	 * Desliga o veículo, se ele estiver ligado.
	 * Exibe uma mensagem no console indicando o estado atual.
	 */
	public void desligar() {
		if (ligado) {
			ligado = false;
			System.out.println("O veículo " + modelo + " foi desligado\n");
		} else {
			System.out.println("O veículo " + modelo + " está desligado\n");
		}
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

	/** @param ano Ano de fabricação do veículo */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/** @return true se o veículo estiver ligado, false caso contrário */
	public boolean isLigado() {
		return ligado;
	}

	/** @param ligado Define o estado de ligado/desligado do veículo */
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
}
