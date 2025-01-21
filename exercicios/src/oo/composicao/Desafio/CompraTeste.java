package oo.composicao.Desafio;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		
		compra1.adicionarItem("Faca", 15.6, 5);
		compra1.adicionarItem("Tábua", 21.5, 4);
		
		Compra compra2 = new Compra();
		
		compra2.adicionarItem("Churrasqueira", 500, 1);
		compra2.adicionarItem("Espeto", 31.99, 4);
		
		Cliente c1 = new Cliente("Gustavo Guanabara");
		
		c1.compras.add(compra1);
		c1.compras.add(compra2);
		
		System.out.println(c1.obterValorTotal());
		
		
		
	}
}
