package Questao14;

public class Main {

	public static void main(String[] args) {

		Pessoa pessoaA = new Pessoa(14, 03, 1879, "Albert Einstein");
		pessoaA.informaNome();
		pessoaA.calculdaIdade(29, 12, 2023);
		pessoaA.informaIdade();
		
		Pessoa pessoaI = new Pessoa (4,01,1643, "Isaac Newton");
		pessoaI.informaNome();
		pessoaI.calculdaIdade(29, 12, 2023);
		pessoaI.informaIdade();
	}

}
