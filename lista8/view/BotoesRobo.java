package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import model.Celula;
import model.Plano;
import model.Robo;

public class BotoesRobo extends JButton {

    private JButton robo1;
    private JButton robo2;
    private JButton robo3;
    private static JButton roboSelecionado;
    private static int IdBotaoRobo;
    private ImageIcon ultimoIcon;

    public BotoesRobo() {
        ultimoIcon = new ImageIcon();
        roboSelecionado = null;
    }

    public JButton roboum() {
        ImageIcon roboum = new ImageIcon("C:\\Users\\Yan Marcelo\\Documents\\eclipseufc\\lista8\\icons\\robo1.png");
        robo1 = new JButton(roboum);
        robo1.setPreferredSize(new Dimension(75, 75));
        robo1.setBorderPainted(false);
        robo1.setBackground(Color.white);
        robo1.addActionListener(new acaoRoboUm(robo1));

        return robo1;
    }

    public JButton robodois() {
        ImageIcon robodois = new ImageIcon("C:\\Users\\Yan Marcelo\\Documents\\eclipseufc\\lista8\\icons\\robo2.png");
        robo2 = new JButton(robodois);
        Color corFundo = robo2.getBackground();
        robo2.setPreferredSize(new Dimension(75, 75));
        robo2.setBorderPainted(false);
        robo2.setBackground(corFundo);
        robo2.setBackground(Color.white);
        robo2.addActionListener(new acaoRoboDois(robo2));
        
        return robo2;
    }

	public JButton robotres() {
        ImageIcon robotres = new ImageIcon("C:\\Users\\Yan Marcelo\\Documents\\eclipseufc\\lista8\\icons\\robo3.png");
        robo3 = new JButton(robotres);
        robo3.setPreferredSize(new Dimension(75, 75));
        robo3.setBorderPainted(false);
        robo3.setBackground(Color.white);
        robo3.addActionListener(new acaoRoboTres(robo3));
        
        return robo3;
    }

    public ImageIcon getUltimoIcon() {
        return ultimoIcon;
    }

    public static JButton getRoboSelecionado() {
        return roboSelecionado;
    }

    public static void setRoboSelecionado(JButton robo) {
        roboSelecionado = robo;
    }

    
    public static int getIdBotaoRobo() {
		return IdBotaoRobo;
	}

	public static void setIdBotaoRobo(int idBotaoRobo) {
		IdBotaoRobo = idBotaoRobo;
	}

	private class acaoRoboUm implements ActionListener {
        private JButton botaoRobo;

        public acaoRoboUm(JButton botaoRobo) {
            this.botaoRobo = botaoRobo;
        }

        public void actionPerformed(ActionEvent e) {
            ultimoIcon = (ImageIcon) botaoRobo.getIcon();
            setRoboSelecionado(botaoRobo);
            setIdBotaoRobo(1);
        }
    }
	
	private class acaoRoboDois implements ActionListener {
        private JButton botaoRobo;

        public acaoRoboDois(JButton botaoRobo) {
            this.botaoRobo = botaoRobo;
        }

        public void actionPerformed(ActionEvent e) {
            ultimoIcon = (ImageIcon) botaoRobo.getIcon();
            setRoboSelecionado(botaoRobo);
            setIdBotaoRobo(2);
        }
    }
	
	private class acaoRoboTres implements ActionListener {
        private JButton botaoRobo;

        public acaoRoboTres(JButton botaoRobo) {
            this.botaoRobo = botaoRobo;
        }

        public void actionPerformed(ActionEvent e) {
            ultimoIcon = (ImageIcon) botaoRobo.getIcon();
            setRoboSelecionado(botaoRobo);
            setIdBotaoRobo(3);
        }
    }
	
}
