package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	 
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno príncipe");
		livros.push("Dom Quixote");
		livros.push("O Hobbit");
		
		//como é uma pilha ele vai retornar o ultimo elemento
		System.out.println(livros.peek());
		System.out.println(livros.element());
		System.out.println("");
		
		//obtém e remove o elemento
		//Se não tiver nenhum elemento lança uma exceção
		System.out.println(livros.pop());
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
	}
}
