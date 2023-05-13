package Questao6;

import java.util.List;
import java.util.ArrayList;

public class Evento {

	private List<Ingresso> ingressos;
	private List<Ingresso> ingressosVendidos;

	public Evento() {
	
		ingressos = new ArrayList<Ingresso>();
		ingressosVendidos = new ArrayList<Ingresso>();
	}
	
	public void adicionarIngresso(Ingresso ingresso) {
        ingressos.add(ingresso);
    }
	
	public void venderIngresso(Ingresso ingresso) {
		ingressos.remove(ingresso);
		ingressosVendidos.add(ingresso);
	}
	
	public double computarIngressosVendidos() {
	    double valorVendido = 0;
	    for (Ingresso ingresso : ingressosVendidos) {
	            valorVendido += ingresso.getValor();
	        }
	    System.out.println("-------------Valor total dos ingressos vendidos-------------\n R$" + valorVendido);
	    return valorVendido;
	}
	
	public void ingressosRestante() {
	    List<Ingresso> ingressosRestantes = new ArrayList<Ingresso>(this.ingressos);
	    ingressosRestantes.removeAll(ingressosVendidos);
	    if(ingressosRestantes.isEmpty()) {
	    	System.out.println("-------------Não há ingressos disponíveis.-------------\n");
	    	}
	    else {
		    System.out.println("-------------Ingressos disponíveis-------------------------\n");
	    	for (Ingresso ingresso : ingressosRestantes) {
	    		 System.out.println(ingresso+"\n");
	    	}
	       
	    }
	}
}
	
	

