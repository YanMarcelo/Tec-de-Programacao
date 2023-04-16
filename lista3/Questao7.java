package lista3;

public class Questao7 {

	public static void main(String[] args) {
		int[] vetnormal = {2,5,3,6,4};
		boolean resultado = crescente(vetnormal);
		System.out.println(resultado);
	}

	public static boolean crescente(int[] vetnormal){
		boolean trocou=true;
		while(trocou) {
			trocou=false;
			for(int i = 0; i < vetnormal.length - 1; i++) {
				for(int j = 0; j < vetnormal.length - i - 1; j++) {
					if(vetnormal[j] > vetnormal[j+1]) {
						int aux = vetnormal[j];
						vetnormal[j] = vetnormal[j+1];
						vetnormal[j+1] = aux;
						trocou=true;
					}
				}
			}
		}	
	return true;
	}
}