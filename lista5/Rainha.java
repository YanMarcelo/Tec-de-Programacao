package lista5;

public class Rainha extends Robo implements Movimentos{ 

	public Rainha(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		tipo = "\u265B";
	}

	public void Avançar(int moverbaixo) {
		Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
		if (celulaAtual == null) {
			return;
		}
		Celula celulaBaixo = plano.retornarCelula(posicaox + moverbaixo, posicaoy + moverbaixo);
		if (celulaBaixo != null) {
			celulaAtual.listarobos.remove(this);
			celulaBaixo.listarobos.add(this);
			posicaox +=moverbaixo;
			posicaoy += moverbaixo;
		}
		plano.exibirPlano();
	}

	public void Retroceder(int movercima) {
		Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
		if (celulaAtual == null) {
			return;
		}
		Celula celulaCima = plano.retornarCelula(posicaox - movercima, posicaoy - movercima);
		if (celulaCima != null) {
			celulaAtual.listarobos.remove(this);
			celulaCima.listarobos.add(this);
			posicaox -=movercima;
			posicaoy -=movercima;
		}
		plano.exibirPlano();
	}
	
	
}
