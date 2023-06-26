package view;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class PainelDireito extends JPanel {

    public PainelDireito() {
        painelDireito();
    }
    
    private void painelDireito() {
 
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setPreferredSize(new Dimension(235, 0));

        add(new PainelInfo());
        add(new PainelRobos());
        add(new PainelBotoesJogo());

        setVisible(false);
    }
}
