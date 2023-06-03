package lista5;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jogo {

	private Scanner ler = new Scanner(System.in);
	protected ArrayList<Robo> listarobos;
	protected ArrayList<Entidades> listaentidades;
	Plano p = new Plano (1,1);

	public void jogar() {	
		listaentidades = new ArrayList<>();
		listarobos = new ArrayList<>();
		dimensaoPlano();	
		roboAndar();
	}

	public void roboAndar() {

		int rodada = 0;
		
		Andador A = new Andador(01, "Andador", 1, 1, p);
		listarobos.add(A);
		Peao P = new Peao(02, "Peão", 1, 1, p);
		listarobos.add(P);
		Torre T = new Torre(03, "Torre",1, 1, p);
		listarobos.add(T);
		Bispo B = new Bispo(04,"Bispo", 1, 1, p);
		listarobos.add(B);
		Cavalo C = new Cavalo(05, "Cavalo", 1, 1, p);
		listarobos.add(C);
		Rei REI = new Rei(06, "Rei", 1, 1, p);
		listarobos.add(REI);
		Rainha RAI = new Rainha(07, "Rainha", 1, 1, p);
		listarobos.add(RAI);

		System.out.println("\nEscolha o número de alunos: ");
		int numentidades = ler.nextInt();

		for(int j=0; j<numentidades; j++) {
			Aluno ALU = new Aluno(p);
			listaentidades.add(ALU);
		}

		System.out.println("\nEscolha o número de bugs: ");
		numentidades = ler.nextInt();

		for(int j=0; j<numentidades; j++) {
			Bug BUG = new Bug(p);
			listaentidades.add(BUG);
		}
		p.exibirPlano();

		System.out.println("(1)\uD83E\uDD16 (2)\u265F (3)\u265C (4)\u265D (5)\u265E (6)\u265A (7)\u265B");

		while(verificarCelular())  {
			for(int j=1; j<8; j++) {

				System.out.println("\nVocê deseja avançar ou retroceder?");
				ler.nextLine();

				if(j==1) {
					try {
					String jogador = ler.nextLine();
					if(jogador.equals("avançar") || jogador.equals("Avançar") || jogador.equals("AVANÇAR") || jogador.equals("avancar") || jogador.equals("AVANCAR") || jogador.equals("Avancar")) {
						System.out.println("\nQuantas posições?");
						int jogadorint = ler.nextInt();
						A.Avançar(jogadorint);
					}
					else if(jogador.equals("retroceder") || jogador.equals("Retroceder") || jogador.equals("RETROCEDER")) {
						System.out.println("\nQuantas posições?");
						int jogadorint = ler.nextInt();
						A.Retroceder(jogadorint);
						}
					}
					catch (Exception e) {
						ler.nextLine();
					}
				}

				if(j==2) {
					try {
					String jogador = ler.nextLine();
					if(jogador.equals("avançar") || jogador.equals("Avançar") || jogador.equals("AVANÇAR") || jogador.equals("avancar") || jogador.equals("AVANCAR") || jogador.equals("Avancar")) {
						P.Avançar();
					}
					else if(jogador.equals("retroceder") || jogador.equals("Retroceder") || jogador.equals("RETROCEDER")) {
						P.Retroceder();
						}
					}
					catch (Exception e) {
						ler.nextLine();
					}
				}

				if(j==3) {
					try {
					String jogador = ler.nextLine();
					if(jogador.equals("avançar") || jogador.equals("Avançar") || jogador.equals("AVANÇAR") || jogador.equals("avancar") || jogador.equals("AVANCAR") || jogador.equals("Avancar")) {
						System.out.println("\nQuantas posições?");
						int jogadorint = ler.nextInt();
						T.Avançar(jogadorint);
					}
					else if(jogador.equals("retroceder") || jogador.equals("Retroceder") || jogador.equals("RETROCEDER")) {
						System.out.println("\nQuantas posições?");
						int jogadorint = ler.nextInt();
						T.Retroceder(jogadorint);
						}
					}
					catch (Exception e) {
						ler.nextLine();
					}
				}

				if(j==4) {
					try {
					String jogador = ler.nextLine();
					if(jogador.equals("avançar") || jogador.equals("Avançar") || jogador.equals("AVANÇAR") || jogador.equals("avancar") || jogador.equals("AVANCAR") || jogador.equals("Avancar")) {
						System.out.println("\nQuantas posições?");
						int jogadorint = ler.nextInt();
						B.Avançar(jogadorint);
					}
					else if(jogador.equals("retroceder") || jogador.equals("Retroceder") || jogador.equals("RETROCEDER")) {
						System.out.println("\nQuantas posições?");
						int jogadorint = ler.nextInt();
						B.Retroceder(jogadorint);
						}
					}
					catch (Exception e) {
						ler.nextLine();
					}
				}

				if(j==5) {
					try {
					String jogador = ler.nextLine();
					if(jogador.equals("avançar") || jogador.equals("Avançar") || jogador.equals("AVANÇAR") || jogador.equals("avancar") || jogador.equals("AVANCAR") || jogador.equals("Avancar")) {
						System.out.println("\nQuantas posições?");
						int jogadorint = ler.nextInt();
						C.Avançar(jogadorint);
					}
					else if(jogador.equals("retroceder") || jogador.equals("Retroceder") || jogador.equals("RETROCEDER")) {
						System.out.println("\nQuantas posições?");
						int jogadorint = ler.nextInt();
						C.Retroceder(jogadorint);
						}
					}
					catch (Exception e) {
						ler.nextLine();
					}
				}

				if(j==6) {
					try {
					String jogador = ler.nextLine();
					if(jogador.equals("avançar") || jogador.equals("Avançar") || jogador.equals("AVANÇAR") || jogador.equals("avancar") || jogador.equals("AVANCAR") || jogador.equals("Avancar")) {
						System.out.println("\nQuantas posições?");
						int jogadorint = ler.nextInt();
						REI.Avançar(jogadorint);
					}
					else if(jogador.equals("retroceder") || jogador.equals("Retroceder") || jogador.equals("RETROCEDER")) {
						System.out.println("\nQuantas posições?");
						int jogadorint = ler.nextInt();
						REI.Retroceder(jogadorint);
						}
					}
					catch (Exception e) {
						ler.nextLine();
					}
				}

				if(j==7) {
					try {
					String jogador = ler.nextLine();
					if(jogador.equals("avançar") || jogador.equals("Avançar") || jogador.equals("AVANÇAR") || jogador.equals("avancar") || jogador.equals("AVANCAR") || jogador.equals("Avancar")) {
						System.out.println("\nQuantas posições?");
						int jogadorint = ler.nextInt();
						RAI.Avançar(jogadorint);
					}
					else if(jogador.equals("retroceder") || jogador.equals("Retroceder") || jogador.equals("RETROCEDER")) {
						System.out.println("\nQuantas posições?");
						int jogadorint = ler.nextInt();
						RAI.Retroceder(jogadorint);
						}
					}
					catch (Exception e) {
						ler.nextLine();
					}
				}
			}
			rodada++;
			System.out.println("Rodada " + rodada + ":" + "\n");
			pontuacaoJogo();
			ler.nextLine();
			System.out.println("\nDeseja continuar jogando? S/N");
			String jogador = ler.nextLine();
			if(jogador.equalsIgnoreCase("nao") || jogador.equalsIgnoreCase("não") || jogador.equalsIgnoreCase("n")) {
				return;
			}
		}
	}

	public void dimensaoPlano(){
		System.out.println("Escolha o tamanho X do mapa: ");
		int pxjogador = ler.nextInt();
		System.out.println("Escolha o tamanho Y do mapa: ");
		int pyjogador = ler.nextInt();
		p = new Plano(pxjogador, pyjogador);
	}

	public void pontuacaoJogo() {
		for(Celula celula : p.listaCelulas) {
			for(Robo robo : celula.listarobos) {
				for(Entidades entidade : listaentidades) {
					if(robo.posicaox == entidade.posicaox && robo.posicaoy == entidade.posicaoy && entidade.tipo.equals("\uD83D\uDC1E")) {
						robo.pontuacao -= 15;
						celula.listaentidades.remove(entidade);
					}
					if(robo.posicaox == entidade.posicaox && robo.posicaoy == entidade.posicaoy && entidade.tipo.equals("\uD83C\uDf93")) {
						robo.pontuacao +=10;
						celula.listaentidades.remove(entidade);
					}
				}
				System.out.println(robo.nome +":"+ robo.pontuacao);
			}
		}
	}

	public boolean verificarCelular() {

		for(Celula celula : p.listaCelulas) {
			for(Entidades aluno : celula.listaentidades) {
				if(aluno.tipo.equals("\uD83C\uDf93"))
					return true;
			}
		}
		return false;
	}


}


