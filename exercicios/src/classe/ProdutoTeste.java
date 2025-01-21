package classe;


public class ProdutoTeste {
	public static void main(String[] args) {
		
		
		Produto p1 = new Produto("Notebook", 4500);
	
		Produto p2 = new Produto("Caneta Preta", 12.56);
		
		Produto.desconto = 0.5;
		
		System.out.println(p1.nome);
		System.err.println(p2.nome);
		
		System.out.println(p1.precoComDesconto());
		System.out.println(p2.precoComDesconto());
		
		/**double precoFinalP1 = p1.precoComDesconto(0.4);
		double precoFinalP2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinalP1 + precoFinalP2) / 2;
		
		System.out.printf("Notebook = %.2f%n", precoFinalP1);
		System.out.printf("Caneta preta = %.2f%n", precoFinalP2);
		System.out.printf("Valor médio do carrinho = %.2f%n", mediaCarrinho);
		
		*/
		
		
		
	}
}
