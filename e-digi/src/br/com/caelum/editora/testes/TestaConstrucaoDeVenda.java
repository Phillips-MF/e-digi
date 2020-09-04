package br.com.caelum.editora.testes;

import java.math.BigDecimal;

import br.com.caelum.editora.dao.LivroDao;
import br.com.caelum.editora.modelos.Autor;
import br.com.caelum.editora.modelos.Categoria;
import br.com.caelum.editora.modelos.ItemDeVenda;
import br.com.caelum.editora.modelos.Livro;
import br.com.caelum.editora.modelos.Venda;

public class TestaConstrucaoDeVenda {
	public static void main(String[] args) {
		try {
			Autor autor = new Autor("Carlos", "carlos2@gmail.com");
			Categoria categoria = new Categoria("Programação");
			Livro livro1 = new Livro("Java 8 Prático", "São praticamente 20 anos de Java desde o lançamento de sua\n"
					+ "primeira versão. Apenas em 2004, com a chegada do Java 5, houve\n"
					+ "mudanças significativas na linguagem. Em especial, generics,\n" + "enums e anotações.\n"
					+ "Com a chegada do Java 8, em 2014, isso acontece mais uma\n"
					+ "vez. Novas possibilidades surgem com a entrada do lambda e dos\n"
					+ "method references, além de pequenas mudanças na linguagem. A\n"
					+ "API de Collections, cujas interfaces principais são as mesmas desde\n"
					+ "1998, recebe um significativo upgrade com a entrada dos Streams e\n" + "dos métodos default.",
					"Capítulo1 - pag2 | Capítulo2 - pag12", 13, "978-0-12-324567-0", autor, categoria, 1,
					new BigDecimal(50.0));

			Livro livro2 = new Livro("Orientação à Objetos", "A Orientação a Objetos está na sua sexta década. Entretanto, a\n" + 
					"sua popularização só aconteceu na década de 90 com o surgimento\n" + 
					"de linguagens mais sofisticadas em relação a Simula 67 e Smalltalk,\n" + 
					"tais como Java. Então, a partir deste período, muitas pesquisas,\n" + 
					"congressos, trabalhos e softwares foram construídos usando este\n" + 
					"paradigma de desenvolvimento de software.\n" + 
					"Em contrapartida a esta popularidade, há sempre um desafio\n" + 
					"em fazer um desenvolvedor iniciante aprender este paradigma.\n" + 
					"Normalmente, os aspirantes a programadores de sucesso\n" + 
					"aprendem de início o paradigma estruturado, que é menos\n" + 
					"complexo em conceitos e é uma abordagem mais simplista de\n" + 
					"programação. Embora exista esta dificuldade inicial na\n" + 
					"visualização e aplicação dos conceitos da Orientação a Objetos,\n" + 
					"este paradigma tende a ser mais natural, visto que, no trabalho de\n" + 
					"automação de processos do dia a dia, a manipulação de objetos no\n" + 
					"mundo real é constante, sejam eles concretos ou abstratos.",
					"Capítulo1 - pag2 | Capítulo2 - pag12 | Capítulo3 - pag15", 20, "978-0-12-324567-0", autor, categoria, 1,
					new BigDecimal(12.0));
			
			LivroDao livroDao = new LivroDao();
			livroDao.adiciona(livro1);
			livroDao.adiciona(livro2);

			Venda venda = new Venda();
			ItemDeVenda item1 = new ItemDeVenda(livro1, 0);
			venda.addItem(item1);
			System.out.println(item1.getTotal());

			ItemDeVenda item2 = new ItemDeVenda(livro2, 19);
			System.out.println(item2.getTotal());
			venda.addItem(item2);
		
			System.out.println(venda);
		} catch(IllegalArgumentException e ) {
			System.out.println(e.getMessage());
		}
	
	}
}
