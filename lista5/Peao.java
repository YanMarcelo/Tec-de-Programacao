package lista5;

public class Peao extends Robo {

	public Peao(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		tipo = "\u265F";
	}

	public void Avançar() {
		Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
		if (celulaAtual == null) {
			return;
		}
		Celula celulaDireita = plano.retornarCelula(posicaox + 1, posicaoy);
		if (celulaDireita != null) {
			celulaAtual.listarobos.remove(this);
			celulaDireita.listarobos.add(this);
			posicaox+=1;
		}
		plano.exibirPlano();
	}

	public void Retroceder() {
		Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
		if (celulaAtual == null) {
			return;
		}
		Celula celulaEsquerda = plano.retornarCelula(posicaox - 1, posicaoy);
		if (celulaEsquerda != null) {
			celulaAtual.listarobos.remove(this);
			celulaEsquerda.listarobos.add(this);
			posicaox-=1;
		}
		plano.exibirPlano();
	}


}
