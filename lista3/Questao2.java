package lista3;

public class Questao2 {

	public static void main(String[] args) {
		double[] vet= {1,2,4,6,8};
		double[] vet2= {3,5,6,7,9};
		double resultado = media(vet, vet2);
		double media= resultado/(vet.length+vet2.length);
		System.out.println(media);

	}
	public static double media(double[]vet, double[]vet2) {
	
	double somar=0;	
		
	for(int i=0;i<vet.length;i++) {
		
		somar=somar+vet[i];	
	}	
	for(int j=0;j<vet2.length;j++){
		somar=somar+vet2[j];
	}
	return somar;
		
	}
}
