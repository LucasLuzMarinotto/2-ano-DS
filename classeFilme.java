package atividadeFilmes;

public class classeFilme {
	private String titulo;
	private double duracaoEmMinutos;
	private double duracaoEmHoras;
	
	double exibirDuracaoEmHoras() {
		duracaoEmHoras = duracaoEmMinutos / 60;
		return duracaoEmHoras;
	}
	
	void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	String getTitulo() {
		return this.titulo;
	}
	
	void setDuracaoEmMinutos(double duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}
	
	double getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}
}
