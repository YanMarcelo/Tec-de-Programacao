package lista3;
import java.util.Arrays;
import java.util.Scanner;

public class Questao9 {

	public static void main(String[] args) {
		 Scanner lernum = new Scanner(System.in);
	        System.out.println("Digite o k-ésimo menor valor º: ");
	        int k= lernum.nextInt();
	        
	        int[] vet= {3,5,7,2,4};
	        int resultado= kesimomenor(vet,k);
	        System.out.print(resultado);
	                
	    }
	    public static int kesimomenor(int []vet, int k) {
	        Arrays.sort(vet);
	    
	        return vet[k-1];
	}

}
