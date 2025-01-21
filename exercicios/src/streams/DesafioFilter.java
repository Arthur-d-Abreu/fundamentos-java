package streams;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	public static void main(String[] args) {
		
		//Criar duas funções lambdas
		//Tem que usar 2 filters
		//Um Map
		
		Comanda c1 = new Comanda(25.90, true, true);
		Comanda c2 = new Comanda(34.7, true, true);
		Comanda c3 = new Comanda(50.6, true, true);
		
		List<Comanda> comanda = Arrays.asList(c1, c2, c3);
		
		Predicate<Comanda> marmita = m ->  m.marmita;
		Predicate<Comanda> desconto = d -> d.desconto;
		Function<Comanda, Double> calculo = c -> (c.precoKilo + 1.00) * (1 - 0.1);
		
		comanda.stream()
		.filter(marmita)
		.filter(desconto)
		.map(calculo)
		.forEach(System.out::println);
	}
}
