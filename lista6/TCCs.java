package lista6;

public class TCCs extends Publicacoes{

	public TCCs(String titulo, String anopublicacao, String autor, int quantidadepublicacao) {
		super(titulo, anopublicacao, autor, quantidadepublicacao);
		this.tipo = "TCCS: ";
	}

	public float darDesconto() {
		return 1;
	}
	
	
}
