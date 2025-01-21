package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		
		
		//Scanner entrada = new Scanner(System.in);
		//isso abre diversas possibilidades como:
		//Como Integer é um objeto podemos associa-lo a uma String tranquilamente
		
		/*Integer i = Integer.parseInt(entrada.next());//int
			System.out.println(i);
			System.out.println(i * 3);*/

		Byte b = 100;
		Short s = 1000;
		Integer i = 10000; //Int
		Long l = 1000000L; // tem que colocar o L para definir o número como long
	
		System.out.println(b.byteValue());
		System.out.println(s.toString());//Short está sendo impresso como String
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		//Aqui transformamos String para Boolean
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		// Agora boolean para String
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //char
		System.out.println(c);
		
	}
}
