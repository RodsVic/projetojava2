package classes;

import java.util.Objects;

public class Disciplina {

	double nota;
	String disciplina;

	public double getNota() {
		return nota;
	}

	public void setNota(double nota1) {
		this.nota = nota1;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina1) {
		this.disciplina = disciplina1;
	}

	@Override
	public int hashCode() {
		return Objects.hash(disciplina, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina, other.disciplina)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}

	@Override
	public String toString() {
		return "Disciplina [nota1=" + nota + ", disciplina1=" + disciplina + "]";
	}

}
