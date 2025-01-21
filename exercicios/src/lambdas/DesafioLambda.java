package lambdas;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioLambda {
	public static void main(String[] args) {
		
		/*
		 * Desafio:
		 * 1. A partir do produto calcular o preço real (com desconto)
		 * 2. Imposto municipal: >= 2500 (8,5%)/< 2500 (isento)
		 * 3. Frete: >= 3000 (100)/ < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais 
		 * 5. Formatar: R$ 1234,56
		 */
		
		
		Function<Produto, Double> precoDesconto =  produto -> produto.preco * (1 - produto.desconto);
		
		UnaryOperator<Double> taxaMunicipal = preco -> preco >= 2500? preco * 1.085: preco ;
		
		UnaryOperator<Double> entrega = preco -> preco >= 3000? preco + 100: preco + 50;
		
		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));	
		
		Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");
		
		Produto p = new Produto("Ipad", 3235.89, 0.13);
		
		String precoFinal = precoDesconto
				.andThen(taxaMunicipal)
				.andThen(entrega)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println("O preço final é: " + precoFinal);
		

		
		
	}
}
