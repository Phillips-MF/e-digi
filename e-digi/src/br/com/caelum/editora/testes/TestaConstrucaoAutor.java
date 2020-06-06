package br.com.caelum.editora.testes;

import br.com.caelum.editora.modelos.Autor;

public class TestaConstrucaoAutor {

	public static void main(String[] args) {
		try {
			new Autor("Carlos", "carlos2gmail.com");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			 new Autor("Carlos", null);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			 new Autor("Carlos", "");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			 new Autor(null, "carlos2@gmail.com");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			new Autor("", "carlos2@gmail.com");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
