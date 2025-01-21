package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		//Set <String> listaAprovados = new HashSet<>();
		//Como set não tem uma ordenação para ordenar a lista vamos usar:
		SortedSet <String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro\n");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set <Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(4);
		nums.add(190);
		nums.add(360);
		
		for(int n: nums) {
			System.out.println(n);
		}
	}
}
