package fundamentos.desafios;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		double problema1 = Math.pow(6 * (3 + 2 ), 2)/6;
		System.out.println(problema1);
		
		double problema2 = Math.pow((1-5)*(2-7)/2,2);
		System.out.println(problema2);
		
		double subtracao = problema1 - problema2;
		
		System.out.println(subtracao);
		
		double divisaofinal = Math.pow(10, 3);
		
		double resultado = Math.pow(subtracao,3) / divisaofinal;
		
		System.out.println(resultado);
	}
}
