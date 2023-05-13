package Questao5;

public class Contato {

	private int codigo;
	private String nomecontato;
	private String endereco;
	private String email;
	private String telefone;
	private String observacao;
	
	public Contato(int codigo) {
		this.codigo = codigo;
	}
	
	public Contato(int codigo, String nomecontato) {
		this.codigo = codigo;
		this.nomecontato = nomecontato;
	}

	public Contato(String telefone) {
		this.telefone = telefone;
	}

	public Contato(int codigo, String nomecontato, String email) {
		this.codigo = codigo;
		this.nomecontato = nomecontato;
		this.email = email;
	}
	
	public Contato(int codigo, String nomecontato, String endereco,String email, String telefone,String observacao) {
		this.codigo = codigo;
		this.nomecontato = nomecontato;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		this.observacao = observacao;
	}

	public boolean validarCodigo() {
		if(this.codigo>=1000 && this.codigo<=9999) {
			System.out.println("Código válido. \n");
		return true;
		}
		else {
			System.out.println("Código inválido.\n");
			return false;
		}
	}
	
	public boolean validarTelefone() {
		if(telefone.length() == 8) {
			System.out.println("Telefone válido. \n");
			return true;
		}
		else { 
			System.out.println("Telefone inválido.\n");
			return false;
		}
	}
	
	public Contato duplicarContato() {
		 Contato novoContato = new Contato(codigo, nomecontato, endereco, email , telefone, observacao);
		 return novoContato;
	 }
	
	public boolean verificarContato() {
	    if( codigo != 0 &&
	           nomecontato != null && !nomecontato.isEmpty() &&
	           endereco != null && !endereco.isEmpty() &&
	           email != null && !email.isEmpty() &&
	           telefone != null && !telefone.isEmpty() &&
	           observacao != null && !observacao.isEmpty()) {
	    	System.out.println("Contato salvo\n");
	    	return true;
	    }
	    else {
	    	System.out.println("Contato inválido\n");
	    	return false;
	    }
	} 
	
	public void imprimirContato() {
		 	System.out.println("Código: " + codigo);
	        System.out.println("Nome: " + nomecontato);
	        System.out.println("Endereço: " + endereco);
	        System.out.println("E-mail: " + email);
	        System.out.println("Telefone: " + telefone);
	        System.out.println("Observação: " + observacao + "\n");
	}
	
	
	
	
	
	
}
