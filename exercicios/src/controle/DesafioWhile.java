package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		//Calcular média dos alunos
		//Não se sabe quantos alunos tem na turma
		//Usuário digita uma nota de 0 à 10
		//Cada nota digitada é guardada em uma variável e somada as 
		//digitadas futuramente
		//Sempre que o usuário digitar uma nota válida tem que adicionar 1, 2...
		//No final vai ter: o Total da soma da notas, média e quantidade de
		//notas digitadas
		//o While somente finaliza quando digitado -1
		
		
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		double notaTotal = 0;
		int contador = 0;
		double media = 0;
		
		while(nota != -1) {
			
			System.out.printf("Digite a sua nota ou (-1) para sair: ");
			nota = entrada.nextDouble();
			
			
			if (nota <= 10 && nota >= 0) {
				notaTotal = notaTotal + nota;
				contador++;
			} else if(nota != -1) {
				System.out.println("Nota inválida");
			}
		}
		
		media = notaTotal/contador;
		
		System.out.printf("Média das notas: %.2f, "
				+ "Total de notas: %.2f, "
				+ "Quantidada de notas digitadas: %d", media, notaTotal, contador );
		
		entrada.close();
	}
}
