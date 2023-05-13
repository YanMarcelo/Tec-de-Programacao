package Questao9;

public class Main {

	public static void main(String[] args) {

		Forma formacirculo = new Circulo(3);
		formacirculo.imprimirNome();
		formacirculo.calcularArea();
	
		Forma formaquadrado = new Quadrado(7);
		formaquadrado.imprimirNome();
		formaquadrado.calcularArea();
	
		Forma formatrinagulo = new Triangulo(8,9);
		formatrinagulo.imprimirNome();
		formatrinagulo.calcularArea();
		
		Forma formaretangulo = new Retangulo(3,8);
		formaretangulo.imprimirNome();
		formaretangulo.calcularArea();
	
	}

}
