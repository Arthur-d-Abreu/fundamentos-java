package desafiosDeControle;

import java.util.Scanner;

public class NumeroPositivos {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		int numero = 0;
		int numeroT = 0;
		
		while(numero >= 0) {
			
			System.out.print("Insira um número: ");
			numero = entrada.nextInt();
			
			if (numero >= 0) {
				numeroT = numeroT + numero;
				System.out.printf("A soma dos números é: %d %n", numeroT);
			
			}
		}
		
		entrada.close();
	}
}
