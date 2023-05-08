package lista6;

public class Servidores extends UsuariosClientes{

	

	public Servidores(String matricula, String nome) {
		super(matricula, nome);
		cargo = "Servidor: ";
	}

	public int verificarDias() {
		return 15;
	}

	
}
