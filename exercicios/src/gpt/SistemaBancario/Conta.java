package gpt.SistemaBancario;

public abstract class Conta {
	String numero;

	String titular;

	double saldo;
	
	public Conta() {
		
	}

	public Conta(String numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public void depositar(double valor) {

		if (valor <= 0) {
			throw new IllegalArgumentException("Valor de depósito deve ser positivo");

		}

		saldo += valor;
		System.out.println("Valor de " + valor + " depositado com sucesso\n");

	}

	public void sacar(double valor) {

		if (valor <= 0 || valor > saldo) {
			throw new IllegalArgumentException("Saldo insuficiente ou valor inválido");
		}
		saldo -= valor;
		System.out.println("Saque autorizado no valor de " + valor);
	}

	@Override
	public String toString() {
		return String.format("Conta Nº %s | Titular: %s | Saldo R$ %.2f\n", numero, titular, saldo);
	}

	public String getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

}
