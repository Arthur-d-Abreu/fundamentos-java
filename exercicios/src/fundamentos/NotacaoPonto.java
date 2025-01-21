package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		//o ponto abre diversas possibilidades essas são algumas delas:
		
		s = s.replace("X", "porra");
		
		s = s.toUpperCase();
		
		s = s.concat("!!!");
		
		System.out.println(s);
		
		//Você não precisa armazenar uma váriavel para adicionar método
		System.out.println("aaa".toUpperCase());
		
		//Tipos primitivos não tem o método ponto.
	}
}
