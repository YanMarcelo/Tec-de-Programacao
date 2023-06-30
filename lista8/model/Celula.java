package model;

import java.util.ArrayList;

import javax.swing.JButton;

public class Celula {

	private int posicaoX;
	private int posicaoY;
	private ArrayList<Entidades> listaentidades;
	private JButton botaocelula;

	public Celula(int x , int y) {

		botaocelula = new JButton();
		setPosicaoX(x);
		setPosicaoY(y);
		setListaentidades(new ArrayList<>());

	}

	public int getPosicaoX() {
		return posicaoX;
	}

	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}

	public ArrayList<Entidades> getListaentidades() {
		return listaentidades;
	}

	public void setListaentidades(ArrayList<Entidades> listaentidades) {
		this.listaentidades = listaentidades;
	}

	public JButton getBotaocelula() {
		return botaocelula;
	}

	public void setBotaocelula(JButton botaocelula) {
		this.botaocelula = botaocelula;
	}
}

