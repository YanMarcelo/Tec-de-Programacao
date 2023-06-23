package apresentacao;

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
import javax.swing.border.LineBorder;

public class PainelBotoesJogo extends JPanel{
	
	public PainelBotoesJogo() {
		
		JButton verificar = new JButton(" Verificar ");
		JButton sair = new JButton(" Sair do Jogo ");
		JButton jogada = new JButton(" Próxima Jogada ");

		verificar.setPreferredSize(new Dimension(60,60));
		verificar.setBackground(Color.black);
		verificar.setForeground(Color.white);

		jogada.setPreferredSize(new Dimension(60,60));
		jogada.setBackground(Color.black);
		jogada.setForeground(Color.white);

		sair.setPreferredSize(new Dimension(60,60));
		sair.setBackground(Color.black);
		sair.setForeground(Color.white);
		sair.addActionListener(new acaoSairJogo());

		this.setLayout(new GridLayout(3,1,1,5));
		this.setBackground(Color.white);

		this.add(verificar);
		this.add(jogada);
		this.add(sair);

	}

	private int dialogoSairJogo() {
		
		ImageIcon icon = new ImageIcon("aviso.png");
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
	
	private class acaoSairJogo implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			int resposta = dialogoSairJogo();

			if (resposta == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}
	}
}
