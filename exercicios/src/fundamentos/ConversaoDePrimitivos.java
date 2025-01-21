package fundamentos;

public class ConversaoDePrimitivos {
	
	public static void main(String[] args) {
		
		//conversão implicita(conversão automatica sem perda de informação nenhuma)
		double a = 1;
		System.out.println(a);
		
		//vamos ter que fazer uma conversão explicita um Cast(conversão), neste caso double para float
		float b = (float) 1.0;
		System.out.println(b);
		
		int c = 4;
		
		//novamente precisa fazer uma conversão explicita pois int > byte, mesmo o 4 cabendo em byte é 
		//necessário fazer o cast pois java necessita desse cast explicito
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e; // repara que houve uma tremenda perda de informação
		System.out.println(f);
	}
}
