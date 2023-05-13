package Questao8;

public class ContaEspecial extends ContaCorrente{
	
private double limite;
	
	public ContaEspecial(String nome, int cpf, double valor, double limite) {
		super(nome, cpf, valor);
		this.limite = limite;
	}
	
	public String Sacar (double saque) {
		if(saque <= this.Valor) {
			Valor -= saque;
			return "Saque: R$" + saque + "\nSaldo atual: R$" + this.Valor  + "\n";
			
		}else if (saque <= (this.getValor() + this.limite)){
			limite = (Valor + limite) - saque;
			Valor -= saque;
			return "Saque: R$" + saque + "Saldo atual: R$" + this.Valor  + "\n";
			
		}
		
		else {
			return "\n-- [SALDO INDISPONIVEL] --\n";
		}
	
	

	}
	
}
