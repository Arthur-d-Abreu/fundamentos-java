package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Gabi", 8.9);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Luna", 10.0);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovados = a -> a.nota >= 7;
		Predicate<Aluno> reprovado = aprovados.negate();
		
		System.out.println(alunos.stream().allMatch(aprovados));
		System.out.println(alunos.stream().anyMatch(aprovados));
		System.out.println(alunos.stream().noneMatch(reprovado));
	}
}
