package model;

import javax.swing.ImageIcon;

public class Bug extends Entidades {


	public Bug(Plano plano, int posicaox, int posicaoy, ImageIcon iconEntidade, int pontuacao) {
		super(plano, posicaox, posicaoy, iconEntidade, pontuacao);
		setIconBug();
	}

	private void setIconBug() {
		setIconEntidade(new ImageIcon("C:\\Users\\Yan Marcelo\\Documents\\eclipseufc\\lista8\\icons\\bugplano.png"));
	}

	public Celula getCelula() {
        return getPlano().retornarCelula(getPosicaox(), getPosicaoy());
    }
}