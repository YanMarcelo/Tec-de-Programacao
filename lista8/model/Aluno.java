package model;

import javax.swing.ImageIcon;

public class Aluno extends Entidades {
   
	public Aluno(Plano plano, int posicaox, int posicaoy, ImageIcon iconEntidade, int pontuacao) {
		super(plano, posicaox, posicaoy, iconEntidade, pontuacao);
		setIconAluno();
	}
	
	public void aumentarPontuacao(int incremento) {
        setPontuacao(getPontuacao() + incremento);
    }
	
	private void setIconAluno() {
        setIconEntidade(new ImageIcon("C:\\Users\\Yan Marcelo\\Documents\\eclipseufc\\lista8\\icons\\alunoplano.png"));
    }

	 public Celula getCelula() {
        return getPlano().retornarCelula(getPosicaox(), getPosicaoy());
    }
}


