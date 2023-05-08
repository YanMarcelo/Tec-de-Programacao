package lista6;

public class Emprestimo {
	
	UsuariosClientes clientes;
	Publicacoes publicacoes;
	int quantidadeemprestimos;
	
	public Emprestimo(UsuariosClientes clientes, Publicacoes publicacoes) {
		this.clientes = clientes;
		this.publicacoes = publicacoes;
	}
	
	
	public void dadosEmprestimo() {
		System.out.println("\n"+publicacoes.tipo + publicacoes.titulo +" - " + clientes.cargo + clientes.nome + " - Dias de emprestimo: " + clientes.verificarDias());  
	}
	
}
