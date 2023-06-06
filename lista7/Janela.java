package lista7;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Janela extends JFrame{

	public Janela( ) {
		
		this.setTitle("Gerenciador");
		this.setSize(600,600);
		this.setResizable(false);
		this.setLayout(new BorderLayout());
		
		Paineis paineis = new Paineis();
		
		this.add(new painelBotoes(paineis), BorderLayout.NORTH);
		this.add(paineis, BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	
}
