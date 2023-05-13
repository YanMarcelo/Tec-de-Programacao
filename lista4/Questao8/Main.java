package Questao8;

public class Main {

	public static void main(String[] args) {

		ContaCorrente corrente = new ContaCorrente ("Yan", 444, 2000);
		ContaEspecial especial = new ContaEspecial("Jose", 555, 2500, 1000);
		
		System.out.println(corrente.Sacar(1500)); 
		System.out.println(corrente.Sacar(2010)); 
		System.out.println(especial.Sacar(1500)); 
		System.out.println(especial.Sacar(4000)); 
	}

}


