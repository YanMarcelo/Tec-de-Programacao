package apresentacao;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelInfo extends JPanel{

	public PainelInfo() {

		JPanel painelpont = new JPanel();
		JLabel pontuacao = new JLabel(" Pontuação: 0");
		painelpont.setBackground(Color.white);
		painelpont.add(pontuacao);

		JPanel painelrobos = new JPanel();
		JLabel robo1 = new JLabel(new ImageIcon("robo1p.png"));
		JLabel robo2 = new JLabel(new ImageIcon("robo2p.png"));
		JLabel robo3 = new JLabel(new ImageIcon("robo3p.png"));
		painelrobos.add(robo1);
		painelrobos.add(new JLabel("0"));
		painelrobos.add(robo2);
		painelrobos.add(new JLabel("0"));
		painelrobos.add(robo3);
		painelrobos.add(new JLabel("0"));
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
}
