package desafiosDeControle;

import java.util.Scanner;

public class AnoBissexto {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o ano: ");
		int ano = entrada.nextInt();
		
		boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0  || ano % 400 == 0);
		
		if(bissexto == true) {
			System.out.println(bissexto);
		} else {
			System.out.println("Não é bissexto");
		}
		
		entrada.close();
	}
}
