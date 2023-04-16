package lista3;

public class Questao12 {

	public static void main(String[] args) {
		int num=7;
		int resultado= verificaprimo(num);
		if(resultado == 1) {
			System.out.println(num+ " É primo ! ");
		}
		else {
			System.out.println(num+ " Não é primo ! ");
		}
	}
	public static int verificaprimo(int num) {
		int cont = 0;
		for(int i=1;i<=num;i++) {
			if(num%i == 0) {
				cont++;
			}
		}
		if(cont == 2) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
