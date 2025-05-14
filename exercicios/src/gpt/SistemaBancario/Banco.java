package gpt.SistemaBancario;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private List<Conta> contas = new ArrayList<>();
	
	public void adicionarConta(Conta c) {
		contas.add(c);
	}
	
	public void removerConta(String numero) {
		contas.removeIf(c -> c.getNumero().equals(numero));
	}

	public Conta buscarConta(String numero ) {
		
		return contas.stream()
				.filter(c -> c.getNumero().equals(numero))
				.findFirst()
				.orElse(null);
		
	}

	public void transferir(String origem, String destino, double valor) {
		
		Conta cOrig = buscarConta(origem);
		Conta cDest = buscarConta(destino);
		
		if (cOrig == null || cDest == null) {
			throw new IllegalArgumentException("Conta de origem ou destino não encontrada\n");
		}
		
		cOrig.sacar(valor);
		cDest.depositar(valor);
		System.out.println("Transação realizada com sucesso\n");
		// System.out.println("Conta " + cOrig + " realizou um depósito no valor de " + valor + " para a conta número " + cDest);
		// System.out.println();
	
	}



}
