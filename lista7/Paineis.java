package lista7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.concurrent.Flow;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Paineis extends JPanel{

	JPanel painelcadastro;
	JPanel painellistar;
	JPanel painelatualizar;
	JPanel paineldeletar;	
	
	public Paineis() {
		
		this.add(painelCadastro());
		this.add(painelListar());
		this.add(painelAtualizar());
		this.add(painelDeletar());

	}
	
	public JPanel painelCadastro() {
	    painelcadastro = new JPanel();
	    painelcadastro.setLayout(new GridLayout(10,2));
	    
	    JTextField barranome = new JTextField();
	    JTextField barracpf = new JTextField();
	    JTextField barramatricula = new JTextField();
	    JTextField barravertente = new JTextField();

	    JButton botaocadastrar = new JButton("Cadastro");

	    JLabel nome = criarTexto("Nome :");
	    nome.setForeground(Color.white);
	    JLabel cpf = criarTexto("CPF :");
	    cpf.setForeground(Color.white);
	    JLabel matricula = criarTexto("Matrícula :");
	    matricula.setForeground(Color.white);
	    JLabel vertente = criarTexto("Vertente :");
	    vertente.setForeground(Color.white);
	    
	    painelcadastro.add(nome);
	    painelcadastro.add(barranome);
	    painelcadastro.add(cpf);
	    painelcadastro.add(barracpf);
	    painelcadastro.add(matricula);
	    painelcadastro.add(barramatricula);
	    painelcadastro.add(vertente);
	    painelcadastro.add(barravertente);
	    painelcadastro.add(botaocadastrar);

	    painelcadastro.setBackground(new Color(105, 105, 105));
	    painelcadastro.setPreferredSize(new Dimension(560, 510));
	    painelcadastro.setVisible(false);

	    return painelcadastro;
	}
	
	public JPanel painelListar() {
		
		JLabel tabela = new JLabel("tabela");
		painellistar = new JPanel();
		painellistar.add(tabela);
		painellistar.setBackground(Color.gray);
	    painellistar.setPreferredSize(new Dimension(560,510));
		painellistar.setVisible(false);
	    
		return painellistar;
	}
	
	public JPanel painelAtualizar() {
		
		painelatualizar = new JPanel();
		
		JLabel matricula = new JLabel("Matrícula :");
		JLabel vertente = new JLabel("Ventente :");
		JTextField barramatricula = new JTextField();
		JTextField barravertente = new JTextField();

		painelatualizar.add(matricula);
		painelatualizar.add(barramatricula);
		
		painelatualizar.add(vertente);
		painelatualizar.add(barravertente);

		painelatualizar.setBackground(Color.gray);
		painelatualizar.setPreferredSize(new Dimension(560,510));
		painelatualizar.setVisible(false);
		
		return painelatualizar;
	}
	
	public JPanel painelDeletar() {
		
		paineldeletar = new JPanel();
		JLabel textocadastro = new JLabel("Teste4");
		JTextField barra = new JTextField();
		paineldeletar.setBackground(new Color(169,169,169));
		paineldeletar.setPreferredSize(new Dimension(500,500));
		paineldeletar.add(textocadastro);
		paineldeletar.add(barra);
		paineldeletar.setVisible(false);
		
		return paineldeletar;
	}
	
	public JLabel criarTexto(String nome) {
		
		JLabel texto = new JLabel(nome);
		
		return texto;
	}
	
}
