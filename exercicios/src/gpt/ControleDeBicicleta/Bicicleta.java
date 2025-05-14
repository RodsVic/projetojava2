package gpt.ControleDeBicicleta;

public abstract class Bicicleta {

	protected int velocidade = 0;
	protected int marcha = 1;

	public Bicicleta() {

	}

	public Bicicleta(int velocidade, int marcha) {

		this.velocidade = velocidade;
		this.marcha = marcha;

	}
	
	public enum TipoBicicleta {
		
		MOUNTAIN,
		SPEED,
		URBANA,
		INFANTIL
	
	}
	
	public enum NivelExperiencia {
		
		INICIANTE,
		INTERMEDIARIO,
		AVANÇADO
		
	}

	public void acelerar(int acelerar) {

		velocidade += acelerar;

	}

	public void frear(int frear) {

		velocidade -= frear;

		if (velocidade < 0) {
			velocidade = 0;

		}
	}

	public void mudarMarcha(int novaMarcha) {

		if (novaMarcha >= 1 && novaMarcha <= 18) {

			marcha = novaMarcha;

		} else {
			
			System.out.println("Marcha inválida! Deve estar entre 1 e 18.");
			
		}
	}

	public void exibirEstado() {

		System.out.println("Velocidade atual: " + velocidade);
		System.out.println("Marcha atual: " + marcha);

	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

}
