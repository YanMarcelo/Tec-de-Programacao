package lista5;

public class Rei extends Robo implements Movimentos{

	public Rei(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		tipo = "\u265A";
	}
	
	public void Avançar(int moverbaixo) {
		Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
		if (celulaAtual == null) {
			return;
		}
		Celula celulaDireita = plano.retornarCelula(posicaox + moverbaixo, posicaoy + moverbaixo);
		if (celulaDireita != null) {
			celulaAtual.listarobos.remove(this);
			celulaDireita.listarobos.add(this);
			posicaox+=moverbaixo;
			posicaoy+=moverbaixo;
		}
		plano.exibirPlano();
	}

	public void Retroceder(int movercima) {
		Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
		if (celulaAtual == null) {
			return;
		}
		Celula celulaEsquerda = plano.retornarCelula(posicaox - movercima, posicaoy + movercima);
		if (celulaEsquerda != null) {
			celulaAtual.listarobos.remove(this);
			celulaEsquerda.listarobos.add(this);
			posicaox-=movercima;
			posicaoy-=movercima;
		}
		plano.exibirPlano();
	}



}
