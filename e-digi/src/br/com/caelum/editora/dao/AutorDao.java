package br.com.caelum.editora.dao;

import java.util.HashSet;
import java.util.Set;


import br.com.caelum.editora.modelos.Autor;

public class AutorDao {
	private static Set<Autor> listaAutores = new HashSet<>();

	public void adiciona(Autor autor) {
		if (!listaAutores.add(autor)) {
			throw new RuntimeException("Autor já existe no sistema");
		}

	}

}
