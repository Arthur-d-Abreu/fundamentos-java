package fundamentos.desafios;

import java.util.Scanner;

public class DesafioCaculadora {
	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// Ler a operação desejada +, -, /, * ou %
		
		Scanner entrada = new Scanner(System.in);
		
		
	
		
		System.out.println("=================== CALCULADORA ====================\n");
		
		System.out.println("\nDigite um número: ");
		double num1 = entrada.nextDouble();
	
		System.out.println("\nDigite um número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("\nDigite a operação desejada: ");
		String operacao = entrada.next();
		
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		
		

		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		
		
		
		entrada.close();

	}
}
