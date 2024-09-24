package atividade;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		conteudo[] catalogo = new conteudo[10];
		
		catalogo[0] = new serie ("Supernatural", "Ação/Terror", "40 minutos", 327, 15, 2005);
		catalogo[1] = new serie ("Breaking bad", "Drama/Crime", "47 minutos", 62, 5, 2008);
		catalogo[2] = new serie ("Stranger Things", "Terror", "50 minutos", 34, 4, 2016);
		catalogo[3] = new serie ("The Crown", "Drama", "58 minutos", 60, 6, 2016);
		catalogo[4] = new serie ("Alice in Borderland", "Ação/Suspense", "45 minutos", 16, 2, 2020);
		
		catalogo[5] = new filme ("Kung Fu Panda 2", "Infantil/Comédia", "1h 32m", 2011);
		catalogo[6] = new filme ("O Rei Leão", "Infantil/Músical", "1h 28m", 1994);
		catalogo[7] = new filme ("Interestelar", "Ficção Científica", "2h 49m", 2014);
		catalogo[8] = new filme ("Carros", "Comédia", "1h 57m", 2006);
		catalogo[9] = new filme ("A Hora do Rush", "Ação/Comédia", "1h 38m", 1998);
		
		for(conteudo conteudo1 : catalogo) {
			System.out.println(conteudo1.descricao()); 
			System.out.println();
		}
	}

}
