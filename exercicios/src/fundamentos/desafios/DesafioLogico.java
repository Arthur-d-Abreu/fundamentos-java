package fundamentos.desafios;

public class DesafioLogico {


		public static void main(String[] args) {
			//Se apenas um trabalho de certo vou comprar a tv de 32
			//Se os dois trabalhos derem certo comprarei a tv de 50
			//E após as compra tomarei sorvete com minha familia
			//Caso nenhum de certo fiquei em casa
			
			boolean trabalho1 = true;
			boolean trabalho2 = true;
			
			System.out.println("Consegui fazer os trabalhos de terça e quinta");
			System.out.println("\nComprei a tv de 50 polegadas?");
			System.out.println(trabalho1 && trabalho2 );
			System.out.println("\nComprei a de 32 polegadas?");
			System.out.println(trabalho1 ^ trabalho2 );
			
			System.out.println("\nEu e minha familia fomos tomar sorvete?");
			System.out.println(trabalho1 || trabalho2);
			
			trabalho1 = false;
			trabalho2 = true;
			
			System.out.println("\nConsegui fazer o trabalho apenas de terça");
			System.out.println("\nComprei a tv de 50 polegadas?");
			System.out.println(trabalho1 && trabalho2 );
			System.out.println("\nComprei a de 32 polegadas?");
			System.out.println(trabalho1 || trabalho2 );
			
			
			System.out.println("\nEu e minha familia fomos tomar sorvete?");
			System.out.println(trabalho1 || trabalho2);
			
			trabalho1 = true;
			trabalho2 = false;
			
			System.out.println("\nConsegui fazer o trabalho apenas de quinta");
			System.out.println("\nComprei a tv de 50 polegadas?");
			System.out.println(trabalho1 && trabalho2 );
			System.out.println("\nComprei a de 32 polegadas?");
			System.out.println(trabalho1 || trabalho2 );
			
			System.out.println("\nEu e minha familia fomos tomar sorvete?");
			System.out.println(trabalho1 || trabalho2);
			
			trabalho1 = false;
			trabalho2 = false;
			
			System.out.println("\nNão consegui fazer nenhum trabalho");
			System.out.println("\nComprei a tv de 50 polegadas?");
			System.out.println(trabalho1 || trabalho2 );
			System.out.println("\nComprei a de 32 polegadas?");
			System.out.println(trabalho1 && trabalho2 );
		
			System.out.println("\nEu e minha familia fomos tomar sorvete?");
			System.out.println(trabalho1 || trabalho2);
			
		}
}
