package Questao15;

public class Produto {

private String nome;
private double precocusto;
private double precovenda;
private double margemlucro;
private double despesas;

public Produto(String nome, double precocusto, double precovenda, double despesas) {
	this.nome = nome;
	this.precocusto = precocusto;
	this.precovenda = precovenda;
	this.despesas = despesas;
}

public double calcularMargemLucros() {
	
	margemlucro=((precovenda-(precocusto-despesas))/precovenda)*100;
	
	return margemlucro;
}

public void imprimirDados() {
    System.out.printf("\nProduto: %s\nPreço de custo: %.2f\nPreço de venda: %.2f\nDespesas: %.2f\nMargem de lucro: %.2f%%\n", nome, precocusto, precovenda, despesas, calcularMargemLucros());
}


}
