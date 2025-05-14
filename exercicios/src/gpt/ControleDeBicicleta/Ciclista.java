package gpt.ControleDeBicicleta;

import gpt.ControleDeBicicleta.Bicicleta.NivelExperiencia;
import gpt.ControleDeBicicleta.Bicicleta.TipoBicicleta;

public class Ciclista {

	private String nome;
	private int idade;
	private NivelExperiencia nivelExperiencia;
	private TipoBicicleta tipoBicicleta;
	private Bicicleta bicicleta;

	public Ciclista() {

	}

	public Ciclista(String nome, int idade, NivelExperiencia nivelExperiencia, TipoBicicleta tipoBicicleta,
			Bicicleta bicicleta) {

		this.nome = nome;
		this.idade = idade;
		this.nivelExperiencia = nivelExperiencia;
		this.tipoBicicleta = tipoBicicleta;
		this.bicicleta = bicicleta;

	}

	public void pedalar() {
		System.out.println(
				nome + " está pedalando em sua bike " + tipoBicicleta + " a " + bicicleta.getVelocidade() + "km/h\n");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public NivelExperiencia getNivelExperiencia() {
		return nivelExperiencia;
	}

	public void setNivelExperiencia(NivelExperiencia nivelExperiencia) {
		this.nivelExperiencia = nivelExperiencia;
	}

}
