package gpt.SistemaBancario;

public class ContaPoupanca extends Conta {
	
	private double taxaJuros;
	
	public ContaPoupanca (String numero, String titular, double saldoInicial, double taxaJuros) {
		
		super(numero, titular, saldoInicial);
		this.taxaJuros = taxaJuros;
		
	}
	
	public void aplicarJuros(int meses) {
		
		if (meses < 0) {
		
			throw new IllegalArgumentException("Meses inválidos\n");
		
		}
		
		double fator = Math.pow(1 + taxaJuros / 100, meses);
		
		saldo *= fator;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	
}
