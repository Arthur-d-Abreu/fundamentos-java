package desafiosDeControle;

import java.util.Scanner;

public class MaiorValor {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int valor = 0;
		
		int maior = 0;
		
		for(int i = 0; i < 10; i++) {
			
			System.out.print("Digite um número:");
			valor = entrada.nextInt();
			
			
			if(valor  > maior) {
				
				maior = valor;
			}
				
		}
		
		System.out.printf("O maior valor digitado foi: %d", maior);
		
		entrada.close();
	}
}
