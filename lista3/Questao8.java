package lista3;
import java.util.Arrays;
import java.util.Scanner;

public class Questao8 {

    public static void main(String[] args) {
        Scanner lernum = new Scanner(System.in);
        System.out.println("Digite o k-ésimo maior valor º: ");
        int k= lernum.nextInt();
        
        int[] vet= {3,5,7,2,4};
        int resultado= kesimo(vet,k);
        System.out.print(resultado);
                
    }
    public static int kesimo(int []vet, int k) {
        Arrays.sort(vet);
    
        return vet[vet.length-k];
    }
}
