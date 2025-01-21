package fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 8.6;
		
		//A interrogação separa o objeto do boolean e os ":" separa o em verdadeiro ou falso
		String resultadoParcial = media >= 5 ? "em recuperação" : "reprovado";
		String resultadoFinal = media >= 7.0 ? "aprovado" : resultadoParcial;
		
		System.out.println("O aluno está: " + resultadoFinal);
		
		double nota = 8.6;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >=7; 
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.println("Tem desconto? " + resultado);
	}
}
