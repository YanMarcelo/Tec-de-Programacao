package lista5;

import java.util.ArrayList;

public class Plano {

	protected ArrayList<Celula> listaCelulas;
	protected int tamanhox;
	protected int tamanhoy;
	protected Robo robo;
	protected Entidades entidade;

	public Plano(int tamanhoX, int tamanhoY) {
		listaCelulas = new ArrayList<Celula>();
		this.tamanhox=tamanhoX;
		this.tamanhoy=tamanhoY;
		
		int contador = 1;
		for (int i = 1; i <= tamanhoX; i++) {
			for (int j = 1; j <= tamanhoY; j++) {
				Celula celula = new Celula(contador, j, i);
				listaCelulas.add(celula);
				contador++;
			}
		}
	}

	public void exibirPlano() {
		for (int y = 0; y < tamanhoy; y++) {
			for (int x = 0; x < tamanhox; x++) {
				Celula celula = listaCelulas.get(y * tamanhox + x);
				if (celula.listarobos != null && celula.listarobos.size()>1) {
					System.out.print("[\u2699]");
				}
				else if(celula.listaentidades.size()!=0) {
					for(Entidades entidade : celula.listaentidades) {
						System.out.print("["+entidade.tipo+"]");
					}
				}
				else if(celula.listarobos.size() != 0) {
					for(Robo robo : celula.listarobos) {
						System.out.print("["+robo.tipo+"]");
					}
				}
				else {
					System.out.print("[  ]");
				}
			}
			System.out.println();
		}
		System.out.println();
	}


	public Celula retornarCelula(int x, int y) {
		for (int i = 0; i < listaCelulas.size(); i++) {
			if (listaCelulas.get(i).posicaoX == x && listaCelulas.get(i).posicaoY == y) {
				return listaCelulas.get(i);
			}
		}
		return null;
	}

}
