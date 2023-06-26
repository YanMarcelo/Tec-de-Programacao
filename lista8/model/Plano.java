package model;

import java.util.ArrayList;

public class Plano {

	private ArrayList<Celula> listaCelulas;
	private int tamanhox;
	private int tamanhoy;

	public Plano(int tamanhoX, int tamanhoY) {
		listaCelulas = new ArrayList<Celula>();
		this.setTamanhox(tamanhoX);
		this.setTamanhoy(tamanhoY);

		for (int i = 0; i < tamanhoX; i++) {
			for (int j = 0; j < tamanhoY; j++) {
				Celula celula = new Celula(i, j);
				listaCelulas.add(celula);
			}
		}
	}
	
	public Celula retornarCelula(int x, int y) {
		for (int i = 0; i < listaCelulas.size(); i++) {
			if (listaCelulas.get(i).getPosicaoX() == x && listaCelulas.get(i).getPosicaoY() == y) {
				return listaCelulas.get(i);
			}
		}
		return null;
	}

	public int getTamanhox() {
		return tamanhox;
	}

	public void setTamanhox(int tamanhox) {
		this.tamanhox = tamanhox;
	}

	public int getTamanhoy() {
		return tamanhoy;
	}

	public void setTamanhoy(int tamanhoy) {
		this.tamanhoy = tamanhoy;
	}
	
	public ArrayList<Celula> getListaCelulas() {
		return listaCelulas;
	}
	
}
