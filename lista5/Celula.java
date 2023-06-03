package lista5;

import java.util.ArrayList;

public class Celula {
	protected int posicaoX;
	protected int posicaoY;
	protected int id;
	protected ArrayList<Robo> listarobos;
	protected ArrayList<Entidades> listaentidades;
	
	public Celula(int id, int x , int y) {
		posicaoX = x;
		posicaoY = y;
		this.id = id;
		listarobos = new ArrayList<>();
		listaentidades = new ArrayList<>();
	}
	
}
