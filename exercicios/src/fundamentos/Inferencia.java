package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		//O java vai inferir pelo valor da variável qual o tipo dela(int, double e etc...)
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		
		System.out.println(c);
		
		c = "Outro texto";
		
		System.out.println(c);
		
		//O java não deixa isso acontecer pois o tipo da variável já foi definido
		//c = 4.5
	}
}
