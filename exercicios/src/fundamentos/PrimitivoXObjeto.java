package fundamentos;

public class PrimitivoXObjeto {
	public static void main(String[] args) {
		//Um objeto sempre tem diversos atributos ele é rico de atributos e comportamentos
		String s = "texto";
		s.toUpperCase();
		
		
		//Um tipo primitivo n tem nenhuma notação ponto ele não tem atributos 
		//Porém em Java existe uma forma de atribuir atributos ao tipos primitivos
		// O Wrappers é o responsável por isso, Wrappers são a versão objeto dos tipos primitivos
		int n = 13;
		System.out.println(n);
		
	}
}
