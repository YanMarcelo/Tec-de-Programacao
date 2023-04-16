package lista3;

public class Questao4 {

	public static void main(String[] args) {
		int[] vet1= {3,3,8,3,5};
		int[] vet2= {2,3,4,3,3};
		int elemento=3;
		int resultado = contar(vet1, vet2,elemento);
		System.out.println("O elemento " + elemento + " apareceu " + resultado + " vezes nos vetores.");	
		
	}
	
	public static int contar(int[]vet1, int[]vet2, int elemento) {
		
		int contagem=0;
		for(int i=0;i<vet1.length;i++) {
			if(vet1[i]==elemento) {
				contagem++;
			}
		}
		for(int j=0;j<vet2.length;j++) {
			if(vet2[j]==elemento) {
				contagem++;
			}
		}
			return contagem;
		}
	}
