package desafiosDeControle;

import java.util.Scanner;

public class JogoDaAdivinhacao {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		double numeroSorteado = Math.random() * 100;
		
		int randomNumber = (int)numeroSorteado;

		for(int i = 0; i < 10; i++) {
			
			System.out.print("\nTente adivinhar um número de 1 a 100:");
			numero = entrada.nextInt();
			
			if(numero == randomNumber) {
				System.out.println("\nParabéns você adivinhou o número");
			break;
			} else if(numero < randomNumber) {
				System.out.printf("\no número é maior que %d, tente novamente", numero);
			}  else if(numero > randomNumber) {
				System.out.printf("\no número é menor que %d, tente novamente", numero);
			} else {
				System.out.println("\nnúmero inválido");
			}
		
		}
	
		entrada.close();
	}
}
