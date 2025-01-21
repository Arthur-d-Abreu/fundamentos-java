package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
		
	
	Data (){
		//dia = 01;
		//mes = 01;
		//ano = 1970;
		this(1,1,1970);
	}
	
	Data(int dia, int mes, int ano){
		//Usamos This para especificar a váriavel nesse casa vamos especificar
		//a variável da instancia da do construtor
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
			
	String obterDataFormatada() {
		
		return  dia + "/" + mes + "/" + ano;
	
	}
		
}
