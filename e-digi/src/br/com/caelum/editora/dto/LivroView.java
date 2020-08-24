package br.com.caelum.editora.dto;

import java.math.BigDecimal;
import java.time.Instant;

import br.com.caelum.editora.modelos.Autor;
import br.com.caelum.editora.modelos.Categoria;
import br.com.caelum.editora.modelos.Livro;

public class LivroView {
	private String titulo;
	private String resumo;
	private String sumario;
	private int paginas;
	private Autor autor;
	private Categoria categoria;
	private int edicao;
	private BigDecimal preco;
	
	public LivroView(Livro livro) {
		this.titulo = livro.getTitulo();
		this.resumo = livro.getResumo();
		this.sumario = livro.getSumario();
		this.paginas = livro.getPaginas();
		this.autor = livro.getAutor();
		this.categoria = livro.getCategoria();
		this.edicao = livro.getEdicao();
		this.preco = livro.getPreco();
	}

	public String getTitulo() {
		return titulo;
	}

	public String getResumo() {
		return resumo;
	}

	public String getSumario() {
		return sumario;
	}

	public int getPaginas() {
		return paginas;
	}

	public Autor getAutor() {
		return autor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public int getEdicao() {
		return edicao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "LivroView titulo=" + titulo + ", resumo=" + resumo + ", sumario=" + sumario + ", paginas=" + paginas
				+ ", autor=" + autor + ", categoria=" + categoria + ", edicao=" + edicao + ", preco=" + preco;
	}
	
	
}
