package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double totalNotas = 0;
		
		System.out.print("Quantos alunos: ");
		int qtdeAlunos = entrada.nextInt();
		
		System.out.print("\nQuantas notas por aluno? ");
		int qtdeNotas = entrada.nextInt();
		
		double [] [] notasDaTurma = new double [qtdeAlunos] [qtdeNotas];
		
		//Esse percorre as notas
		for (int a = 0; a < notasDaTurma.length; a++) {
			//Esse percorre os alunos
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				
				System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
				
				notasDaTurma[a][n] = entrada.nextDouble();
				totalNotas += notasDaTurma[a][n];
			}
		}
		
		double media = totalNotas / (qtdeAlunos * qtdeNotas);
		System.out.println("A média da turma é: " + media);
		
		for(double [] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		entrada.close();
	}
}
