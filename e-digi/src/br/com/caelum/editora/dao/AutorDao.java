package br.com.caelum.editora.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.editora.modelos.Autor;

public class AutorDao {
	private static List<Autor> listaAutores = new ArrayList<>();
	
	public void adicionaAutor(Autor autor) {
		listaAutores.add(autor);
	}
	
	public boolean autorJaExiste(Autor autor) {
		return listaAutores.contains(autor);
	}
}
