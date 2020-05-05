package br.com.caelum.editora.testes;

import br.com.caelum.editora.exceptions.EmailIgualException;
import br.com.caelum.editora.exceptions.EmailInvalidoException;
import br.com.caelum.editora.exceptions.NomeVazioException;
import br.com.caelum.editora.modelos.Sistema;

public class TestaEmailInvalido {

	public static void main(String[] args) throws NomeVazioException, EmailInvalidoException, EmailIgualException {

		Sistema sistema = new Sistema();
		sistema.Adiciona("Carlos", "carlos21gmail.com");
	}

}
