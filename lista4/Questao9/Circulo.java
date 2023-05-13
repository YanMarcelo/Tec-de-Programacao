package Questao9;

public class Circulo extends Forma{

double raio;

public Circulo(double raio) {
		this.raio = raio;
	}

public void calcularArea() {
		
	double area;
	area=((raio*raio)*3.14);
	System.out.println("Area do Círculo: " + area + "\n");
	}

public void imprimirNome() {
	System.out.println("Círculo");
}











}
