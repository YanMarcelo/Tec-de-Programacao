package lista3;

public class Questao3 {

	public static void main(String[] args) {
		double[] notas= {5,3,8};
		double[] pesos= {2,3,4};
		double resultado = mediaponderada(notas, pesos);
		System.out.println(resultado);

	}
	public static double mediaponderada(double[]notas, double[]pesos) {
	
		double somaponderadas=0;
		double somapesos=0;
		
	for(int i=0;i<notas.length;i++) {
		somaponderadas=somaponderadas+notas[i]*pesos[i];
		somapesos=somapesos+pesos[i];
	}
	return somaponderadas/somapesos;
	}
}
