package lambdas;

public class CalculoTeste2 {
	
	public static void main(String[] args) {
		
		//Expressão Lambda
		Calculo calculo = (x, y) -> {return x + y; };
		
		System.out.println(calculo.executar(2, 3));
		
		calculo = (x, y	) -> x * y;
		
		System.out.println(calculo.executar(6, 9));
		
		System.out.println(calculo.legal());
		
		System.out.println(Calculo.muitoLegal());
	}
}
