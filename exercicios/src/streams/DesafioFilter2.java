package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook",2599.9, 0.5, 0);
		Produto p2 = new Produto("Fogão",980.40, 0.3, 0);
		Produto p3 = new Produto("Microondas",699.90, 0.2, 0);
		Produto p4 = new Produto("Forno",899.9, 0.4, 0);
		
		List<Produto> produto = Arrays.asList(p1, p2, p3, p4);
		
		Predicate<Produto> desconto = d -> d.desconto >= 0.3;
		Predicate<Produto> freteGratis = f -> f.frete == 0;
		Predicate<Produto> produtoRelevante = p -> p.preco >= 500;
		Function<Produto, String> promocao= f -> "PROMOÇÃO DE UM " + f.nome + " POR APENAS: " + f.preco;
		
		produto.stream()
		.filter(desconto)
		.filter(freteGratis)
		.filter(produtoRelevante)
		.map(promocao)
		.forEach(System.out::println);
		
		
	}
}
