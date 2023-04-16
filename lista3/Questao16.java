package lista3;

public class Questao16 {

	public static void main(String[] args) {
		int num= 7;
		boolean resultado= verificaprimo(num);
		System.out.println(resultado);
	}
	public static boolean verificaprimo(int num) {
		int cont = 0;
		for(int i=1;i<=num;i++) {
			if(num%i == 0) {
				cont++;
			}
		}
		if(cont == 2) {
			return true;
		}
		else {
			return false;
		}
	}
}
