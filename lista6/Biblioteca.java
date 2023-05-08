package lista6;

import java.util.ArrayList;

public class Biblioteca {

	ArrayList<Emprestimo> listaemprestimo;
	ArrayList<UsuariosClientes> listaclientes;
	ArrayList<Publicacoes> listapublicacoes;

	public Biblioteca() {
		listaemprestimo = new ArrayList<Emprestimo>();
		listaclientes = new ArrayList<UsuariosClientes>();
		listapublicacoes = new ArrayList<Publicacoes>();
	}
	
	public void adicionarEmprestimo(Emprestimo E) {
		listaemprestimo.add(E);
		computarTPS(E);
	}
	
	public void adicionarPublicacao(Publicacoes P) {
		listapublicacoes.add(P);
	}
	
	public void adicionarClientes(UsuariosClientes C) {
		listaclientes.add(C);
	}
	
	public String listaEmprestimos() {
	
		int totalLivros = 0;
		int totalTCCS = 0;
		int totalArtigos = 0;
		int totalRevistas = 0;
		String relatorio = "";
		
		System.out.println("\n----------------------[Relatório de Emprestimos]----------------------");
		
		for(Emprestimo emprestimo : listaemprestimo) {
			
			if(emprestimo.publicacoes.tipo=="Livro: ") {
				totalLivros++;
			}
			if(emprestimo.publicacoes.tipo=="Revista: ") {
				totalRevistas++;
			}
			if(emprestimo.publicacoes.tipo=="Artigo: ") {
				totalArtigos++;
			}
			if(emprestimo.publicacoes.tipo=="TCCS: ") {
				totalTCCS++;;
			}
		}
		
		relatorio+= " \nLivro: "+ "Total: "+ totalLivros+" - Aluno: ";
		for(Emprestimo emprestimo : listaemprestimo) {
			if(emprestimo.publicacoes.tipo=="Livro: " && emprestimo.clientes.cargo=="Aluno: ") {
				relatorio+= emprestimo.clientes.nome+"; ";
			}
		}
		relatorio+= "- Professor: ";
		for(Emprestimo emprestimo : listaemprestimo) {
			if(emprestimo.publicacoes.tipo=="Livro: " && emprestimo.clientes.cargo=="Professor: ") {
				relatorio+= emprestimo.clientes.nome+"; ";
			}
		}
		relatorio+= "- Servidor: ";
		for(Emprestimo emprestimo : listaemprestimo) {
			if(emprestimo.publicacoes.tipo=="Livro: " && emprestimo.clientes.cargo=="Servidor: ") {
				relatorio+= emprestimo.clientes.nome+"; ";
			}
		}
		
		relatorio+= "\nArtigo: "+ "Total: "+ totalArtigos+ " - Aluno: ";
		for(Emprestimo emprestimo : listaemprestimo) {
			if(emprestimo.publicacoes.tipo=="Artigo: " && emprestimo.clientes.cargo=="Aluno: ") {
				relatorio+= emprestimo.clientes.nome+"; ";
			}
		}
		relatorio+="- Professor: ";
		for(Emprestimo emprestimo : listaemprestimo) {
			if(emprestimo.publicacoes.tipo=="Artigo: " && emprestimo.clientes.cargo=="Professor: ") {
				relatorio+= emprestimo.clientes.nome+"; ";
			}
		}
		relatorio+="- Servidor: ";
		for(Emprestimo emprestimo : listaemprestimo) {
			if(emprestimo.publicacoes.tipo=="Artigo: " && emprestimo.clientes.cargo=="Servidor: ") {
				relatorio+= emprestimo.clientes.nome+"; ";
			}
		}
		
		relatorio+= "\nRevista: "+ "Total: "+ totalRevistas+" "+"- Aluno: ";
		for(Emprestimo emprestimo : listaemprestimo) {
			if(emprestimo.publicacoes.tipo=="Revista: " && emprestimo.clientes.cargo=="Aluno: ") {
				relatorio+= emprestimo.clientes.nome+"; ";
			}
		}
		relatorio+="- Professor: ";
		for(Emprestimo emprestimo : listaemprestimo) {
			if(emprestimo.publicacoes.tipo=="Revista: " && emprestimo.clientes.cargo=="Professor: ") {
				relatorio+= emprestimo.clientes.nome+"; ";
			}
		}
		relatorio+="- Servidor: ";
		for(Emprestimo emprestimo : listaemprestimo) {
			if(emprestimo.publicacoes.tipo=="Revista: " && emprestimo.clientes.cargo=="Servidor: ") {
				relatorio+= emprestimo.clientes.nome+"; ";
			}
		}
		
		relatorio+= " \nTCC: "+ "Total: "+ totalTCCS+" "+" - Aluno: ";
		for(Emprestimo emprestimo : listaemprestimo) {
			if(emprestimo.publicacoes.tipo=="TCCS: " && emprestimo.clientes.cargo=="Aluno: ") {
				relatorio+= emprestimo.clientes.nome+"; ";
			}
		}
		relatorio+="- Professor: ";
		for(Emprestimo emprestimo : listaemprestimo) {
			if(emprestimo.publicacoes.tipo=="TCCS: " && emprestimo.clientes.cargo=="Professor: ") {
				relatorio+= emprestimo.clientes.nome+"; ";
			}
		}
		
		relatorio+="- Servidor: ";
		for(Emprestimo emprestimo : listaemprestimo) {
			if(emprestimo.publicacoes.tipo=="TCCS: " && emprestimo.clientes.cargo=="Servidor: ") {
				relatorio+= emprestimo.clientes.nome +"; ";
			}
		}
		return relatorio + "\n" + "\n----------------------------------------------------------------------";
	}
	
		
	public void buscarCliente(String matricula) {
		String resultadobusca="";
		String cliente ="";
		System.out.println("\n--------[Resultado da Busca de Aluno]--------------");
		for(Emprestimo emprestimo : listaemprestimo) {
			if(emprestimo.clientes.matricula==matricula) {
					cliente=emprestimo.clientes.nome;
					resultadobusca+= emprestimo.publicacoes.tipo + emprestimo.publicacoes.titulo + " ; " +emprestimo.publicacoes.autor + " ; " +"\n";
				}
			}
		System.out.println("\n"+cliente+":"+" \n"+resultadobusca);
		System.out.println("----------------------------------------------------");
	}
	
	public void buscarHistorico(String nome) {
		String resultadobusca="";
		System.out.println("-----------------[Historico de emprestimos do "+ nome +"]------------------------");
		for(Emprestimo emprestimo : listaemprestimo) {
			if(emprestimo.clientes.nome==nome) {
					resultadobusca+=emprestimo.publicacoes.tipo + emprestimo.publicacoes.titulo + " ; " +emprestimo.publicacoes.autor + " ; " +"\n";
				}
			}
	System.out.println("\n"+resultadobusca);
		System.out.println("---------------------------------------------------------------------------------");
	}
	
	public void computarTPS(Emprestimo emprestimo) {
		
			if(emprestimo.clientes.cargo == "Professor: ") {
			emprestimo.clientes.tps+=25;
			}
			
			if(emprestimo.clientes.cargo == "Servidor: ") {
			emprestimo.clientes.tps+=15;
			}
			
			if(emprestimo.clientes.cargo == "Aluno: ") {
			emprestimo.clientes.tps+=10*emprestimo.publicacoes.darDesconto();
			}
			if(emprestimo.clientes.tps>50) {
				System.out.println("O cliente deve devolver uma publicação.");
			}
		}
	
	public void acervoBibli() {
	
		int listagem = 1;
		System.out.println("\n------------------[Acervo]----------------------\n");
		
		System.out.println("TCCS: ");
		for(Publicacoes publicacoes : listapublicacoes) {
			if(publicacoes.tipo =="TCCS: ") {
				System.out.println(listagem++ + ". " +publicacoes.titulo + "; " + publicacoes.anopublicacao + "; " +publicacoes.autor + "; " +publicacoes.quantidadepublicacao);
			}
		}
		
		listagem=1;
		System.out.println("\nLivros: ");
		for(Publicacoes publicacoes : listapublicacoes) {
			if(publicacoes.tipo =="Livro: ") {
				System.out.println(listagem++ + ". " +publicacoes.titulo + "; " + publicacoes.anopublicacao + "; " +publicacoes.autor + "; " +publicacoes.quantidadepublicacao);
				}
			}
		
		listagem=1;
		System.out.println("\nArtigos: ");
		for(Publicacoes publicacoes : listapublicacoes) {
			if(publicacoes.tipo =="Artigo: ") {
				System.out.println(listagem++ + ". " +publicacoes.titulo + "; " + publicacoes.anopublicacao + "; " +publicacoes.autor + "; " +publicacoes.quantidadepublicacao);
				}
			}
		
		listagem=1;
		System.out.println("\nRevistas: ");
		for(Publicacoes publicacoes : listapublicacoes) {
			if(publicacoes.tipo =="Revista: ") {
				System.out.println(listagem++ + ". " +publicacoes.titulo + "; " + publicacoes.anopublicacao + "; " +publicacoes.autor + "; " +publicacoes.quantidadepublicacao);
				}
			}
		
		System.out.println("\n----------------------------------------------\n");
	}
	
	public void relatorioClientes() {
		System.out.println("\n------------[Clientes cadrastados]--------------");

		System.out.println("\nAlunos: ");
		for(UsuariosClientes clientes : listaclientes) {
			if(clientes.cargo == "Aluno: ") {
				System.out.println(clientes.matricula+ " - " + clientes.nome + " - TPS: " + clientes.tps);
			}
		}
		
		System.out.println("\nServidores: ");
		for(UsuariosClientes clientes : listaclientes) {
			if(clientes.cargo == "Servidor: ") {
				System.out.println(clientes.matricula+ " - " + clientes.nome + " - TPS: " + clientes.tps);
			}
		}
		
		System.out.println("\nProfessores: ");
		for(UsuariosClientes clientes : listaclientes) {
			if(clientes.cargo == "Professor: ") {
				System.out.println(clientes.matricula+ " - " + clientes.nome + " - TPS: " + clientes.tps);
			}
		}
		
		System.out.println("\n------------------------------------------------");
		}
	
	public void buscarPublicacao(String publicacao) {
		System.out.println("\n-------------[Resultado da Busca de Publicações]---------------\n");
		for(Publicacoes publicaceos : listapublicacoes) {
			if(publicacao == publicaceos.titulo) {
				System.out.println(publicaceos.tipo + publicacao +" - "+ publicaceos.autor + " - " + publicaceos.anopublicacao + " - " + publicaceos.quantidadepublicacao);
			}
		}
		System.out.println("\n----------------------------------------------------------------\n");
		}
	}