package fundamentos;

public class AreaCircuferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		//final torna a variável inalterável
		final double pi = 4.14159;
		
		double area = pi * raio * raio;
		
		System.out.println(area);
	}
}
