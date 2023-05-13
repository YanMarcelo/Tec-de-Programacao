package Questao13;

public class Main {

	public static void main(String[] args) {

	ControleRemoto remoto = new ControleRemoto(17, 5, false);
		
		remoto.OnouOff();
		remoto.aumentarVolume();
		remoto.diminuirVolume();
		remoto.aumentarCanal();
		remoto.diminuirCanal();
		remoto.trocarCanal(6);
		remoto.clicarMudar(10);
		remoto.Televisão();
		remoto.Mutar();
		
	}

}
