package lista6;

public class Artigos extends Publicacoes{

	public Artigos(String titulo, String anopublicacao, String autor, int quantidadepublicacao) {
		super(titulo, anopublicacao, autor, quantidadepublicacao);
		this.tipo = "Artigo: ";
	}

	public float darDesconto() {
		return (float) 0.5;
	}
	
	

}
