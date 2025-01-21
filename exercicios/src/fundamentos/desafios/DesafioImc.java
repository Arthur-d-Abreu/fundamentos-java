package fundamentos.desafios;

import java.util.Scanner;

public class DesafioImc {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.println("\nDigite sua altura: ");
		double altura = entrada.nextDouble();
		
		
		double calculoFinal = peso / Math.pow(altura, 2);
		
		System.out.println("O seu IMC é igual a: " + calculoFinal);
		
		entrada.close();
	}
}
