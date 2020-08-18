package br.com.caelum.editora.testes;

import java.math.BigDecimal;

import br.com.caelum.editora.modelos.Livro;

public class TestaCriacaoDeLivro {
	public static void main(String[] args) {
		try {
			Livro livro = new Livro();
			livro.setTitulo(null);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			Livro livro = new Livro();
			livro.setTitulo("");
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			Livro livro = new Livro();
			livro.setResumo("São praticamente 20 anos de Java desde o lançamento de sua\\n\" + \n" + 
						"\"primeira versão. Apenas em 2004, com a chegada do Java 5, houve\\n\" + \n" + 
						"\"mudanças significativas na linguagem.");
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Livro livro = new Livro();
			livro.setSumario("");
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Livro livro = new Livro();
			livro.setPaginas(-1);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			Livro livro = new Livro();
			livro.setIsbn("123-0-99999-12-0");
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			Livro livro = new Livro();
			livro.setAutor(null);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			Livro livro = new Livro();
			livro.setCategoria(null);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			Livro livro = new Livro();
			livro.setEdicao(0);
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			Livro livro = new Livro();
			livro.setPreco(new BigDecimal(-1));
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
