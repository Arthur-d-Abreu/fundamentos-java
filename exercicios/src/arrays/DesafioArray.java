package arrays;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		double totalNotas = 0;
		
		System.out.print("Digite a quantidade de notas: ");
		int quantidadeNotas = entrada.nextInt();
		
		double [] notas = new double [quantidadeNotas];
		
		for(int i = 0; i < notas.length; i++) {
			
			System.out.print("\nDigite a nota " + (i + 1) + ": ");
			 notas[i] = entrada.nextDouble();
		}
		
		for(double nota: notas) {
			totalNotas += nota;
		}
		
		double media = totalNotas/notas.length;
		
		System.out.println("A média das notas: " +  media);
		
		entrada.close();
	}
}
