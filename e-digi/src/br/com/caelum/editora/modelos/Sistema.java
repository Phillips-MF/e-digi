package br.com.caelum.editora.modelos;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.editora.exceptions.EmailIgualException;
import br.com.caelum.editora.exceptions.EmailInvalidoException;
import br.com.caelum.editora.exceptions.NomeVazioException;

public class Sistema {
	static List<Autor> listaAutores = new ArrayList();

	public void Adiciona(String nome, String email) throws NomeVazioException, EmailInvalidoException, EmailIgualException {
		Autor autor = new Autor(nome, email);
		System.out.println("Cadastrando autor: " + nome);
		verificaNome(nome);
		validaEmail(email);
		verificaEmailIgual(email);
		listaAutores.add(autor);
		System.out.println("Autor " + nome + ", cadastrado com sucesso!");
	}
	
	public List<Autor> getAutores() {
		System.out.println("Lista de autores no sistema:");
		for (Autor autor : listaAutores) {
			System.out.println(autor.getNome() + " | " + autor.getEmail());
		}
		return listaAutores;
	}

	private boolean verificaNome(String nome) throws NomeVazioException {
		if (nome.isEmpty()) {
			throw new NomeVazioException("Erro durante o cadastro: Campo nome está vazio.");
		}
		return true;
	}

	private boolean validaEmail(String email) throws EmailInvalidoException {
		if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")){
			throw new EmailInvalidoException("Erro durante o cadastro: Email com formato inválido");
		}
		return true;
	}
	
	private boolean verificaEmailIgual(String email) throws EmailInvalidoException, EmailIgualException {
		for (Autor autor : listaAutores) {
			if(autor.getEmail().equals(email)) {
				throw new EmailIgualException("Erro durante o cadastro: Email informado já existe no sistema!");
			}
		}
		return true;
	}

}
