package gpt.ControleDeBicicleta;

public class Main {

	public static void main(String[] args) {
		
		Bicicleta minhaBike = new Bicicleta();
		minhaBike.acelerar(10);
		minhaBike.mudarMarcha(3);
		minhaBike.frear(4);
		minhaBike.exibirEstado();
		
	}

}
