package br.com.caelum.editora.exceptions;

public class AutorJaExisteException extends IllegalArgumentException {
	
	public AutorJaExisteException(String msg) {
		super(msg);
	}
}
