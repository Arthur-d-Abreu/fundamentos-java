package fundamentos.desafios;

public class FormulaDeBhaskara {
	
	public static void main(String[] args) {
		double a = 1;
		double b = 12;
		double c = -13;
		
		double primeiraP = Math.pow(b, 2) - 4 * a * (c);
		System.out.println("Valor de Delta: "+ primeiraP);
		
		double delta = Math.sqrt(primeiraP);
		double deltaXI = - b + delta;
		deltaXI = deltaXI/ 2.0*a;
		
		
		double deltaXII = - b - delta;
		deltaXII = deltaXII / 2 * a;
		
		System.out.printf("O valor das raizes X1: %.2f e de X2: %.2f", deltaXI, deltaXII);
		
		
	
	}
}
