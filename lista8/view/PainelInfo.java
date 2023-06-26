package view;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelInfo extends JPanel{

	public int pontrobo1;
	public int pontrobo2;
	public int pontrobo3;

	public PainelInfo() {

		JPanel painelpont = new JPanel();
		JLabel ponttotal = new JLabel(" Pontuação: 0");
		painelpont.setBackground(Color.white);
		painelpont.add(ponttotal);

		JPanel painelrobos = new JPanel();
		JLabel robo1 = new JLabel(new ImageIcon("robo1p.png"));
		pontrobo1 = 0;
		JLabel robo2 = new JLabel(new ImageIcon("robo2p.png"));
		pontrobo2 = 0;
		JLabel robo3 = new JLabel(new ImageIcon("robo3p.png"));
		pontrobo3 = 0;

		painelrobos.add(robo1);
		painelrobos.add(new JLabel(" "+ pontrobo1));
		painelrobos.add(robo2);
		painelrobos.add(new JLabel(" "+ pontrobo2));
		painelrobos.add(robo3);
		painelrobos.add(new JLabel(" " + pontrobo3));
		painelrobos.setBackground(Color.white);

		JPanel painelinfplano = new JPanel();
		JLabel aluno = new JLabel(new ImageIcon("aluno.png"));
		JLabel pontalu = new JLabel("0");
		JLabel bug = new JLabel(new ImageIcon("bug.png"));
		JLabel pontbug = new JLabel("0");
		JLabel total = new JLabel("Total: ");
		painelinfplano.setBackground(Color.white);


		painelinfplano.add(total);
		painelinfplano.add(aluno);
		painelinfplano.add(pontalu);
		painelinfplano.add(bug);
		painelinfplano.add(pontbug);

		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		this.add(painelpont);
		this.add(painelinfplano);
		this.add(painelrobos);

	}
	public void atualizarPontuacaoRobo1(int pontuacao) {
		pontrobo1 = pontuacao;

	}

	public void atualizarPontuacaoRobo2(int pontuacao) {
		pontrobo2 = pontuacao;
	}

	public void atualizarPontuacaoRobo3(int pontuacao) {
		pontrobo3 = pontuacao;

	}

}

