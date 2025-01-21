package classe;

public class EqualsHashcode {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@email.com";
		
		Usuario u2 = new Usuario();
		
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@email.com";
		
		System.out.println(u1 == u2);
		
		//Equals com parâmetro implementado na classe Usuario
		System.out.println(u1.equals(u2));
		
		//Para testar o instanceof de usuario
		//System.out.println(u2.equals(new Date()));
	}
}
