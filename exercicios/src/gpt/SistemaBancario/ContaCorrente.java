package gpt.SistemaBancario;

public class ContaCorrente extends Conta {

	private double limiteChequeEspecial;
	
	public ContaCorrente(String numero, String titular, double saldoInicial, double limiteChequeEspecial) {
		
		super(numero, titular, saldoInicial);
		this.limiteChequeEspecial = limiteChequeEspecial;
	
	}
	
	@Override
	public void sacar(double valor) {
		
		if (valor <= 0 || valor > (saldo + limiteChequeEspecial)) {
			throw new IllegalArgumentException("Saldo + limite insuficiente pra saque\n");
		}
		
		saldo -= valor;
	}
	
	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	public void setLimiteChequeEspecial(double limite) {
		this.limiteChequeEspecial = limite;
	}

	
	
}
