package lista2;
import java.util.Scanner;

public class Questão2 {

	public static void main(String[] args) {
		Scanner lernum = new Scanner(System.in);
		int soma=0;
		int repeticoes=0;
		int numero=0;
		
		while(repeticoes<5) {
			System.out.println("Digite um número: ");
			numero = lernum.nextInt();
				
			
			if(numero<0) {
				repeticoes=5;
				System.out.println("Número inválido");
			}
			else {
				soma=soma+numero;
			}
			repeticoes++;
		}
			System.out.println("A soma é: " +soma);
	}
}


	
	
