package br.com.caelum.editora.modelos;

public class Autor {
	private String nome;
	private String email;

	public Autor(String nome, String email) {
		setNome(nome);
		setEmail(email);
	}

	private void setNome(String nome) {
		verificaSeTemTexto(nome, "Campo nome não pode ser vazio");
		this.nome = nome;
	}

	private void setEmail(String email) {
		verificaSeTemTexto(email, "Campo email não pode ser vazio");
		validaEmail(email);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	private void verificaSeTemTexto(String input, String message) {
		if (input == null || input.isEmpty()) {
			throw new IllegalArgumentException(message);
		}

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
