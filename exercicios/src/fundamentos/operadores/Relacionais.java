package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		int a = 97;
		int b = 'a';
		
		//toda letra tem um número associado a ele na tabela unicode
		//no caso de a é o hexa decimal \u0061
		System.out.println(a == b);
		
		System.out.println(3 > 4);
		System.out.println(3 < 4);
		System.out.println(3 >= 4);
		System.out.println(3 <= 4);
		System.out.println(3 != 4);
		
		double nota = 8.6;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >=7; 
		
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
	}
}
