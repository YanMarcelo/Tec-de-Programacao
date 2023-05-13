package Questao3;

public class Fatura {
	
	private int numerodoitem;
	private String descricaçaodoitem;
	private int quantidadedeitem;
	private double precounitario;
	private double precototal;
	
	public Fatura(int numerodoitem, String descricaçaodoitem, int quantidadedeitem, int precounitario, int precototal) {
		this.numerodoitem = numerodoitem;
		this.descricaçaodoitem = descricaçaodoitem;
		this.quantidadedeitem = quantidadedeitem;
		this.precounitario = precounitario;
		this.precototal = precototal;
	}

	public int getNumerodoitem() {
		return numerodoitem;
	}

	public void setNumerodoitem(int numerodoitem) {
		this.numerodoitem = numerodoitem;
	}

	public String getDescricaçaodoitem() {
		return descricaçaodoitem;
	}

	public void setDescricaçaodoitem(String descricaçaodoitem) {
		this.descricaçaodoitem = descricaçaodoitem;
	}

	public int getQuantidadedeitem() {
		return quantidadedeitem;
	}

	public void setQuantidadedeitem(int quantidadedeitem) {
		if(quantidadedeitem<0) {
			this.quantidadedeitem = 0;
		}
		else {
			this.quantidadedeitem = quantidadedeitem;
		}
	}

	public double getPrecounitario() {
		return precounitario;
	}

	public void setPrecounitario(int precounitario) {
		if(precounitario<0) {
			this.precounitario = 0;
		}
		else {
			this.precounitario = precounitario;
		}
	}

	public double getPrecototal() {
		return precototal;
	}

	public void setPrecototal(int precototal) {
		this.precototal = precototal;
	}

	public double ValorFatura() {
		return this.precounitario*this.quantidadedeitem;
		
	}

	public void aplicarDesconto(double percentualDesconto) {
        double desconto = (percentualDesconto / 100) * ValorFatura();
        double valorFinal = ValorFatura() - desconto;
        System.out.println("Valor da fatura com desconto de " + percentualDesconto + "%: R$" + valorFinal);
    }

}
	
	
	

