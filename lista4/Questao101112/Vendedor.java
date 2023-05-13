package Questao101112;

public class Vendedor extends Empregado{

	private double valorVendas;
	private double comissao;
	
	public Vendedor(String nome, String cpf, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
		super(nome, cpf, codigoSetor, salarioBase, imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	
	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double calcularSalarioVendedor() {
		double salario = super.calcularSalario();
		double salariovendedor = salario + (valorVendas * (comissao/100));
	    return salariovendedor;
	}
	
	public String toStringVendedor() {
		return "\nNome: " + getNome() + 
			   "\nCPF: " +getCpf() +
			   "\nCódigo Setor: " + getCodigoSetor() +
		       "\nSalário Base: R$" + getSalarioBase() +
			   "\nImposto: " + getImposto() +"%" +
			   "\nSalário com imposto: R$" + super.calcularSalario() + 
			   "\nComissão: " + comissao + "%" +
			   "\nValor de vendas: "+ valorVendas + 
			   "\nSalário vendedor com comissão p/ produção: R$" + calcularSalarioVendedor();
	}
}
