package lista3;

public class Questao10 {

	public static void main(String[] args) {
		int[] vetnormal = {1,3,4,5,6};
		int[] vetcopia = {3,4,5,1,7};
		boolean resultado= verificar(vetnormal,vetcopia);
		if(resultado) {
			System.out.println("Os vetores são iguais.");
		}
		else {
			System.out.println("Os vetores são diferentes.");
		}
	}
	public static boolean verificar(int[]vetnormal, int[]vetcopia) {
		
		for(int i=0;i<vetnormal.length;i++) {
			if(vetnormal[i]!=vetcopia[i]) {
			return false;
			}
		}
	return true ;
	}
}