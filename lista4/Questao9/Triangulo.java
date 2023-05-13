package Questao9;

public class Triangulo extends Forma{

double base;
double altura;


public Triangulo(double base, double altura) {
	this.base = base;
	this.altura = altura;
}

public void calcularArea() {
		
	double area;
	area= (base*altura)/2;
	System.out.println("Area do Triângulo: " + area + "\n");
	}

public void imprimirNome() {
	System.out.println("Triângulo"); 
}

}
