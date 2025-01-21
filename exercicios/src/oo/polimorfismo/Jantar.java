package oo.polimorfismo;

public class Jantar {	
	
	public static void main(String[] args) {
		
		Pessoa convidada = new Pessoa(99.65);
		
		Arroz ingrediente1 = new Arroz(0.200);
		Feijao ingrediente2 = new Feijao(0.100);
		Comida ingrediente3 = new Feijao(0.2);
		
		
		convidada.comer(ingrediente1);
		convidada.comer(ingrediente2);
		convidada.comer(ingrediente3);
		
		System.out.println(convidada.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.4);
		
		convidada.comer(sobremesa);
		
		
		System.out.println(convidada.getPeso());
		
	}
}
