package br.com.caelum.editora.dao;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import br.com.caelum.editora.modelos.Livro;

public class LivroDao {
	private static Set<Livro> listaLivros =  new HashSet<Livro>();
	
	public void adiciona(Livro livro) {
		if(!listaLivros.add(livro)) {
			throw new RuntimeException("Livro já existe no sistema");
		}
	}

	public Livro buscaPorTitulo(String titulo) {
		if(titulo == null || titulo.length() < 2) {
			throw new IllegalArgumentException("O título informado precisa ter mais de dois caracteres");
		}
		return listaLivros.stream().filter(livro -> livro.getTitulo().contains(titulo)).findFirst().orElseThrow(() -> new IllegalArgumentException("Livro não encontrado!"));
		
	}
}
