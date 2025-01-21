package generics;

public class CaixaTest {
	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa<>();
		
		caixaA.guarda("Olá");
		
		String coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		Caixa<Integer> caixaB = new Caixa<>();
		
		caixaB.guarda((6 + 7) * 4 /3);
		Integer coisaB = caixaB.abrir();
		System.out.println(coisaB);
	}
}
