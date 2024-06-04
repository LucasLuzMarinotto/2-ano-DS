package q1;

public class publicacao {
	
	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	public void construtor(String titulo, String autor, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public String getTitulo() {
		return this.titulo;
	}
	public String getAutor() {
		return this.autor;
	}
	public int getAnoPublicacao() {
		return this.anoPublicacao;
	}
	public String exibirDetalhes() {
		return "Este é o livro: "+this.titulo
		+". Que foi escrito por: "+this.autor
		+". E foi publicado no ano:"+this.anoPublicacao;
	}
}
