package apresentacao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BotoesRobo extends JButton{
	
	JButton robo1;
	JButton robo2;
	JButton robo3;
	
	public JButton roboum() {
		
		ImageIcon roboum = new ImageIcon("robo1.png");
		robo1 = new JButton(roboum);
		robo1.setPreferredSize(new Dimension(75,75));
		robo1.setBorderPainted(false);
		robo1.setBackground(Color.white);
		robo1.addActionListener(new acaoRoboUm());
		return robo1;
	}
	
	public JButton robodois() {
       
		ImageIcon robodois = new ImageIcon("robo2.png");
		robo2 = new JButton(robodois);
		Color corFundo = robo2.getBackground();
		robo2.setPreferredSize(new Dimension(75,75));
		robo2.setBorderPainted(false);
		robo2.setBackground(corFundo);
		robo2.setBackground(Color.white);
		robo2.addActionListener(new acaoRoboDois());
		return robo2;
	}
	
	public JButton robotres() {
		
		ImageIcon robotres = new ImageIcon("robo3.png");
		robo3 = new JButton(robotres);
		robo3.setPreferredSize(new Dimension(75,75));
		robo3.setBorderPainted(false);
		robo3.setBackground(Color.white);
		robo3.addActionListener(new acaoRoboTres());
		return robo3;
	}

	private class acaoRoboUm implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			robo1.setEnabled(false);
		}
	}
	
	private class acaoRoboDois implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			robo2.setEnabled(false);
		}
	}
	
	private class acaoRoboTres implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			robo3.setEnabled(false);
		}
	}
}
