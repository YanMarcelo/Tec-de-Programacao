package lista3;

import java.util.Arrays;

public class Questao13 {

	public static void main(String[] args) {
		int[] vet1= {2,5,4,7,5};
		int[] vet2= {2,4,5,6,7};
		int[] resultado=ocorrencias(vet1,vet2);
		System.out.println(Arrays.toString(resultado));
	}
	public static int[] ocorrencias(int[] vet1, int[] vet2) {
		int[] juntar=new int[vet1.length+vet2.length];
		
		int i = 0;
        for (int elem : vet1) {
            juntar[i++] = elem;
        }
        for (int elem : vet2) {
            juntar[i++] = elem;
        }    
        return juntar;
	}
}
