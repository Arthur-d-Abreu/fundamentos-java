package oo.composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	//Lista de itens
	
	final List<Item> itens = new ArrayList<>();
		
	void adicionarItem(String nome, double preco, int quantidade) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, quantidade));
	} 
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
}
