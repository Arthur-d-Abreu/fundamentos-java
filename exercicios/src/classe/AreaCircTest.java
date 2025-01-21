package classe;

public class AreaCircTest {
	
	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(5.6);
		//atribuindo um novo valor ao raio:
		a.raio = 4;
		
		//Para mudar o valor do pi static:
		// AreaCirc.pi = 4.38;
		
		//Sem usar método
		System.out.println(a.area());
		//Usando o método static area:
		System.out.println(AreaCirc.area(100));
		System.out.println(AreaCirc.PI);
	}
}
