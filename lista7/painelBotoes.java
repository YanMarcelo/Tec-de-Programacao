package lista7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class painelBotoes extends JPanel {

	JButton cadastrar;
	JButton listar;
	JButton atualizar;
	JButton deletar;
	
	public painelBotoes() {
		
		setBackground(Color.black);
		
		cadastrar = criarBotao("Cadastrar");
		add(cadastrar);
		cadastrar.addActionListener(new acaoCadastrar());
		
		listar = criarBotao("Listar");
		add(listar);
		
		atualizar = criarBotao("Atualizar");
		add(atualizar);
		
		deletar = criarBotao("Deletar");
		add(deletar);
	}
	
	public JButton criarBotao(String nome) {
		JButton botao = new JButton(nome);
		return botao;
	}
	
	private class acaoCadastrar implements ActionListener{
		
		Paineis paineis;
		
		public void actionPerformed(ActionEvent e) {
			
			paineis.painelCadastro().setVisible(true);
		}
	}
}
