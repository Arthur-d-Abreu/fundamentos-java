package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacoes {
	public static void main(String[] args) {
		
		try {
			Aluno a1 = new Aluno("Ana", 7);
			
			Validar.aluno(a1);
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} 
		
		System.out.println("Fim :)");
	}
}
