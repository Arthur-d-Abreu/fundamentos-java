package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		String s = new String("2");
		
		System.out.println("2" == "s");
		//Aqui da verdadeiro pq o .equals compara o conteudo dentro da String 
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		
		//O .trim ele desconsidera os espaços em branco pq quando se compara String os espaços em brancos
		//Podem fazer o boolean da falso msm sendo o mesmo conteúdo 
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		
		//SEMPRE USE EQUALS PARA COMPARAR STRING
		
		
		entrada.close();
	}
}
