package oo.composicao;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		
		c1.cliente = "João Pedro";
		
		//Com relação biderecional:
		c1.adicionarItem("caneta", 20, 7.45);
		c1.adicionarItem("borracha", 12, 3.89);
		//Sem relação bidirecional:
		c1.itens.add(new Item("caderno", 3, 18.79));
		
		System.out.println(c1.itens.size());
		System.out.println("Valor total: " + c1.obterValorTotal());
	}
}
