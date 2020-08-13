package br.com.caelum.editora.modelos;

import java.time.Instant;

public class Autor {
	private  String nome;
	private String email;
	private  Instant criadoEm;

	public Autor(String nome, String email) {
		if (nome == null || nome.isEmpty()) {
			throw new IllegalArgumentException("Campo nome não pode ser vazio.");
		}
		this.nome = nome;
		this.criadoEm = Instant.now();
		setEmail(email);
	}

	private void setEmail(String email) {
		if (email == null || email.isEmpty()) {
			throw new IllegalArgumentException("Campo email não pode ser vazio.");
		}
		validaEmail(email);
		this.email = email;
	}

	private void validaEmail(String email) {
		if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
			throw new IllegalArgumentException("Email com formato errado");
		}
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " | " + "Email: " + email;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;

		return email.equals(other.email);
	}

	@Override
	public int hashCode() {
		return email.hashCode();
	}
}
