package oo.heranca.desafio;

public class Carro {
	//metodo Acelerar
	//acelerou a velocidade aumenta de 05 em 05
	//metodo Frear
	// freou a velocidade diminui de 05 em 05
	//velocidade nunca pode ser menor que 0
	
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	private int delta = 5;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {
		if(velocidadeAtual + getDelta() >= VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();
		}
		
	}
	
	public void frear() {
		if(velocidadeAtual != 0) {
			velocidadeAtual -= 5;
		} else {
			System.out.println("O carro está parado");

		}
	}
	
	public String toString() {
		return "Velocidade atual é = " + velocidadeAtual + "Km";
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
}
