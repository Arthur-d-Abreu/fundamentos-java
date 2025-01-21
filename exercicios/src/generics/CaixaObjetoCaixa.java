package generics;

public class CaixaObjetoCaixa {
	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		
		caixaA.guarda(2.3); //double -> Double	
		
		//Como a classe Caixa é do tipo object somos obrigados a sempre fazer um cast para explicitar o tipo da váriavel 
		Double coisaA = (Double) caixaA.abrir();
		System.out.println(coisaA);
		
		
		CaixaObjeto caixaB = new CaixaObjeto();
		
		caixaB.guarda("Olá");
		
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
	}
}
