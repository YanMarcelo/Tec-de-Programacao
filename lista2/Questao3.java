package lista2;
import java.util.Scanner;

public class Questão3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lernum = new Scanner(System.in);
		int numerousuario;
		int numerosorteado=0;
		 
		while(numerosorteado!=37) {
			System.out.println("Digite um número de 1 a 100: ");
			numerousuario = lernum.nextInt();
			
			if(numerousuario<37) {
				System.out.println("O número é maior !");
			}
			if(numerousuario>37) {
				System.out.println("O número é menor !");
			}
			if(numerousuario==37) {	
				numerosorteado=numerousuario;
				System.out.println("Você acertou !");
			}
		}
	}
}
