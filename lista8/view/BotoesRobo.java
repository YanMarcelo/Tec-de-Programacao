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
    Robo roboclicado;
    private static JButton roboSelecionado;
    private ImageIcon ultimoIcon;

    public BotoesRobo() {
        ultimoIcon = new ImageIcon();
        roboSelecionado = null;
    }

    public JButton roboum() {
        ImageIcon roboum = new ImageIcon("robo1.png");
        robo1 = new JButton(roboum);
        robo1.setPreferredSize(new Dimension(75, 75));
        robo1.setBorderPainted(false);
        robo1.setBackground(Color.white);
        robo1.addActionListener(new acaoRobos(robo1));

        return robo1;
    }

    public JButton robodois() {
        ImageIcon robodois = new ImageIcon("robo2.png");
        robo2 = new JButton(robodois);
        Color corFundo = robo2.getBackground();
        robo2.setPreferredSize(new Dimension(75, 75));
        robo2.setBorderPainted(false);
        robo2.setBackground(corFundo);
        robo2.setBackground(Color.white);
        robo2.addActionListener(new acaoRobos(robo2));
        
        return robo2;
    }

	public JButton robotres() {
        ImageIcon robotres = new ImageIcon("robo3.png");
        robo3 = new JButton(robotres);
        robo3.setPreferredSize(new Dimension(75, 75));
        robo3.setBorderPainted(false);
        robo3.setBackground(Color.white);
        robo3.addActionListener(new acaoRobos(robo3));
        
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

    private class acaoRobos implements ActionListener {
        private JButton botaoRobo;

        public acaoRobos(JButton botaoRobo) {
            this.botaoRobo = botaoRobo;
        }

        public void actionPerformed(ActionEvent e) {
            ultimoIcon = (ImageIcon) botaoRobo.getIcon();
            setRoboSelecionado(botaoRobo);
        }
    }
}
