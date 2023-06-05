package lista7;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Paineis extends JPanel{

	JPanel painelcadastro;
	
	public Paineis() {
		
		setLayout(new BorderLayout());
		this.add(new painelBotoes(),BorderLayout.NORTH);
		this.add(painelCadastro(), BorderLayout.CENTER);
		
	}
	
	public JPanel painelCadastro() {
		painelcadastro = new JPanel();
		JLabel textocadastro = new JLabel("Teste");
		painelcadastro.setSize(500,500);
		painelcadastro.setBackground(Color.gray);
		painelcadastro.add(textocadastro);
		painelcadastro.setVisible(false);
		
		
		return painelcadastro;
	}
	
}
