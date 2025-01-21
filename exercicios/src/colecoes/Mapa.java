package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		
		//Aqui o put adiciona
		usuarios.put(1, "Roberta");
		//Aqui o put substitui 
		usuarios.put(2, "Ronaldo");
		usuarios.put(3, "Ricardo");
		usuarios.put(4, "Rafaela");
		
		
		System.out.println(usuarios);
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(3));
		System.out.println(usuarios.containsValue("Ronaldo"));
		
		System.out.println(usuarios.get(2));
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(7, "Ricardo"));
		
		System.out.println("");
		
		//Para pecorrer o ID
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		System.out.println("");
		
		//Para pecorrer os valores
		for(String valor:usuarios.values()) {
			System.out.println(valor);
		}
		
		System.out.println("");
		//Para pecorrer os dois ao mesmo tempo usamos o Entry do Java.util
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + ": "); //para colocar na msm linhas
			System.out.println(registro.getValue());
		}
	}
}
