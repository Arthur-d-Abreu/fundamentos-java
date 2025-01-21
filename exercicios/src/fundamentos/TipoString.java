package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoa".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome ="Santos";
		var idade = 33;
		var salario = 2000.56;
		
		System.out.printf("O senhor %s %s tem %d anos e possui um salário "
				+ "de R$%.2f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e possui um salário "
				+ "de R$%.2f.", nome, sobrenome, idade, salario);
		
		System.out.println(frase);
	}
}
