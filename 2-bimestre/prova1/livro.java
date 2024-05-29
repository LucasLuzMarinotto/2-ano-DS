package questao1;

public class livro extends publicacao{
	
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private int numeroPaginas;
	private String editora;
	
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getEditora() {
		return this.editora;
	}
	public int getNumeroPaginas() {
		return this.numeroPaginas;
	}
	public String exibirDetalhes(boolean decisao) {
		return "Este é o livro: "+this.titulo
		+". Que foi escrito por: "+this.autor
		+". Foi publicado no ano:"+this.anoPublicacao
		+". Possui o número de paginas sendo: "+this.numeroPaginas
		+". E foi editado pela: "+this.editora;
	}
	
	@Override
	
	public String exibirDetalhes() {
		return "Este é o livro: "+this.titulo
		+". Que foi escrito por: "+this.autor
		+". Foi publicado no ano:"+this.anoPublicacao
		+". Possui o número de paginas sendo: "+this.numeroPaginas;
	}
}
