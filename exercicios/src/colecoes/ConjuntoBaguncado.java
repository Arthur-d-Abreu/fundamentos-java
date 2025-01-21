package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // Como collections n aceita dados primitivos ele automaticamente converte double -> Double
		conjunto.add(true); // boolean -> Boolean 
		conjunto.add("Teste"); // String já é objeto
		conjunto.add(2); // int -> Integer
		conjunto.add('x'); 
		
		System.out.println("Tamanho é: " + conjunto.size());
		
		System.out.println(conjunto.remove("Teste"));
		
		System.out.println("Tamanho é: " + conjunto.size());
		
		System.out.println(conjunto.contains("Teste"));
		
		System.out.println(conjunto.contains(5));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums);//União entre os conjuntos
		
		conjunto.retainAll(nums); // Pega o que tem de igual entre os conjuntos
		
		conjunto.clear();// limpa, limpa tudo
		System.out.println(conjunto);
	}
}
