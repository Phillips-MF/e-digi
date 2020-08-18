package br.com.caelum.editora.dao;

import java.util.HashSet;
import java.util.Set;

import br.com.caelum.editora.modelos.Livro;

public class LivroDao {
	private static Set<Livro> listaLivros =  new HashSet<Livro>();
	
	public void adiciona(Livro livro) {
		if(!listaLivros.add(livro)) {
			throw new RuntimeException("Livro já existe no sistema");
		}
	}
}
