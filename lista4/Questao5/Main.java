package Questao5;

public class Main {

	public static void main(String[] args) {
		 
			Agenda agenda = new Agenda ("Agenda do Yan", " - Não tem");
			Cliente cliente = new Cliente("Yan",agenda);
		
	        Contato contato1 = new Contato(1001, "Glaudilene", "Rua B, 456", "glaudilene@gmail.com", "23456789", "Amiga");
	        Contato contato2 = new Contato(1002, "Robscleison", "Rua C, 789", "robscleison@hotmail.com", "34567890", "Colega");
	        Contato contato3 = new Contato(1003, "Judirene", "Rua D, 012", "judirene@yahoo.com", "45678901", "Família");
	      
	        cliente.adicionarContato(contato1);
	        cliente.adicionarContato(contato2);
	        cliente.adicionarContato(contato3);
	        agenda.imprimirContatos();
	    
			contato1.validarCodigo();
		    contato2.validarTelefone();

		     Contato contatoDuplicado = contato3.duplicarContato();
		     System.out.println("Dados do contato duplicado: ");
		     contatoDuplicado.imprimirContato();
		     
		     contato1.verificarContato();
		     contato1.imprimirContato();
		     
		     Contato contato4 = new Contato(4, "", "Rua E, 345", "email@teste.com", "1234-5678", "");
		     contato4.verificarContato();
		     contato4.imprimirContato();
		     
		     
	}
}
