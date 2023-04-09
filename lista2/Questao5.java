package lista2;
import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		Scanner lernum = new Scanner(System.in);
	
		System.out.println("Digite os limites da esquerda: ");
		int esquerda = lernum.nextInt();
		
		System.out.println("Digite os limites da direita: ");
		int direita = lernum.nextInt();
		
		System.out.println("Os números são: ");
		for(int e=0;e<=esquerda;e++) {
			for(int d=0;d<=direita;d++) {
				System.out.println(" "+e +"-" +d);
				}
			}
		}
	}

