package br.com.caelum.editora.testes;

import br.com.caelum.editora.dao.CategoriaDao;
import br.com.caelum.editora.modelos.Categoria;

public class TestaCriacaoDeCategoria {
	public static void main(String[] args) {
		try {
			Categoria categoria = new Categoria("Programação");
			CategoriaDao sistemaCategoria = new CategoriaDao();
			sistemaCategoria.adiciona(categoria);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		try {
			Categoria categoria = new Categoria("");
			CategoriaDao sistemaCategoria = new CategoriaDao();
			sistemaCategoria.adiciona(categoria);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		try {
			Categoria categoria = new Categoria(null);
			CategoriaDao sistemaCategoria = new CategoriaDao();
			sistemaCategoria.adiciona(categoria);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Categoria categoria = new Categoria("Programação");
			Categoria categoria2 = new Categoria("Programação");
			CategoriaDao sistemaCategoria = new CategoriaDao();
			sistemaCategoria.adiciona(categoria);
			sistemaCategoria.adiciona(categoria2);
		} catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}

	}
}
