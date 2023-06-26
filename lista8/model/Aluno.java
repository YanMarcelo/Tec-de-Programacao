package model;

import javax.swing.ImageIcon;

public class Aluno extends Entidades {
   

    
	public Aluno(Plano plano, int posicaox, int posicaoy, ImageIcon iconEntidade) {
		super(plano, posicaox, posicaoy, iconEntidade);
		setIconAluno();
	}

	private void setIconAluno() {
        setIconEntidade(new ImageIcon("alunoplano.png"));
    }
}


