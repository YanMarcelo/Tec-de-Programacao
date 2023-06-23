package apresentacao;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JanelaJogo extends JFrame{

	public JanelaJogo() {

		this.setTitle("O Regaste dos Alunos na Ilha de Java - Versão 2");
		this.setLayout(new BorderLayout());
		this.setSize(750,550);
		this.setResizable(false);
        this.setLocationRelativeTo(null);

		ImageIcon icon = new ImageIcon("icone.png");
		setIconImage(icon.getImage());
		
		Paineis paineis = new Paineis();
		
		this.add(paineis, BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
