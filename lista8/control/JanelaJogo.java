package control;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;

import model.Aluno;
import model.Bug;
import model.Celula;
import model.Entidades;
import model.Plano;
import model.Robo;
import view.BotoesRobo;
import view.Paineis;
import view.PainelInfo;


public class JanelaJogo extends JFrame{

	private Paineis paineis;
	private Celula celula;
	private Plano plano;

	public JanelaJogo() {
		this.setTitle("O Regaste dos Alunos na Ilha de Java - Versão 2");
		this.setLayout(new BorderLayout());
		this.setSize(750, 550);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		ImageIcon icon = new ImageIcon("iconejogo.png");
		setIconImage(icon.getImage());

		this.paineis = new Paineis();
		this.add(paineis, BorderLayout.CENTER);
		criarPlano();

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public void criarPlano() {

		plano = new Plano(8, 8);
		ArrayList<Celula> celulasDisponiveis = new ArrayList<>();
		
		for (int i = 0; i < plano.getTamanhox(); i++) {
			for (int j = 0; j < plano.getTamanhoy(); j++) {
				Celula celula = new Celula(i, j);
				LineBorder border = new LineBorder(Color.black, 1);
				if ((i + j) % 2 == 0) {
					celula.getBotaocelula().setBackground(Color.black);
					celula.getBotaocelula().setBorder(border);
				} else {
					celula.getBotaocelula().setBackground(Color.white);
					celula.getBotaocelula().setBorder(border);
				}
				celulasDisponiveis.add(celula);
				celula.getBotaocelula().addActionListener(new acaoPlano(celula.getBotaocelula(), celula));
				paineis.getPainelbotoes().add(celula.getBotaocelula());
			}
		}
		verificarCelula(celulasDisponiveis, 25);
	}

	public void verificarCelula(ArrayList<Celula> celulaLivre, int quantidadeEntidades) {
		Random random = new Random();

		for (int i = 0; i < quantidadeEntidades; i++) {
			if (!celulaLivre.isEmpty()) {
				int indice = random.nextInt(celulaLivre.size());
				Celula celulaSorteada = celulaLivre.remove(indice);
				sortearEntidadePlano(celulaSorteada);
			}
		}
	}
	
	public void sortearEntidadePlano(Celula celula) {
		Random random = new Random();

		if (random.nextBoolean()) {
			criarAluno(celula);
		} else {
			criarBug(celula);
		}
	}

	public void criarAluno(Celula celula) {
	    ImageIcon iconAluno = new ImageIcon("imagem_aluno.png"); // substitua pela imagem do aluno
	    Entidades aluno = new Aluno(plano, celula.getPosicaoX(), celula.getPosicaoY(), iconAluno);
	    celula.getListaentidades().add(aluno);
	    celula.getBotaocelula().setIcon(aluno.getIconEntidade());
	}

	public void criarBug(Celula celula) {
	    ImageIcon iconBug = new ImageIcon("imagem_bug.png"); // substitua pela imagem do bug
	    Entidades bug = new Bug(plano, celula.getPosicaoX(), celula.getPosicaoY(), iconBug);
	    celula.getListaentidades().add(bug);
	    celula.getBotaocelula().setIcon(bug.getIconEntidade());
	}
	
	public void adicionarRobo(Celula celula) {
	    ImageIcon iconRobo = (ImageIcon) celula.getBotaocelula().getIcon();
	    Entidades robo = new Robo(plano, celula.getPosicaoX(), celula.getPosicaoY(), iconRobo);
	    celula.getListaentidades().add(robo);
	    
	    if (verificarAluno(celula)) {

	    }
	    if (verificarBug(celula)) {
	    }
	}

	public boolean verificarBug(Celula celula) {
	    for (Entidades entidade : celula.getListaentidades()) {
	        if (entidade instanceof Bug) {
	            return true;
	        }
	    }
	    return false;
	}

	public boolean verificarAluno(Celula celula) {
	    for (Entidades entidade : celula.getListaentidades()) {
	        if (entidade instanceof Aluno) {
	            return true;
	        }
	    }
	    return false;
	}
	
	private class acaoPlano implements ActionListener {
	    private JButton botaoPlano;
	    private Celula celula;

	    public acaoPlano(JButton botaoPlano, Celula celula) {
	        this.botaoPlano = botaoPlano;
	        this.celula = celula;
	    }

	    public void actionPerformed(ActionEvent e) {
	        if (BotoesRobo.getRoboSelecionado() != null) {
	            botaoPlano.setIcon(BotoesRobo.getRoboSelecionado().getIcon());
	            BotoesRobo.getRoboSelecionado().setEnabled(false);
	            BotoesRobo.setRoboSelecionado(null);
	            botaoPlano.setEnabled(false);
	            adicionarRobo(celula);
	        }
	    }
	}
}



