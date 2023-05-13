package Questao9;

public class Quadrado extends Forma{

double lado;


public Quadrado(double lado) {
	this.lado = lado;
}

public void calcularArea() {
	
	double area;	
	area=lado*lado;
	System.out.println("Area do Quadrado: " + area + "\n");	
	}

public void imprimirNome() {
	System.out.println("Quadrado");
}

}
