package model;

import java.util.Random;

import javax.swing.ImageIcon;

public abstract class Entidades {
    private int posicaox;
    private int posicaoy;
    private Plano plano;
    private int pontuacao;
    private ImageIcon iconEntidade;

    public Entidades(Plano plano, int posicaox, int posicaoy, ImageIcon iconEntidade) {
        this.setPlano(plano);
        this.setPosicaox(posicaox);
        this.setPosicaoy(posicaoy);
        this.setIconEntidade(iconEntidade);
    }

    public void aumentarPontuacao(int quantidade) {
        setPontuacao(getPontuacao() + quantidade);
    }

	public int getPosicaox() {
		return posicaox;
	}

	public void setPosicaox(int posicaox) {
		this.posicaox = posicaox;
	}

	public int getPosicaoy() {
		return posicaoy;
	}

	public void setPosicaoy(int posicaoy) {
		this.posicaoy = posicaoy;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public ImageIcon getIconEntidade() {
		return iconEntidade;
	}

	public void setIconEntidade(ImageIcon iconEntidade) {
		this.iconEntidade = iconEntidade;
	}

	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}

}

