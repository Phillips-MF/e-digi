package br.com.caelum.editora.modelos;

import java.math.BigDecimal;

public class ItemDeVenda {
	private Livro livro;
	private int quantidade;
	
	public ItemDeVenda(Livro livro, int quantidade) {
		if(quantidade <= 0 ) {
			throw new IllegalArgumentException("Um item precisa ter uma quantidade específicada!");
		}
		this.livro = livro;		
		this.quantidade = quantidade;
	}
	
	public BigDecimal getTotal() {
		return livro.getPreco().multiply(BigDecimal.valueOf(quantidade));
	}
	
	@Override
	public String toString() {
		return "Livro: " + livro.getTitulo() + " | Quantidade: " + quantidade;
	}
}
