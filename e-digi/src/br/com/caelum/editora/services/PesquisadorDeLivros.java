package br.com.caelum.editora.services;

import br.com.caelum.editora.dao.LivroDao;
import br.com.caelum.editora.dto.LivroView;
import br.com.caelum.editora.modelos.Livro;

public class PesquisadorDeLivros {
	private LivroDao livroDao;

	public PesquisadorDeLivros(LivroDao livroDao) {
		this.livroDao = livroDao;		
	}
	
	public LivroView pesquisaPorTitulo(String titulo) {
		if(titulo == null || titulo.length() < 2) {
			throw new IllegalArgumentException("O título informado precisa ter mais de dois caracteres");
		}
		Livro livro = livroDao.buscaPorTitulo(titulo).orElseThrow(() -> new IllegalArgumentException("Livro não encontrado!"));
		return new LivroView(livro);
	}
}
