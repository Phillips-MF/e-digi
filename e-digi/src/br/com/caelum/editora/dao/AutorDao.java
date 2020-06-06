package br.com.caelum.editora.dao;

import java.util.HashSet;
import java.util.Set;

import br.com.caelum.editora.exceptions.AutorJaExisteException;
import br.com.caelum.editora.modelos.Autor;

public class AutorDao {
	private static Set<Autor> listaAutores = new HashSet<>();

	public void adiciona(Autor autor) {
		if (!jaExiste(autor)) {
			listaAutores.add(autor);
		} else {
			throw new AutorJaExisteException("Autor já existe no sistema");
		}
		

	}

	private boolean jaExiste(Autor autor) {
		return listaAutores.contains(autor);
	}
}
