package br.com.caelum.editora.modelos;

import java.time.Instant;

public class Categoria {
	private String nome;
	private  final Instant criadoEm;

	public Categoria(String nome) {
		this.setNome(nome);
		this.criadoEm = Instant.now();
	}

	public void setNome(String nome) {
		if (nome == null || nome.isEmpty()) {
			throw new IllegalArgumentException("Campo nome não pode ser vazio.");
		}
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return nome.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	

}
