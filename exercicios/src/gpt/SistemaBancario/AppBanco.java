package gpt.SistemaBancario;

public class AppBanco {

	public static void main(String[] args) {
		 
		ContaCorrente cc = new ContaCorrente("1", "Alice", 1000.0, 500.0);
	    ContaPoupanca cp  = new ContaPoupanca("2", "Bob",   2000.0, 0.5);
	     
	    Banco banco = new Banco();
	    banco.adicionarConta(cc);
	    banco.adicionarConta(cp);
	     
	    cc.depositar(300);
	    cp.depositar(400);
	     
	    cc.sacar(1200);
	     
	    banco.transferir("1", "2", 200);
	     
	    cp.aplicarJuros(6);
	    
	    System.out.println(cc.toString());
	    System.out.println(cp.toString());
	    
	}

}
