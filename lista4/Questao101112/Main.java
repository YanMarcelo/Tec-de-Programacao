package Questao101112;

public class Main {

	public static void main(String[] args) {

		Empregado empregado = new Empregado("Yan Marcelo", "40028922", 1, 1800, 25);
		empregado.setSalarioBase(2000);
		empregado.setImposto(30);
		System.out.println(empregado.toString());
		
		Operario operario = new Operario("Laisa Mireli", "99922336", 2, 1800, 25, 1500, 20);
		System.out.println(operario.toStringOperario());
	
		Vendedor vendedor = new Vendedor("Glaudisbedson", "11122233", 3, 1800, 25, 1200, 25);
		System.out.println(vendedor.toStringVendedor());
	}
}
