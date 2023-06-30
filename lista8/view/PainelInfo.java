package view;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelInfo extends JPanel{

	public JLabel pontrobo1;
	public JLabel pontrobo2;
	public JLabel pontrobo3;
	public JLabel ponttotal;

	public PainelInfo() {

		JPanel painelpont = new JPanel();
		JLabel pontuaçao = new JLabel(" Pontuação:");
		ponttotal = new JLabel("");
		painelpont.setBackground(Color.white);
		painelpont.add(pontuaçao);
		painelpont.add(ponttotal);

		JPanel painelrobos = new JPanel();
		JLabel robo1 = new JLabel(new ImageIcon("C:\\Users\\Yan Marcelo\\Documents\\eclipseufc\\lista8\\icons\\robo1p.png"));
		JLabel robo2 = new JLabel(new ImageIcon("C:\\Users\\Yan Marcelo\\Documents\\eclipseufc\\lista8\\icons\\robo2p.png"));
		JLabel robo3 = new JLabel(new ImageIcon("C:\\Users\\Yan Marcelo\\Documents\\eclipseufc\\lista8\\icons\\robo3p.png"));
		pontrobo1 = new JLabel("");
		pontrobo2 = new JLabel("");
		pontrobo3 = new JLabel("");

		painelrobos.add(robo1);
		painelrobos.add(pontrobo1);
		painelrobos.add(robo2);
		painelrobos.add(pontrobo2);
		painelrobos.add(robo3);
		painelrobos.add(pontrobo3);
		painelrobos.setBackground(Color.white);

		JPanel painelinfplano = new JPanel();
		JLabel aluno = new JLabel(new ImageIcon("C:\\Users\\Yan Marcelo\\Documents\\eclipseufc\\lista8\\icons\\aluno.png"));
		JLabel pontalu = new JLabel("0");
		JLabel bug = new JLabel(new ImageIcon("C:\\Users\\Yan Marcelo\\Documents\\eclipseufc\\lista8\\icons\\bug.png"));
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

	public void setPontuacaoRobo1(int pontuacao) {
		pontrobo1.setText(String.valueOf(pontuacao));
	}

	public void setPontuacaoRobo2(int pontuacao) {
		pontrobo2.setText(String.valueOf(pontuacao));
	}

	public void setPontuacaoRobo3(int pontuacao) {
		pontrobo3.setText(String.valueOf(pontuacao));
	}

	public void atualizarPontuacaoTotal() {
		int pontuacaoRobo1 = Integer.parseInt(pontrobo1.getText());
		int pontuacaoRobo2 = Integer.parseInt(pontrobo2.getText());
		int pontuacaoRobo3 = Integer.parseInt(pontrobo3.getText());

		int pontuacaoTotal = pontuacaoRobo1 + pontuacaoRobo2 + pontuacaoRobo3;
		ponttotal.setText(String.valueOf(pontuacaoTotal));
	}
}

