package fundamentos.desafios;

public class ExercicioTemperatura {
	public static void main(String[] args) {
		double F = 86;
		double Sub = 32;
		double Div = 5.0/9.0;
		
		double C = (F - Sub) * Div;
		
		System.out.println("A conversão de °F "+ F +" para celsius é igual a " + C + " °C");
				
	}
}
