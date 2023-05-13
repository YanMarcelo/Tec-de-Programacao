package Questao14;

public class Pessoa {

	private int idade;
	private int dianascimento;
	private int mesnascimento;
	private int anonascimento;
	private String nome;
	
	public Pessoa(int dia, int mes, int ano, String nome) {
	
		this.dianascimento = dia;
		this.mesnascimento = mes;
		this.anonascimento = ano;
		this.nome = nome;
	}
	
	public int calculdaIdade(int diaatual, int mesatual, int anoatual) {
		this.idade = anoatual-anonascimento;
		return this.idade;
	}
	
	public void informaIdade() {
		System.out.println("Idade atual: " + this.idade + " anos\n");
	}
	
	public void informaNome() {
		System.out.println("Nome: " + nome);
	}
	
	public void ajustaDataDeNascimento(int dia, int mes, int ano) {
		
		this.dianascimento = dia;
		this.mesnascimento = mes;
		this.anonascimento = ano;
	}		

}
