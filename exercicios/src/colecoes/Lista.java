package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3));//acessando pelo indice 
		
		lista.remove(1);
		System.out.println( lista.remove(new Usuario("Manu")));
		
		System.out.println(lista.contains(new Usuario("Lia"))); 
		
		for(Usuario u : lista) {
			System.out.println(u.nome);
		}
		
		
	}
}
