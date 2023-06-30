package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class PainelBotoesJogo extends JPanel {

	private JButton verificar;
	private JButton sair;
	private JButton proximajogada;

	public PainelBotoesJogo() {
		
		verificar = criarBotao("Verificar");
		sair = criarBotao("Sair do Jogo");
		sair.addActionListener(new AcaoSairJogo());
		proximajogada = criarBotao("Próxima Jogada");
		proximajogada.setEnabled(false);

		setLayout(new GridLayout(3, 1, 1, 5));
		setBackground(Color.white);

		add(verificar);
		add(proximajogada);
		add(sair);
	}

	private JButton criarBotao(String texto) {
		JButton botao = new JButton(texto);
		botao.setPreferredSize(new Dimension(60, 60));
		botao.setBackground(Color.black);
		botao.setForeground(Color.white);
		return botao;
	}

	private int dialogoSairJogo() {

		ImageIcon icon = new ImageIcon("C:\\Users\\Yan Marcelo\\Documents\\eclipseufc\\lista8\\icons\\aviso.png");
		UIManager.put("OptionPane.questionIcon", icon);
		UIManager.put("Button.background", Color.BLACK);
		UIManager.put("Button.foreground", Color.WHITE);

		return JOptionPane.showConfirmDialog(
				null,
				"Tem certeza que deseja sair do jogo?",
				"Confirmação",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);
	}

	private class AcaoSairJogo implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int resposta = dialogoSairJogo();
			if (resposta == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}
	}

	public JButton getVerificar() {
		return verificar;
	}

	public void setVerificar(JButton verificar) {
		this.verificar = verificar;
	}

}
