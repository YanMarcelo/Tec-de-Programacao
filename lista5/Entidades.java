package lista5;
import java.util.Random;


public class Entidades {

	protected String tipo;
	protected int posicaox;
	protected int posicaoy;
	protected Plano plano;


	public Entidades(Plano plano) {
		this.plano = plano;
		sortearPosicao();
	}

	public void sortearPosicao() {

		Random random = new Random();
		boolean posicaoValida = false;
		
		while (!posicaoValida) {
			posicaox = random.nextInt(plano.tamanhox);
			posicaoy = random.nextInt(plano.tamanhoy);

			Celula celula = plano.retornarCelula(posicaox, posicaoy);

			if(posicaox==0 || posicaoy==0 || !celula.listarobos.isEmpty() || !celula.listaentidades.isEmpty()) {
				posicaoValida = false;
			}
			else {
				celula.listaentidades.add(this);
				posicaoValida = true;
			}
		}
	}
}








