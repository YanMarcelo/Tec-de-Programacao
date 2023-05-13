package Questao17;

//Classe
public class Tabuleiro {

	//Encapsulamento
	private String[][] plano = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
	
	//Construto
	public Tabuleiro() {
		exibirPlanoTabuleiro();
	}
	//Get
	public String[][] getPlano() {
		return plano;
	}
	//Set
	public void setPlano(String[][] plano) {
		this.plano = plano;
	}

	public void exibirPlanoTabuleiro() {
	
	System.out.println(" \n " + plano[0][0] + " | " + plano[0][1] + " | " + plano[0][2]);
    System.out.println("-----------");
    System.out.println(" " + plano[1][0] + " | " + plano[1][1] + " | " + plano[1][2]);
    System.out.println("-----------");
    System.out.println(" " + plano[2][0] + " | " + plano[2][1] + " | " + plano[2][2]);
	}
	
	
}
