package lista7;

import javax.swing.JFrame;

public class Janela extends JFrame{

	public Janela( ) {
		
		this.setSize(500,500);
		this.add(new Paineis());
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
}
