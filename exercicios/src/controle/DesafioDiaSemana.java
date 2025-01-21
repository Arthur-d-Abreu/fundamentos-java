package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um dia da semana: ");
		String dias = entrada.next();
		
		if (dias.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		} else if(dias.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		} else if(dias.equalsIgnoreCase("terça")) {
			System.out.println(3);
		} else if(dias.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		} else if(dias.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		} else if(dias.equalsIgnoreCase("sexta")) {
			System.out.println(6);
		} else if(dias.equalsIgnoreCase("sábado")) {
			System.out.println(7);
		} else {
			System.out.println("Dia inválido");
		}
		
		
		entrada.close();
		
	}
}
