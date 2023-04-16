package lista3;

public class Questao11 {

	public static void main(String[] args) {
	int base= 4;
	int expoente= 3;
	int resultado= potencia(base,expoente);
	System.out.println(base + " elevado a " + expoente + " = " +resultado);
	}
	
	public static int potencia(int base,int expoente) {
		return (int) Math.pow(base,expoente);
	}
}
