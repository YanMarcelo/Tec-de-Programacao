package Questao6;

public class Ingresso {

	double valor;
	
	
	public Ingresso(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String toString() {
		return "Ingresso - Valor: R$" + valor;
	}
	

}
