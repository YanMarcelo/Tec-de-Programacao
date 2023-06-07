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
import javax.swing.JTable;
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
	    painelcadastro.setLayout(new GridLayout(5,2,2,4));
	    
	    JTextField barranome = new JTextField(10);
	    JTextField barracpf = new JTextField(10);
	    JTextField barramatricula = new JTextField(10);
	    JTextField barravertente = new JTextField(10);

	    JButton botaocadastrar = new JButton("Cadastro");

	    JLabel nome = criarTexto("Nome: ");
	    JLabel cpf = criarTexto("CPF: ");
	    JLabel matricula = criarTexto("Matrícula:  ");
	    JLabel vertente = criarTexto("Vertente: ");
	    
	    JPanel painelnome = new JPanel();
	    painelnome.setLayout(new BorderLayout());
	    painelnome.add(nome, BorderLayout.WEST);
	    painelnome.add(barranome, BorderLayout.EAST);
	    painelcadastro.add(painelnome);
	    
	    JPanel painelcpf = new JPanel();
	    painelcpf.setLayout(new BorderLayout());
	    painelcpf.add(cpf, BorderLayout.WEST);
	    painelcpf.add(barracpf, BorderLayout.EAST);
	    painelcadastro.add(painelcpf);
	    
	    JPanel painelmatricula = new JPanel();
	    painelmatricula.setLayout(new BorderLayout());
	    painelmatricula.add(matricula, BorderLayout.WEST);
	    painelmatricula.add(barramatricula, BorderLayout.EAST);
	    painelcadastro.add(painelmatricula);

	    JPanel painelvertente = new JPanel();
	    painelvertente.setLayout(new BorderLayout());
	    painelvertente.add(vertente, BorderLayout.WEST);
	    painelvertente.add(barravertente, BorderLayout.EAST);
	    painelcadastro.add(painelvertente);
	    
	    JPanel painelbotao = new JPanel();
	    painelbotao.setLayout(new BorderLayout());
	    painelbotao.add(botaocadastrar, BorderLayout.SOUTH);
	    painelcadastro.add(painelbotao);

	    painelcadastro.setVisible(false);

	    return painelcadastro;
	}
	
	public JPanel painelListar() {
		
		JTable tabela = new JTable();
		painellistar = new JPanel();
		painellistar.add(tabela);
		painellistar.setBackground(Color.gray);
		painellistar.setVisible(false);
	    
		return painellistar;
	}
	
	public JPanel painelAtualizar() {
		
		painelatualizar = new JPanel();
	    painelatualizar.setLayout(new GridLayout(3,2,5,4));

		JLabel matricula = new JLabel("Matrícula:  ");
		JLabel vertente = new JLabel("Ventente:  ");
		JTextField barramatricula = new JTextField(10);
		JTextField barravertente = new JTextField(10);

		JPanel painelmatricula = new JPanel();
		painelmatricula.setLayout(new BorderLayout());
		painelmatricula.add(matricula, BorderLayout.WEST);
		painelmatricula.add(barramatricula, BorderLayout.EAST);
		painelatualizar.add(painelmatricula);
		
		JPanel painelvertente = new JPanel();
		painelvertente.setLayout(new BorderLayout());
		painelvertente.add(vertente, BorderLayout.WEST);
		painelvertente.add(barravertente, BorderLayout.EAST);
		painelatualizar.add(painelvertente);
		
		JPanel painelbotao = new JPanel();
		JButton botaoatualizar = new JButton("Atualizar");
	    painelbotao.setLayout(new BorderLayout());
	    painelbotao.add(botaoatualizar, BorderLayout.SOUTH);
	    painelatualizar.add(painelbotao);
		
		painelatualizar.setVisible(false);
		
		return painelatualizar;
	}
	
	public JPanel painelDeletar() {
		
		paineldeletar = new JPanel();
	    paineldeletar.setLayout(new GridLayout(2,2,5,4));

		JLabel matricula = new JLabel("Matrícula:  ");
		JTextField barramatricula = new JTextField(10);

		JPanel painelmatricula = new JPanel();
		painelmatricula.setLayout(new BorderLayout());
		painelmatricula.add(matricula, BorderLayout.WEST);
		painelmatricula.add(barramatricula, BorderLayout.EAST);
		paineldeletar.add(painelmatricula);
		
		
		JPanel painelbotao = new JPanel();
		JButton botaoatualizar = new JButton("Deletar");
	    painelbotao.setLayout(new BorderLayout());
	    painelbotao.add(botaoatualizar, BorderLayout.SOUTH);
	    paineldeletar.add(painelbotao);
	    
		paineldeletar.setVisible(false);
		
		return paineldeletar;
	}
	
	public JLabel criarTexto(String nome) {
		
		JLabel texto = new JLabel(nome);
		
		return texto;
	}
	
}
