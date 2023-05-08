package lista6;

public abstract class UsuariosClientes implements ValidarEmprestimo {

	String matricula;
	String nome;
	float tps;
	String cargo;

	public UsuariosClientes(String matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
		this.tps = 0;
	}

	
}
