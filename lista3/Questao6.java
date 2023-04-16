package lista3;

public class Questao6 {

	public static void main(String[] args) {
	int[] vetnormal = {4,7,2,1,5};
	int[] resultado = crescente(vetnormal);
	for (int i = 0; i < resultado.length; i++) {
        System.out.print(resultado[i] + " ");
		}
	}
	public static int[] crescente(int[] vetnormal){
		
		for(int i=0;i<vetnormal.length-1;i++) {
			for(int j=0;j<vetnormal.length-i-1;j++) {
				if(vetnormal[j]>vetnormal[j+1]) {
					int aux = vetnormal[j];
					vetnormal[j]=vetnormal[j+1];
					vetnormal[j+1]=aux;
				}
			}
		}
		return vetnormal;
		}
	}

