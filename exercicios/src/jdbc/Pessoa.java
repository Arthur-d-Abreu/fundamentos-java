package jdbc;

public class Pessoa {
	
	private int Codigo;
	private String nome;
	
	
	public Pessoa(int codigo, String nome) {
		super();
		Codigo = codigo;
		this.nome = nome;
	}
	
	
	public int getCodigo() {
		return Codigo;
	}
	
	public void setCodigo(int codigo) {
		Codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
