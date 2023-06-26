package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import model.Plano;

public class PainelRobos extends JPanel{
		
	private Plano plano;

	public PainelRobos() {
        configPainel();
    }
	
	public void configPainel() {

		this.setPreferredSize(new Dimension(140,140));
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.setBackground(Color.white);

		this.add(new BotoesRobo().roboum());
		this.add(new BotoesRobo().robodois());
		this.add(new BotoesRobo().robotres());

	}
}
