package apresentacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import negocios.Celula;
import negocios.Entidades;
import negocios.Plano;

import javax.swing.BoxLayout;

public class Paineis extends JPanel{

	JPanel painelcima;
	JPanel painelbotoes;
	JPanel paineldireito;
	JTextField barra;
	JButton jogar;

	Plano plano;
	Celula celulas;
	Entidades entidades;
	BotoesRobo botoesRobo;


	public Paineis() {

		this.setLayout(new BorderLayout());
		this.add(painelBotoes(), BorderLayout.WEST);
		this.add(painelDireito(), BorderLayout.EAST);
		this.add(painelSuperior(), BorderLayout.NORTH);
	}

	public JPanel painelSuperior() {
		painelcima = new JPanel();

		JLabel texto = new JLabel("Nome do Jogador: ");
		texto.setForeground(Color.white);

		barra = new JTextField();
		barra.setPreferredSize(new Dimension(150,25));
		barra.getDocument().addDocumentListener(new acaoBarra());

		jogar = new JButton("Jogar");
		jogar.setBackground(Color.white);
		jogar.setEnabled(false);
		jogar.addActionListener(new acaoJogar());

		JButton relatorio = new JButton("Relatório do Jogo");
		relatorio.setBackground(Color.white);

		painelcima.setBackground(Color.black);

		painelcima.add(texto);
		painelcima.add(barra);
		painelcima.add(jogar);
		painelcima.add(relatorio);

		painelcima.setVisible(true);

		return painelcima;
	}

	public JPanel painelBotoes() {

		painelbotoes = new JPanel();

		criarBotao(painelbotoes);

		painelbotoes.setLayout(new GridLayout(8,8));
		painelbotoes.setPreferredSize(new Dimension(500,400));

		painelbotoes.setVisible(false);

		return painelbotoes;
	}

	public JPanel painelDireito() {

		paineldireito = new JPanel();

		paineldireito.setLayout(new BoxLayout(paineldireito, BoxLayout.Y_AXIS));
		paineldireito.setPreferredSize(new Dimension(235,0));

		paineldireito.add(new PainelInfo());
		paineldireito.add(new PainelRobos());
		paineldireito.add(new PainelBotoesJogo());

		paineldireito.setVisible(false);

		return paineldireito;
	}

	public void criarBotao(JPanel painelbotoes) {

		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				JButton botao = new JButton();
				LineBorder border = new LineBorder(Color.black, 1);
				if((i+j)%2==0) {
					botao.setBackground(Color.black);
					botao.setBorder(border);
				} else {
					botao.setBackground(Color.white);
					botao.setBorder(border);
				}
				painelbotoes.add(botao);
			}
		}
	}

	private void verificarBotaoJogar() {
		jogar.setEnabled(!barra.getText().isEmpty());
	}

	private class acaoJogar implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			barra.setText("");
			barra.setEditable(false);
			painelbotoes.setVisible(!painelbotoes.isVisible());
			paineldireito.setVisible(!paineldireito.isVisible());
		}
	}

	private class acaoPlano implements ActionListener{

		public void actionPerformed(ActionEvent e) {

		}
	}

	private class acaoBarra implements DocumentListener{

		public void insertUpdate(DocumentEvent e) {
			verificarBotaoJogar();
		}


		public void removeUpdate(DocumentEvent e) {
			verificarBotaoJogar();
		}

		public void changedUpdate(DocumentEvent e) {
			verificarBotaoJogar();
		}

	}
}





