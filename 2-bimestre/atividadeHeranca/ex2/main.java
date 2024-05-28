package questao1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		boolean decisao = false;
		String resposta;
		
		livro livro1 = new livro();
		revista revista1 = new revista();
		
		livro1.setTitulo("O Pequeno Príncipe");
		livro1.setAutor("Antoine de Saint-Exupéry");
		livro1.setAnoPublicacao(1943);
		livro1.setNumeroPaginas(96);
		livro1.setEditora("Harper Collins Brasil");
		
		revista1.setTitulo("Veja");
		revista1.setAutor("Roberto Civita");
		revista1.setAnoPublicacao(2024);
		revista1.setMesPublicacao("Janeiro");
		revista1.setNumeroEdicao(134);
		
		System.out.println("Você deseja ver os detalhes da revista Veja?");
		resposta = in.next();
		
		if(resposta.equalsIgnoreCase("Sim")) {
			
		}
	in.close();
	}

}
