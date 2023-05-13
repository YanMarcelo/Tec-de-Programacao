package Questao17;

import java.util.Scanner;

public class JogodaVelha {
	
	//Atributos //Encapsulamento 
	private Scanner ler = new Scanner(System.in);
	private Tabuleiro tabuleiro; //Tem
	
	public JogodaVelha() {
		this.tabuleiro = new Tabuleiro();
	}

	//Métodos
	public void jogodaVelha() {
		int jogadas = 0;
		boolean venceu = true;

		while (jogadas < 9 && venceu) {

			// JOGADOR 1
			System.out.println("\nJogador(1) escolha a posição: ");
			String jogador = ler.nextLine();
			jogadas++;

			while (!verificarPosicao(jogador)) {
				System.out.println("\nJogador(1) escolha outra posição: ");
				jogador = ler.nextLine();
			}
			for (int x = 0; x < 3; x++) {
				for (int y = 0; y < 3; y++) {
					if (jogador.equals(tabuleiro.getPlano()[x][y])) {
						tabuleiro.getPlano()[x][y] = "X";
					}
				}
			}

			// VENCEU
			if (verificarVencedor() == false) {
				venceu = true;
				jogarNovamente();
				return;
			}
			tabuleiro.exibirPlanoTabuleiro();

			// VELHA
			if (jogadas == 9 && !verificarVencedor()) {
				System.out.println("\nDeu velha !");
				jogarNovamente();
				return;
			}

			// JOGADOR 2
			System.out.println("\nJogador(2) escolha a posição: ");
			String jogador2 = ler.nextLine();
			jogadas++;

			while (!verificarPosicao(jogador2)) {
				System.out.println("\nJogador(2) escolha outra posição: ");
				jogador2 = ler.nextLine();
			}

			for (int x = 0; x < 3; x++) {
				for (int y = 0; y < 3; y++) {
					if (jogador2.equals(tabuleiro.getPlano()[x][y])) {
						tabuleiro.getPlano()[x][y] = "O";
					}
				}
			}

			// VENCEU
			if (verificarVencedor() == false) {
				venceu = true;
				jogarNovamente();
				return;
			}
			tabuleiro.exibirPlanoTabuleiro();
		}
	}	
	
	
	public boolean verificarPosicao(String jogador) {
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				if (jogador.equals(tabuleiro.getPlano()[x][y])) {
					return true;
				}
			}
		}
		System.out.println("Posição já ocupada!");
		return false;
	}
	
	public boolean verificarVencedor() {

		// Horizontal *Jogador(1)*
		if (tabuleiro.getPlano()[0][0].equals("X") && tabuleiro.getPlano()[1][0].equals("X")
				&& tabuleiro.getPlano()[2][0].equals("X")) {
			System.out.println("\nJogador(1) venceu !");
			return false;
		}
		if (tabuleiro.getPlano()[1][0].equals("X") && tabuleiro.getPlano()[1][1].equals("X")
				&& tabuleiro.getPlano()[1][2].equals("X")) {
			System.out.println("\nJogador(1) venceu !");
			return false;
		}
		if (tabuleiro.getPlano()[2][0].equals("X") && tabuleiro.getPlano()[2][1].equals("X")
				&& tabuleiro.getPlano()[2][2].equals("X")) {
			System.out.println("\nJogador(1) venceu !");
			return false;
		}

		// Diagonal
		if (tabuleiro.getPlano()[0][0].equals("X") && tabuleiro.getPlano()[1][1].equals("X")
				&& tabuleiro.getPlano()[2][2].equals("X")) {
			System.out.println("\nJogador(1) venceu !");
			return false;
		}
		if (tabuleiro.getPlano()[2][0].equals("X") && tabuleiro.getPlano()[1][1].equals("X")
				&& tabuleiro.getPlano()[0][2].equals("X")) {
			System.out.println("\nJogador(1) venceu !");
			return false;
		}

		// Vertical
		if (tabuleiro.getPlano()[0][0].equals("X") && tabuleiro.getPlano()[0][1].equals("X")
				&& tabuleiro.getPlano()[0][2].equals("X")) {
			System.out.println("\nJogador(1) venceu !");
			return false;
		}
		if (tabuleiro.getPlano()[0][1].equals("X") && tabuleiro.getPlano()[1][1].equals("X")
				&& tabuleiro.getPlano()[1][2].equals("X")) {
			System.out.println("\nJogador(1) venceu !");
			return false;
		}
		if (tabuleiro.getPlano()[0][2].equals("X") && tabuleiro.getPlano()[1][2].equals("X")
				&& tabuleiro.getPlano()[2][2].equals("X")) {
			System.out.println("\nJogador(1) venceu !");
			return false;
		}

		// Horizontal *Jogador(2)
		if (tabuleiro.getPlano()[0][0].equals("O") && tabuleiro.getPlano()[1][0].equals("O")
				&& tabuleiro.getPlano()[2][0].equals("O")) {
			System.out.println("\nJogador(2) venceu !");
			return false;
		}
		if (tabuleiro.getPlano()[0][1].equals("O") && tabuleiro.getPlano()[1][1].equals("O")
				&& tabuleiro.getPlano()[2][1].equals("O")) {
			System.out.println("\nJogador(2) venceu !");
			return false;
		}
		if (tabuleiro.getPlano()[0][2].equals("O") && tabuleiro.getPlano()[1][2].equals("O")
				&& tabuleiro.getPlano()[2][2].equals("O")) {
			System.out.println("\nJogador(2) venceu !");
			return false;
		}

		// Diagonal
		if (tabuleiro.getPlano()[0][0].equals("O") && tabuleiro.getPlano()[1][1].equals("O")
				&& tabuleiro.getPlano()[2][2].equals("O")) {
			System.out.println("\nJogador(2) venceu !");
			return false;
		}
		if (tabuleiro.getPlano()[0][2].equals("O") && tabuleiro.getPlano()[1][1].equals("O")
				&& tabuleiro.getPlano()[2][0].equals("O")) {
			System.out.println("\nJogador(2) venceu !");
			return false;
		}

		// Vertical
		if (tabuleiro.getPlano()[0][0].equals("O") && tabuleiro.getPlano()[0][1].equals("O")
				&& tabuleiro.getPlano()[0][2].equals("O")) {
			System.out.println("\nJogador(2) venceu !");
			return false;
		}
		if (tabuleiro.getPlano()[1][0].equals("O") && tabuleiro.getPlano()[1][1].equals("O")
				&& tabuleiro.getPlano()[1][2].equals("O")) {
			System.out.println("\nJogador(2) venceu !");
			return false;
		}
		if (tabuleiro.getPlano()[2][0].equals("O") && tabuleiro.getPlano()[2][1].equals("O")
				&& tabuleiro.getPlano()[2][2].equals("O")) {
			System.out.println("\nJogador(2) venceu !");
			return false;
		}

		return true;
	}

	public void jogarNovamente() {

		System.out.println("\nDeseja jogar novamente? S/N");
		String jogador = ler.nextLine();

		if (jogador.equals("Sim") || jogador.equals("S") || jogador.equals("s") || jogador.equals("sim")
				|| jogador.equals("SIM")) {
			JogodaVelha jogo = new JogodaVelha();
			jogo.jogodaVelha();
		}

		if (jogador.equals("N") || jogador.equals("Não") || jogador.equals("Nao") || jogador.equals("nao")
				|| jogador.equals("não") || jogador.equals("n") || jogador.equals("NAO") || jogador.equals("NÃO")) {
			System.out.println("\nFim de jogo !");
		}
	}
}

