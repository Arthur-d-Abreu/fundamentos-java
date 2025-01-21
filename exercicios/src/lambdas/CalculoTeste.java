package lambdas;

public class CalculoTeste {
	
	public static void main(String[] args) {
		
		Calculo somar = new Somar();
		Calculo multiplicar = new Multiplicar();
		
		System.out.println(somar.executar(4, 5));
		System.out.println(multiplicar.executar(4, 2));
		
		
	}
}
