package br.com.caelum.editora.modelos;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Venda {
	private List<ItemDeVenda> itens = new ArrayList<>();
	private Instant momentoDaVenda = Instant.now();
	
	public void  addItem(ItemDeVenda item) {
		itens.add(item);
	}
	
	public BigDecimal getTotal() {
		return itens.stream().map(item -> item.getTotal()).reduce(BigDecimal.ZERO, (a, b) -> a.add(b));
	}
	
	@Override
	public String toString() {
		String informacaoDeVenda = "";
		for (ItemDeVenda itemDeVenda : itens) {
			informacaoDeVenda += itemDeVenda.toString() + "\n";
		}
		informacaoDeVenda += "Valor total da venda: " + getTotal();
		return informacaoDeVenda;
	}

}
