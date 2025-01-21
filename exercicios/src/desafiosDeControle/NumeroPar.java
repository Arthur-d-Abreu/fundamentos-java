package desafiosDeControle;

import java.util.Scanner;

public class NumeroPar {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = entrada.nextInt();
		
		if(numero <= 10 && numero >= 0 && numero%2 == 0 ) {
			System.out.printf("O número %d está entre 0 e 10 e é par", numero);
		} 
		
		entrada.close();
	}
	
}
