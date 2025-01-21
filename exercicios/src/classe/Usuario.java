package classe;

public class Usuario {
	
	String nome;
	String email;
	
	
	public boolean equals(Object objeto) {
		
		//Método de segurança para garantir que vamos receber um usuario e não
		//um número, data e etc.
		if(objeto instanceof Usuario) {

			Usuario outro = (Usuario) objeto; //coversão de usuário para objeto
			
			boolean nomeIgual = outro.nome.equals(this.nome) ;
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		} else {
			return false;
		}
		
	}
}
