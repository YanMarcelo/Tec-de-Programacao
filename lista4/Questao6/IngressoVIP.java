package Questao6;

public class IngressoVIP extends Ingresso {

	private double valoradicional;
	
	public IngressoVIP(double valor, double valoradicional) {
		super(valor);
		this.valoradicional = valoradicional;
	}

	public String toString() {
	
		return "IngressoVIP - Valor: R$" + (valor+valoradicional);
	}
}
