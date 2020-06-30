package br.com.caelum.editora.testes;

import br.com.caelum.editora.dao.AutorDao;
import br.com.caelum.editora.modelos.Autor;

public class TestaEmailIgual {

	public static void main(String[] args) {
		AutorDao dao = new AutorDao();
		Autor autor = new Autor("Carlos", "carlos12@gmail.com");
		Autor autor2 = new Autor("Carls", "carlos12@gmail.com");
		dao.adiciona(autor);
		System.out.println(autor);
		try {
			dao.adiciona(autor2);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

	}
}
