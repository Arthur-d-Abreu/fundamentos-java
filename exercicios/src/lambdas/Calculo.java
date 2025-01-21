package lambdas;

@FunctionalInterface //definimos isso para declarar que nossa interface vai ter apenas um unico método
public interface Calculo {
	
	double executar(double a , double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
	}
}
