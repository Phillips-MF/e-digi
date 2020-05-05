package br.com.caelum.editora.testes;

import br.com.caelum.editora.exceptions.EmailIgualException;
import br.com.caelum.editora.exceptions.EmailInvalidoException;
import br.com.caelum.editora.exceptions.NomeVazioException;
import br.com.caelum.editora.modelos.Sistema;

public class CadastroDeAutor {

	public static void main(String[] args) throws NomeVazioException, EmailInvalidoException, EmailIgualException {
		Sistema sistema = new Sistema();
		sistema.Adiciona("Carlos", "carlos23@outlook.com");
		sistema.Adiciona("Lucas", "lucas-ribeiro@gmail.com");
		System.out.println("");
		sistema.getAutores();
		
		System.out.println("");
		
		Sistema sistema2 = new Sistema();
		sistema2.Adiciona("João", "joao.silva@hotmail.com");
		System.out.println("");
		sistema2.getAutores();
	}

}
