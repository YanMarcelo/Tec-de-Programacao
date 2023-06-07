package lista7;

import java.awt.BorderLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Janela extends JFrame{

	public Janela( ) {

		this.setTitle("Gerenciador de Alunos");
		this.setSize(400,350);
		this.setResizable(false);
		this.setLayout(new BorderLayout(0,50));

		ImageIcon originalIcon = new ImageIcon("C:\\Users\\Yan Marcelo\\Documents\\eclipseufc\\lista7\\src\\lista7\\WIN_20221220_23_54_00_Pro__2_-removebg-preview.png");
		Image resizedIcon = originalIcon.getImage().getScaledInstance(256, 256, Image.SCALE_SMOOTH);
		ImageIcon icon = new ImageIcon(resizedIcon);
		setIconImage(icon.getImage());

		Paineis paineis = new Paineis();

		this.add(new painelBotoes(paineis), BorderLayout.NORTH);
		this.add(paineis, BorderLayout.CENTER);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}


}
