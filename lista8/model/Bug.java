package model;

import javax.swing.ImageIcon;

public class Bug extends Entidades {
   
   
	public Bug(Plano plano, int posicaox, int posicaoy, ImageIcon iconEntidade) {
		super(plano, posicaox, posicaoy, iconEntidade);
		setIconBug();
	}

	private void setIconBug() {
        setIconEntidade(new ImageIcon("bugplano.png"));
    }
}