package oo.abstrato;

public abstract class Animal {
	
	public String respirar() {
		return "Usando oxigenio";
	}
	
	//Mover é muito genérico para a classe animal por isso vamos
	//definir como abstrato
	public abstract String mover();
}
