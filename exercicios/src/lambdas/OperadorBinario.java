package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> mediaNotas = 
				(n1, n2) -> (n1 + n2) / 2;
				
		System.out.println(mediaNotas.apply(9.7, 4.1));
		
		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 7? "Aprovado" : "Reprovado";
		};
		
		
		System.out.println(resultado.apply(9.7, 4.1));
		
		//Isso não funcionario pois mediaNotas retorna uma String e não um binário
		/*if(mediaNotas >= 7) {
			System.out.println("Aprovado!!!!");
		} else {
			System.out.println("Reprovado");
		}*/
		
		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
		
		System.out.println(mediaNotas.andThen(conceito).apply(9.7, 5.1));
		
	}
}
