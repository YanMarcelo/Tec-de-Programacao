package view;

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

import model.Celula;
import model.Entidades;
import model.Plano;

import javax.swing.BoxLayout;

public class Paineis extends JPanel {

	JPanel painelcima;
	JPanel painelbotoes;
	JPanel paineldireito;
	JTextField barra;
	JButton jogar;

	public Paineis() {

		this.setLayout(new BorderLayout());
		this.add(painelBotoes(), BorderLayout.WEST);
		this.add(painelSuperior(), BorderLayout.NORTH);
		this.add(painelDireito(), BorderLayout.EAST);
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

	private JPanel painelDireito() {
		
		paineldireito = new JPanel();
		paineldireito.setLayout(new BoxLayout(paineldireito, BoxLayout.Y_AXIS));
		paineldireito.setPreferredSize(new Dimension(235, 0));
		paineldireito.add(new PainelInfo());
		paineldireito.add(new PainelRobos());
		paineldireito.add(new PainelBotoesJogo());
		paineldireito.setVisible(false);
		
		return paineldireito;
	}


	public JPanel painelBotoes() {

		painelbotoes = new JPanel();
		getPainelbotoes().setLayout(new GridLayout(8,8));
		getPainelbotoes().setPreferredSize(new Dimension(500,400));
		getPainelbotoes().setVisible(false);

		return getPainelbotoes();
	}

	private void verificarBotaoJogar() {
		jogar.setEnabled(!barra.getText().isEmpty());
	}

	public JPanel getPainelbotoes() {
		return painelbotoes;
	}

	private class acaoJogar implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			barra.setText("");
			barra.setEditable(false);
			getPainelbotoes().setVisible(!getPainelbotoes().isVisible());
			paineldireito.setVisible(!paineldireito.isVisible());
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





