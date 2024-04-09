package atividadeFilmes;

public class main {

	public static void main(String[] args) {
		
		classeFilme filme1 = new classeFilme();
		classeFilme filme2 = new classeFilme();
		classeFilme filme3 = new classeFilme();
		
		System.out.println("Filme 1:");
		
		filme1.setTitulo("Os vingadores");
		filme1.setDuracaoEmMinutos(142);
		
		System.out.println(filme1.getTitulo());
		System.out.println(filme1.getDuracaoEmMinutos());
		System.out.println(filme1.exibirDuracaoEmHoras());
		
		System.out.println("Filme 2:");
		
		filme2.setTitulo("Hotel Transilvânia");
		filme2.setDuracaoEmMinutos(93);
		
		System.out.println(filme2.getTitulo());
		System.out.println(filme2.getDuracaoEmMinutos());
		System.out.println(filme2.exibirDuracaoEmHoras());
		
		System.out.println("Filme 3:");
		
		filme3.setTitulo("Kung Fu Panda 4");
		filme3.setDuracaoEmMinutos(94);
		
		System.out.println(filme3.getTitulo());
		System.out.println(filme3.getDuracaoEmMinutos());
		System.out.println(filme3.exibirDuracaoEmHoras());
	}

}
