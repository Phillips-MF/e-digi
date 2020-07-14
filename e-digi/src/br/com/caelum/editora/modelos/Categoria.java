package br.com.caelum.editora.modelos;

import java.time.Instant;

public class Categoria {
	private final String nome;
	private final Instant criadoEm;

	public Categoria(String nome) {
		if (nome == null || nome.isEmpty()) {
			throw new IllegalArgumentException("Campo nome não pode ser vazio.");
		}
		this.nome = nome;
		this.criadoEm = Instant.now();
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
		return nome.equals(other.nome);
	}

}
