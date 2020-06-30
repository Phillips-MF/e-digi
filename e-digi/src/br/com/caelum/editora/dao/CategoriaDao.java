package br.com.caelum.editora.dao;

import java.util.HashSet;
import java.util.Set;

import br.com.caelum.editora.modelos.Categoria;

public class CategoriaDao {
	private Set<Categoria> listaCategorias = new HashSet<>();
	
	public void adiciona(Categoria categoria) {
		if(!listaCategorias.add(categoria)) {
			throw new RuntimeException("Essa categoria já existe no sistema.");
		}
	}
}
