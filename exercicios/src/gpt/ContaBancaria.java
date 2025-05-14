package gpt;

public class ContaBancaria {

	private String numero;
	private String titular;
	private double saldo;

	public ContaBancaria(String numero, String titular, double saldo) {

		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;

	}

	public void depositarValor(double valor) {

		if (valor > 0) {
			saldo += valor;
			System.out.println("Valor de R$" + valor + " depositado com sucesso\n");
		
		} else {
		
			System.out.println("Valor inválido para depósito\n");
		
		}
	}

	
	public void sacarValor(double valor) {
		
		if (valor <= 0) {
		
			System.out.println("Valor indisponível para saque");
			System.out.println("Saldo insuficiente\n");
		
		} else if (valor > saldo){

			System.out.println("Saldo insuficiente\n");
		
		} else {
			
			saldo -= valor;
			System.out.println("Saque de R$" + valor + " realizado com sucesso!\n");
		
		}
	}
	
	public void mostrarDados() {
		
		System.out.println("Numero: " + numero);
		System.out.println("Titular: " + titular);
		System.out.println("Saldo: " + saldo);
		System.out.println();
	
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria("8551725-5", "Vic", 0);
		ContaBancaria conta2 = new ContaBancaria("9812415-1", "martin", 1982);
		
		ContaBancaria[] contas = {conta1, conta2};
		
		for (ContaBancaria c : contas) {
			c.mostrarDados();
			c.depositarValor(500);
			System.out.println("Saldo atual: " + c.getSaldo());
			c.sacarValor(1000);
			System.out.println("Saldo atual: " + c.getSaldo());
			System.out.println("----------------------------");
		}
	}
}
