package Questao8;

public class ContaCorrente {
	
	private String Nome;
	private int CPF;
	protected double Valor;
	
	public ContaCorrente (String nome, int cpf, double valor) {
		
		this.CPF = cpf;
		this.Valor = valor;
		this.Nome = nome;
		
	}
	
	public String Sacar (double saque) {
		if(saque <= this.Valor) {
		Valor -= saque;
			return "Saque: R$" + saque + "\nSaldo atual: R$" + this.Valor + "\n";
		}else {
			return "\n-- [SALDO INDISPONIVEL] --\n";
		}
	}
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public int getCpf() {
		return CPF;
	}

	public void setCpf(int cpf) {
		this.CPF = cpf;
	}

	public double getValor() {
		return Valor;
	}

	public void setValor(double valor) {
		this.Valor = valor;
	}

}

