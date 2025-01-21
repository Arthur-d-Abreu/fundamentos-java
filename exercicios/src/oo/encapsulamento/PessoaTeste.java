package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("João", "Alves",  20);
		p1.setIdade(20);
		
		System.out.println(p1);
		System.out.println(p1.getNomeCompleto());
	}
	
}
