package br.com.caelum.editora.dao;

import java.util.HashSet;
import java.util.Set;

import br.com.caelum.editora.modelos.Categoria;

public class CategoriaDao {
	private static Set<Categoria> listaCategorias = new HashSet<>();
	
	public void adiciona(Categoria categoria) {
		if(!CategoriaDao.listaCategorias.add(categoria)) {
			throw new RuntimeException("Essa categoria já existe no sistema.");
		}
	}
}
