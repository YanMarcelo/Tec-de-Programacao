package lista2;
import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		Scanner lernum = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int usuario = lernum.nextInt();
		int contagem=usuario;
		int primo;
		int maiorprimo=0;
		
		while(contagem==usuario) {
			for(int num=2;num<usuario;num++) {
				if(num/1==num & num/num==1 ) {
					primo=num;
					System.out.println(""+primo);
					}
				contagem--;
				}
			}
		}
	}


		
	





