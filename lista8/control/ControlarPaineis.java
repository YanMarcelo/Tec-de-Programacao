package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import view.PainelBotoesJogo;
import view.PainelInfo;

public class ControlarPaineis {

	public PainelInfo painelinfo;
	public PainelBotoesJogo painelbotoesjogo;
    
    public ControlarPaineis(PainelBotoesJogo painelbotoesjogo, PainelInfo painelinfo) {
        this.painelbotoesjogo = painelbotoesjogo;
        this.painelinfo = painelinfo;
    }
    
    public void atualizarPontuacoes(int pontuacaoRobo1, int pontuacaoRobo2, int pontuacaoRobo3) {
        painelinfo.setPontuacaoRobo1(pontuacaoRobo1);
        painelinfo.setPontuacaoRobo2(pontuacaoRobo2);
        painelinfo.setPontuacaoRobo3(pontuacaoRobo3);
        painelinfo.atualizarPontuacaoTotal();
    }
    
    public void controlPaineis() {
        painelbotoesjogo.getVerificar().addActionListener(new acaoVerificar());
    }

    private class acaoVerificar implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton botaoVerificar = (JButton) e.getSource();
            botaoVerificar.setEnabled(false);
            atualizarPontuacoes(13, 02, 30);
        }
    }
}
