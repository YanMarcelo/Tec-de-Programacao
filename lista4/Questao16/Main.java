package Questao16;

public class Main {

	public static void main(String[] args) {

		Elevador elevador = new Elevador();
		elevador.Inicializar(15,8);
		elevador.Subir();
		elevador.Subir();
		elevador.Entrar();
		elevador.Entrar();
		elevador.Descer();
		elevador.Sair();
		System.out.println(elevador.Imprimir());
	}

}
