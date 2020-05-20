package br.com.caelum.editora.modelos;

public class Autor {
	private String nome;
	private String email;

	public Autor(String nome, String email) {
		verificaSeTemTexto(nome, "Campo nome não pode ser vazio");
		verificaSeTemTexto(email, "Campo email não pode ser vazio");
		validaEmail(email);
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

}
