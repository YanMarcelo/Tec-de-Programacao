package Questao101112;

public class Empregado extends Pessoa{

	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado(String nome, String cpf, int codigoSetor, double salarioBase, double imposto) {
		super(nome, cpf);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double calcularSalario() {
		
		double salarioLiquido = 0;
		salarioLiquido = salarioBase - ((imposto/100) * salarioBase);
		return salarioLiquido;
	}
	
	public String toString() {
      return "Nome: " + getNome() + "\nCPF: " +getCpf() +"\nCódigo Setor: " + codigoSetor + "\nSalário Base: R$" + salarioBase +"\nSalário líquido: R$" + calcularSalario() + "\nImposto: " + imposto +"%"+"\n";
	}
}
