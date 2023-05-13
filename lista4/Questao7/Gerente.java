package Questao7;

public class Gerente extends Empregado {

	String departamento;
	
	public Gerente(String nome, float salario, String departamento) {
		super(nome, salario);
		this.departamento= departamento;
	
	}	

	public String toString() {
		return "Gerente: " + getNome() +  " - Salário: R$" + salario + " - Departamento: " + departamento;	
	}




}
