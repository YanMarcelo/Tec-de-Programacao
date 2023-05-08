package lista6;

public class Livros extends Publicacoes{

	public Livros(String titulo, String anopublicacao, String autor, int quantidadepublicacao) {
		super(titulo, anopublicacao, autor, quantidadepublicacao);
		this.tipo = "Livro: ";
	}

	public float darDesconto() {
		
		
		return (float) 0.9;
	}

	
	
}
