package br.com.caelum.editora.controllers;

import br.com.caelum.editora.dao.AutorDao;
import br.com.caelum.editora.exceptions.AutorJaExisteException;
import br.com.caelum.editora.modelos.Autor;

public class AutorController {
	
	private AutorDao dao;
	
	public AutorController(AutorDao dao) {
		this.dao = dao;
	}

	public void cadastraAutor(String nome, String email) throws AutorJaExisteException {	
		Autor autor = new Autor(nome, email);
		if(dao.autorJaExiste(autor)) {
			throw new AutorJaExisteException("Autor já existe no sistema");
		}
		dao.adicionaAutor(autor);
	}
}
