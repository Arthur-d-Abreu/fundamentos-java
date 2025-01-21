package desafiosDeControle;

import java.util.Scanner;

public class SistemasDeNota {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		int contagem = 0;
		double media = 0;
		double notaT = 0;
		
		while(contagem != 2) {
			
			System.out.print("Informe a nota:");
			nota = entrada.nextDouble();
			
			notaT += nota;

			contagem++;
			
		}
		
		media = notaT /2;
		
		if(media >= 7) {
			System.out.printf("Aluno aprovado, média: %.2f ", media);
		} else if(nota >= 4 && nota < 7 ) {
			System.out.printf("Aluno em recuperação, média: %.2f ", media);
		} else if (nota >= 0 && nota < 4) {
			System.out.printf("Aluno reprovado, média: %.2f ", media);
		} else {
			System.out.println("Nota informada está incorreta");
		}
		
		
		entrada.close();
	}
}
