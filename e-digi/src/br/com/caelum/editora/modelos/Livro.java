package br.com.caelum.editora.modelos;

import java.math.BigDecimal;
import java.time.Instant;

public class Livro {
	private static final int TAMANHO_MINIMO_DO_RESUMO = 500;
	
	private String titulo;
	private String resumo;
	private String sumario;
	private int paginas;
	private String isbn;
	private Autor autor;
	private Categoria categoria;
	private int edicao;
	private BigDecimal preco;
	private Instant criadoEm;
	
	public Livro() {
		this.criadoEm = Instant.now();
	}
	
	public void setTitulo(String titulo) {
		if(titulo == null || titulo.isEmpty()) {
			throw new IllegalArgumentException("Campo título não pode ser vazio");
		}
		this.titulo = titulo;
	}

	public void setResumo(String resumo) {
		if(resumo == null || resumo.length() < Livro.TAMANHO_MINIMO_DO_RESUMO) {
			throw new IllegalArgumentException("O resumo precisa ter pelo menos " + Livro.TAMANHO_MINIMO_DO_RESUMO + " caracteres");
		}
		this.resumo = resumo;
	}

	public void setSumario(String sumario) {
		if(sumario == null || sumario.isEmpty()) {
			throw new IllegalArgumentException("O sumário não pode ser vazio");
		}
		this.sumario = sumario;
	}

	public void setPaginas(int paginas) {
		if(paginas <= 0) {
			throw new IllegalArgumentException("O número de páginas precisa ser maior que 0");
		}
		this.paginas = paginas;
	}

	public void setIsbn(String isbn) {
		if(isbn == null || !isbn.matches("978-\\d-\\d{2}-\\d{6}-\\d")) {
			throw new IllegalArgumentException("O isbn está com um formato inválido");
		}
		this.isbn = isbn;
	}

	public void setAutor(Autor autor) {
		if(autor == null) {
			throw new IllegalArgumentException("O livro precisa de um autor");
		}
		this.autor = autor;
	}

	public void setCategoria(Categoria categoria) {
		if(categoria == null) {
			throw new IllegalArgumentException("O livro precisa de uma Categoria");
		}
		this.categoria = categoria;
	}

	public void setEdicao(int edicao) {
		if(edicao <= 0) {
			throw new IllegalArgumentException("O número da edição não pode ser menor que 1");
		}
		this.edicao = edicao;
	}

	public void setPreco(BigDecimal preco) {
		if(preco.compareTo(BigDecimal.ZERO) == -1) {
			throw new IllegalArgumentException("O valor do preço não pode ser negativo");
		}
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Livro other = (Livro) obj;
		
		if (!titulo.equals(other.titulo))
			return false;
		
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} 	
		return isbn.equals(other.isbn);
	}

	@Override
	public String toString() {
		return titulo + " | " + autor + " " +  criadoEm ;
	}
	

}
