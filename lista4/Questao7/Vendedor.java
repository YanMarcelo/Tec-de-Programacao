package Questao7;

public class Vendedor extends Empregado{

	private float percentComissao;
	
	public Vendedor(String nome, float salario, float percentComissao) {
		super(nome, salario);
		this.percentComissao = percentComissao;
	}

	public float calcularSalario() {
	
		percentComissao= percentComissao/100;
		salario+= (percentComissao * salario);
		return salario;
	}
	
	public String toString() {
		return "Vendedor: " + getNome() + " - Salário sem comissão: R$" + salario + " - Salário com comissão: R$" + calcularSalario() ;
	}
}
