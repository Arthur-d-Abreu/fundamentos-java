package desafiosDeControle;

import java.util.Scanner;

public class Soletrando {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escreva uma palavra: ");
		String palavra = entrada.next();
		
		for(int i = 0; i < palavra.length();i++) {
			System.out.println(palavra.charAt(i));
		}
		
		
			
			
		entrada.close();
	}
}
