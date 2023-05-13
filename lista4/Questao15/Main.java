package Questao15;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do produto: ");
        String nome = scanner.next();
        System.out.println("Informe o preço de custo do produto: ");
        double precocusto = scanner.nextDouble();
        System.out.println("Informe o preço de venda do produto: ");
        double precovenda = scanner.nextDouble();
        System.out.println("Informe as despesas da empresa: ");
        double despesas = scanner.nextDouble();
		
		
		Produto produto = new Produto(nome, precocusto, precovenda, despesas);
		produto.imprimirDados();
		
		
		
	}
}
