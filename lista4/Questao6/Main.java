package Questao6;

public class Main {
	
	public static void main(String[] args) {
	
	Ingresso ingresso1 = new Ingresso(200.0);
	Ingresso ingresso2 = new IngressoVIP(100.0, 200.0);
	Ingresso ingresso3 = new Ingresso(150.0);
	Ingresso ingresso4 = new IngressoVIP(120.0, 180.0);
	
	Evento evento = new Evento();
    evento.adicionarIngresso(ingresso1);
    evento.adicionarIngresso(ingresso2);
    evento.adicionarIngresso(ingresso3);
    evento.adicionarIngresso(ingresso4);

    
    evento.venderIngresso(ingresso2);
    evento.venderIngresso(ingresso1);
    evento.venderIngresso(ingresso3);
    
    
    evento.ingressosRestante();
    evento.computarIngressosVendidos();
	
	}
}
