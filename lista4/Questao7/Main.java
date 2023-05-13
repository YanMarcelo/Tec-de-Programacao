package Questao7;

public class Main {

	public static void main(String[] args) {

		Empregado empregado = new Empregado("Yan Marcelo ", 1550);
		System.out.println(empregado);
		
		Gerente gerente = new Gerente("Laisa Mireli", 2000, "01");
		System.out.println(gerente);
		
		Vendedor vendedor = new Vendedor("Vlaudisguedison", 1200, 10);
		System.out.println(vendedor);
	}

}
