package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salário:");
		String salario1 = (entrada.nextLine());
		
		System.out.println("Digite o segundo salário:");
		String salario2 = (entrada.nextLine());
		
		System.out.println("Digite o terceiro salário:");
		String salario3 = (entrada.nextLine());
		
		
		double numero1 = Double.parseDouble(salario1.replace(',' , '.'));
		double numero2 = Double.parseDouble(salario2.replace(',' , '.'));
		double numero3 = Double.parseDouble(salario3.replace(',' , '.'));
		
		double soma = numero1 + numero2 + numero3;
		
		System.out.println("A média do salários é:" + soma/3);
		
		entrada.close();
	}
}
