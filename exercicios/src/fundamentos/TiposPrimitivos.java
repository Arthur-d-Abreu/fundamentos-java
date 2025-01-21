package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//informações do funcionário
		
		//númericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		//tem que colocar esse L para dizer para o java o número n é do tipo inteiro e sim long
		long pontosAcumulados = 3_345_678_879L; 
		
		//númericos reais
		
		float salario = 10_569.56F; //tem que adicionar o F para definir o tipo float no número
		double vendasAcumuladas = 2_978_567_968.45;
		
		//tipo booleano
		
		boolean estaDeFerias = false;
		
		//tipo caractere
		
		char status = 'A'; //ativo
		
		//Dias de Empresa
		
		System.out.println("O funcionário tem " + anosDeEmpresa * 365 + " dias de empresa");
		
		//Numero de viagens
		System.out.println("O funcionário fez "+ numeroDeVoos / 2 + " viagens");
		
		//Pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println("O id "+ id + " gannha " + salario);
		
		System.out.println("O id "+ id +" Está de férias? " + estaDeFerias);
		
		System.out.println("Qual os status do funcionário? " + status);
	}
}
