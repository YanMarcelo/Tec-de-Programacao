package Questao3;

public class Main {

	public static void main(String[] args) {

		Fatura fatura = new Fatura(1010103,"Mesa", 15, 800, 0);
		
		System.out.println("Número do item na promoção: " + fatura.getNumerodoitem());
		System.out.println("Descricação do item: "+ fatura.getDescricaçaodoitem());
		System.out.println("Quantidade: " + fatura.getQuantidadedeitem()); 
		System.out.println("Valor unitário: " +fatura.getPrecounitario() );
		System.out.println("Valor total: " + "R$" + fatura.ValorFatura());
		fatura.aplicarDesconto(35);
		

	}

}
