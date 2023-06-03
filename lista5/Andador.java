package lista5;

public class Andador extends Robo implements Movimentos{

	public Andador(int id, String nome, int posicaox, int posicaoy, Plano plano) {
		super(id, nome, posicaox, posicaoy, plano);
		tipo = "\uD83E\uDD16";
		
	}

	public void Retroceder(int movercima) {
		Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
    	if (celulaAtual == null) {
    	return;
}
    Celula celulaCima = plano.retornarCelula(posicaox, posicaoy - movercima);
    	if (celulaCima != null) {
			celulaAtual.listarobos.remove(this);
    		celulaCima.listarobos.add(this);
    		posicaoy -=movercima;
    }
    	plano.exibirPlano();
}
	public void Avançar(int moverbaixo) {
		Celula celulaAtual = plano.retornarCelula(posicaox, posicaoy);
    	if (celulaAtual == null) {
    	return;
    }
    Celula celulaBaixo = plano.retornarCelula(posicaox, posicaoy + moverbaixo);
    	if (celulaBaixo != null) {
			celulaAtual.listarobos.remove(this);
    		celulaBaixo.listarobos.add(this);
    		posicaoy += moverbaixo;
    }
    	plano.exibirPlano();
	}
	
}
