package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		//A operação a seguir da true por causa da precedência quando colocamos o "++" ou "--" antes do número
		//Estamos básicamente dizendo para esse número ser calculado o mais rápido possível, ou seja, na seguinte 
		//operação ocorre o incremento do A logo em seguida a comparação e só depois o decremento de B
		System.out.println(++a == b--);
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
