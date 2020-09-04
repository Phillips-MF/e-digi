package br.com.caelum.editora.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.editora.modelos.Venda;

public class VendaDao {
	private static List<Venda> vendas = new ArrayList<>(); // Relizar os testes restantes.
	
	public void adiciona(Venda venda) {
		this.vendas.add(venda);
	}
}
