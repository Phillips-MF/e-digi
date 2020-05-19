package br.com.caelum.editora.testes;

import br.com.caelum.editora.controllers.AutorController;
import br.com.caelum.editora.dao.AutorDao;

public class TestaEmailIgual {

	public static void main(String[] args){
		AutorDao dao = new AutorDao();
		AutorController controller = new AutorController(dao);
		controller.cadastraAutor("Carlos", "carlos12@gmail.com");
		controller.cadastraAutor("Carlão", "carlos12@gmail.com");
	}

}
