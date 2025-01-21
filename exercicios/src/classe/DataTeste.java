package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data data = new Data();
		
		/*data.dia = 10;
		data.mes = 04;
		data.ano = 2027;*/
		
		Data data2 = new Data(06, 12, 2030);
		
		/*data2.dia = 06;
		data2.mes = 12;
		data2.ano = 2030;*/
		
		System.out.println(data.obterDataFormatada());
		System.out.printf(data2.obterDataFormatada());
	} 
}
