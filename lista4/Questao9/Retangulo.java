package Questao9;

public class Retangulo extends Forma {

double base;
double altura;

public Retangulo(double base, double altura) {
	this.base = base;
	this.altura = altura;
}

public void calcularArea() {
	double area;
	area= base*altura;
	System.out.println("Area do Retâgulo: " + area + "\n");
}

public void imprimirNome() {
	System.out.println("Retâgulo");
}

}
