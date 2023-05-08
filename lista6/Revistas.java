package lista6;

public class Revistas extends Publicacoes{

	public Revistas(String titulo, String anopublicacao, String autor, int quantidadepublicacao) {
		super(titulo, anopublicacao, autor, quantidadepublicacao);
		this.tipo = "Revista: ";
	}

	public float darDesconto() {
		return (float) 0.99;
	}

	
}
