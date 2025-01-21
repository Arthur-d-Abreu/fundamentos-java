package classe;

public class AreaCirc {
	
	double raio;
	//final torna o valor imutável ele não pode ser alterado.
	//quando uma classe é static colamos ela em CAPSLOCk(não é obrigatorio)
	final static double PI = 3.14;
	
	AreaCirc(double raioInicial){
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}
