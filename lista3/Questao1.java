package lista3;


public class Questao1 {
	public static int somatorio(int []vetor) {
		
		int soma=0;
		for(int i=0;i<vetor.length;i++) {
			soma +=vetor[i];
		}
		return soma;
	} 
	public static void main(String[] args) {
		
		int[] vetor = {1, 2, 3, 4, 5, 6};
		int resultado = somatorio(vetor);
		System.out.println(resultado);
	}

}
