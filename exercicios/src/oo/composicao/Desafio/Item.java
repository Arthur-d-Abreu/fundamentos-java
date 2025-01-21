package oo.composicao.Desafio;

public class Item {
	
	//Item tem um produto
	//Quantidade de produtos
	
	int quantidade;
	Produto produto;
	
	Item(Produto produto, int quantidade){
		this.produto = produto;
		this.quantidade = quantidade;
		
	}
	
}
