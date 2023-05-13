package Questao5;

public class Cliente {
	  
	  private String nome;
	  private Agenda agenda;
	
	  public Cliente(String nome, Agenda agenda) {
	        this.nome = nome;
	        this.agenda = agenda;
	  }
	  
	  public void adicionarContato(Contato contato) {
	        agenda.adicionarContato(contato);
	    }

	    public void imprimirContatos() {
	        System.out.println("Contatos de " + nome + ":");
	        System.out.println();
	        agenda.imprimirContatos();
	    }
}
