package NoteKeeper;

import java.util.Objects;

public class Nota {

	String nome;
	String data;
	String descricao;
	String filtro;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFiltro() {
		return filtro;
	}

	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, descricao, filtro, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nota other = (Nota) obj;
		return Objects.equals(data, other.data) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(filtro, other.filtro) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Nota [nome=" + nome + ", data=" + data + ", descricao=" + descricao + ", filtro=" + filtro + "]";
	}

}
