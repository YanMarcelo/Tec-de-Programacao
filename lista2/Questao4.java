package lista2;
import java.util.Scanner;

public class Questão4 {

	public static void main(String[] args) {
		Scanner lernum = new Scanner(System.in);
		
		int usuario;
		System.out.println("Digite um número: ");
		usuario = lernum.nextInt();

		int multiplic;
		int repeticoes=0;
		
		System.out.println("Sua tabela é: \n");
		
		while(repeticoes<10) {
			repeticoes++;
		
		multiplic= usuario*repeticoes;		
		System.out.println(  + usuario + " x " + repeticoes + " = " + multiplic );
		}
	}
}
	


