package br.com.caelum.editora.testes;

import java.math.BigDecimal;

import br.com.caelum.editora.dao.AutorDao;
import br.com.caelum.editora.dao.CategoriaDao;
import br.com.caelum.editora.dao.LivroDao;
import br.com.caelum.editora.modelos.Autor;
import br.com.caelum.editora.modelos.Categoria;
import br.com.caelum.editora.modelos.Livro;

public class TestaCadastroLivro {
	public static void main(String[] args) {
		Autor autor = new Autor("Carlos", "carlos2@gmail.com");
		Categoria categoria = new Categoria("Proagramação");
		Livro livro = new Livro();
		livro.setTitulo("Java 8 Prático");
		livro.setAutor(autor);
		livro.setCategoria(categoria);
		livro.setIsbn("978-0-12-324567-0");
		livro.setPaginas(13);
		livro.setEdicao(1);
		livro.setSumario("Capítulo1 - pag2 | Capítulo2 - pag12");
		livro.setResumo("São praticamente 20 anos de Java desde o lançamento de sua\n" + 
				"primeira versão. Apenas em 2004, com a chegada do Java 5, houve\n" + 
				"mudanças significativas na linguagem. Em especial, generics,\n" + 
				"enums e anotações.\n" + 
				"Com a chegada do Java 8, em 2014, isso acontece mais uma\n" + 
				"vez. Novas possibilidades surgem com a entrada do lambda e dos\n" + 
				"method references, além de pequenas mudanças na linguagem. A\n" + 
				"API de Collections, cujas interfaces principais são as mesmas desde\n" + 
				"1998, recebe um significativo upgrade com a entrada dos Streams e\n" + 
				"dos métodos default.");
		livro.setPreco(new BigDecimal(50.0));
		
		LivroDao livroDao = new LivroDao();
		AutorDao autorDao = new AutorDao();
		CategoriaDao categoriaDao = new CategoriaDao();
		livroDao.adiciona(livro);
		autorDao.adiciona(autor);
		categoriaDao.adiciona(categoria);
		System.out.println("Livro "+ livro + " cadastrado no sistema");
		
		
				
		
		
	}
}
