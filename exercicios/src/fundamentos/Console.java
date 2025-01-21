package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		//print sem ln não quebra a linha fica tudo na mesma
		System.out.print("Bom");
		System.out.print(" dia");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\n\nDigite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos ",nome, sobrenome, idade);
		
		entrada.close();
		
		
	}
}
