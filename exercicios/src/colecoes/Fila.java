package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer and Add -> adicionam elementos a fila
		// Diferença é o comportamento quando fila está cheia
		// Add vai retorna uma exceção 
		// Offer vai retornar false
		fila.add("Ana");
		fila.offer("Bia");
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		
		//Peek and Element -> obtém elementos da fila (sem remover)
		//Quando a fila está fazia peek vai retornar null e 
		//element uma exceção
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		// fila.size(); //Tamanho da fila
		// fila.clear(); //Limpar a fila
		// fila.isEmpty(); //Verificar se a fila está vazia
		// fila.contains(...); //Verificar se tem algum elemento especifico
		
		//Poll and Remove -> obtém elementos da fila e remove
		//Quando a fila está fazia pool vai retornar null e 
		//remove uma exceção
		System.out.println(fila.poll()); 
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}
}
