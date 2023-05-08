package lista6;

public class Professores extends UsuariosClientes{

	

	public Professores(String matricula, String nome) {
		super(matricula, nome);
		cargo = "Professor: ";
	}

	public int verificarDias() {
		return 20;
	}

	
}
