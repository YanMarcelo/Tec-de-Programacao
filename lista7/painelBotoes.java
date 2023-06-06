package lista7;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class painelBotoes extends JPanel {

	Paineis painel;
	
	public painelBotoes(Paineis painel) {
		
		this.painel = painel;
		
		setBackground(Color.LIGHT_GRAY);
		
		JButton cadastrar = criarBotao("Cadastrar");
		cadastrar.addActionListener(new acaoCadastrar());
		add(cadastrar);
		
		JButton listar = criarBotao("Listar");
		listar.addActionListener(new acaoListar());
		add(listar);
		
		JButton atualizar = criarBotao("Atualizar");
		atualizar.addActionListener(new acaoAtualizar());
		add(atualizar);
		
		JButton deletar = criarBotao("Deletar");
		deletar.addActionListener(new acaoDeletar());
		add(deletar);
	}
	
	public JButton criarBotao(String nome) {
		JButton botao = new JButton(nome);
		return botao;
	}
	
	private class acaoCadastrar implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			if(painel.painelcadastro.isVisible()) {
				painel.painelcadastro.setVisible(false);
			}
			else painel.painelcadastro.setVisible(true);
			painel.painellistar.setVisible(false);
			painel.painelatualizar.setVisible(false);
			painel.paineldeletar.setVisible(false);
		}
	}
	
	private class acaoListar implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			if(painel.painellistar.isVisible()) {
				painel.painellistar.setVisible(false);
			}
			else painel.painellistar.setVisible(true);
			painel.painelcadastro.setVisible(false);
			painel.painelatualizar.setVisible(false);
			painel.paineldeletar.setVisible(false);
		}
	}
	
	private class acaoAtualizar implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			if(painel.painelatualizar.isVisible()) {
				painel.painelatualizar.setVisible(false);
			}
			else painel.painelatualizar.setVisible(true);
			painel.painelcadastro.setVisible(false);
			painel.painellistar.setVisible(false);
			painel.paineldeletar.setVisible(false);
		}
	}
	
	private class acaoDeletar implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			if(painel.paineldeletar.isVisible()) {
				painel.paineldeletar.setVisible(false);
			}
			else painel.paineldeletar.setVisible(true);
			painel.painelcadastro.setVisible(false);
			painel.painelatualizar.setVisible(false);
			painel.painellistar.setVisible(false);
		}
	}
}
