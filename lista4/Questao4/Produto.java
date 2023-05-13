package Questao4;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;
	
	public Produto(String nome, int quantidade, double preco) {
		
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
	}
	
	public boolean comprarProduto() {

		if (quantidade <= 0) {
	        System.out.println("Não foi possível efetuar a compra\n");
	        return false;
	    } else if(quantidade>0) {
            System.out.println("Compra efetuada\n");
	        return true;
	    } 
	    else
	    	return false;
		
	}
	
	public double valorProduto() {
		return this.quantidade*this.preco;
	}
	
	public double aplicarDesconto() {
		double desconto = 0.0;
		if(this.preco<=100) {
			desconto=0.0;
			System.out.println("Não há desconto\n");
		}
		else if (this.preco >= 100 && this.preco <= 200) {
			desconto = 0.1;
			this.preco = this.preco - this.preco * desconto;
		}
		if (this.preco >= 200 && this.preco <= 500) {
			desconto = 0.2;
			this.preco = this.preco - this.preco * desconto;
		}
		if (this.preco > 500) {
			desconto = 0.25;
			this.preco = this.preco - this.preco * desconto;
		}
		return desconto;
	}

	public String toString() {
		return "Produto: " + nome + 
				"\nQuantidade: " + quantidade +
				"\nValor unitário: R$" + preco +
				"\nValor total: R$" + valorProduto() + 
				"\nValor do desconto: "+ (aplicarDesconto()*100) + "% \n" +
				"Valor total com desconto: R$" +(preco * quantidade) +"\n";
	}
}
