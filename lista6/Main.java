package lista6;

public class Main {

	public static void main(String[] args) {
		
		//Alunos
		UsuariosClientes aluno = new Alunos("539742" ,"Yan Marcelo");
		UsuariosClientes aluno2 = new Alunos("534792", "Francisco Lairton");
		
		//Professores
		UsuariosClientes professor = new Professores("529512","Fischer");
		
		//Servidores
		UsuariosClientes servidor = new Servidores("573298","José");

		//Publicações
		Publicacoes livro = new Livros("Tecnicas de Programção", "2009", "Fischer", 10);
		Publicacoes livro2 = new Livros("Calculo II", "2010", "Rui", 10);
		Publicacoes artigo = new Artigos("Como programar em Java", "2010", "Fischer", 10);
		Publicacoes revista = new Revistas("Aprenda Java em um ano", "2015", "Fischer", 10);
		Publicacoes tcc = new TCCs("Os misterios do Java", "2007", "Fishcer", 10);
		Publicacoes tcc2 = new TCCs("Investigando a programação", "2005", "Fishcer", 18);

		//Biblioteca
		Biblioteca biblioTEC = new Biblioteca();
		Emprestimo e = new Emprestimo(aluno, tcc);
		Emprestimo e2 = new Emprestimo(aluno, tcc);
		Emprestimo e3 = new Emprestimo(aluno, tcc2);
		Emprestimo e4 = new Emprestimo(aluno, livro);
		Emprestimo e5 = new Emprestimo(aluno, livro2);
		Emprestimo e6 = new Emprestimo(aluno, tcc);
		
		//Adicionar clientes, publicações e emprestimos na biblioteca.
		biblioTEC.adicionarClientes(servidor);
		biblioTEC.adicionarClientes(professor);
		biblioTEC.adicionarClientes(aluno);
		biblioTEC.adicionarClientes(aluno2);
		
		biblioTEC.adicionarPublicacao(tcc);
		biblioTEC.adicionarPublicacao(tcc2);
		biblioTEC.adicionarPublicacao(revista);
		biblioTEC.adicionarPublicacao(artigo);
		biblioTEC.adicionarPublicacao(livro);
		biblioTEC.adicionarPublicacao(livro2);
		
		biblioTEC.adicionarEmprestimo(e);
		biblioTEC.adicionarEmprestimo(e2);
		biblioTEC.adicionarEmprestimo(e3);
		biblioTEC.adicionarEmprestimo(e4);
		biblioTEC.adicionarEmprestimo(e5);
		biblioTEC.adicionarEmprestimo(e6);
	
		//Dados dos emprestimos.
		e.dadosEmprestimo();
		e2.dadosEmprestimo();
		e3.dadosEmprestimo();
		e4.dadosEmprestimo();
		e5.dadosEmprestimo();
		System.out.println(biblioTEC.listaEmprestimos());
		
		//Buscas na biblioteca.
		biblioTEC.buscarCliente("539742");
		biblioTEC.buscarPublicacao("Calculo II");
		biblioTEC.buscarHistorico("Yan Marcelo");

		//Clientes cadastrados.
		biblioTEC.relatorioClientes();
		
		//Acervo da biblioteca.
		biblioTEC.acervoBibli();
	}

}
