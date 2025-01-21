package fundamentos.desafios;

import java.util.Scanner;

public class DesafioBaseTriangulo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a base do triângulo? ");
		double base = entrada.nextDouble();
		System.out.println("\nQual a altura do triângulo? ");
		double altura = entrada.nextDouble();
		
		double calculo = base * altura;
		calculo = calculo / 2.0;
		
	
		System.out.println("A base do triângulo é igual a: " + calculo);
		
		entrada.close();
		
	}
}
