package Questao5;

import java.util.List;
import java.util.ArrayList;

public class Agenda {

	private String nomeagenda;
	private String descricao;
	private List<Contato> contatos;
	
	public Agenda(String nomeagenda, String descricao) {
		
		this.nomeagenda = nomeagenda;
		this.descricao = descricao;
		contatos = new ArrayList<>();
	}
	
	public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void imprimirContatos() {
        for (Contato contato : contatos) {
            contato.imprimirContato();
        }
    }
}