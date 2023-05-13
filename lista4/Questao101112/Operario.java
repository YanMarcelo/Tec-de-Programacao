package Questao101112;

public class Operario extends Empregado{

	private double valorProducao;
	private double comissao;
	
	
	public Operario(String nome, String cpf, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
		super(nome, cpf, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	
	public double getValorProducao() {
		return valorProducao;
	}


	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}


	public double getComissao() {
		return comissao;
	}


	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double calcularSalarioOperario() {
	    double salario = super.calcularSalario();
	    double salariooperario = salario + (valorProducao * comissao)/100;
	    return salariooperario;
	}

	
	public String toStringOperario() {
		return "Nome: " + getNome() + 
			   "\nCPF: " +getCpf() +
			   "\nCódigo Setor: " + getCodigoSetor() +
			   "\nSalário Base: R$" + getSalarioBase() +
			   "\nImposto: " + (getImposto()) +"%" +
			   "\nSalário com imposto: R$" + super.calcularSalario() + 
			   "\nComissão: " + comissao + "%" +
			   "\nValor de produção: "+ valorProducao + 
			   "\nSalário operário com comissão p/ produção: R$" + calcularSalarioOperario();
	}
}
