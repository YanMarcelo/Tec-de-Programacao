package lista3;

public class Questao5 {

	public static void main(String[] args) {
	int[] normal= {2,4,5,6,7};
	int[] resultado = copiar(normal);
	for (int i = 0; i < resultado.length; i++) {
        System.out.print(resultado[i] + " ");
		}
	}
	public static int[] copiar(int[] normal) {
	int[] copiavetor = new int [normal.length];
	for(int i=0;i<normal.length;i++) {
		copiavetor [i] = normal [i];
	}
		return copiavetor;	
	}
}
	