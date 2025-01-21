
package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String palavras = "";
		
		while(!palavras.equalsIgnoreCase("Não")) {
			
			System.out.println("Digite alguma coisa;");
			palavras = entrada.next();
			System.out.println("\nDeseja continuar? Sim/Não");
			palavras = entrada.next();
			
			
		}
		entrada.close();
	}
}
