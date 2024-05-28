package questao1;

public class revista extends publicacao{
	
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private int numeroEdicao;
	private String mesPublicacao;
	
	public void setNumeroEdicao(int numeroEdicao) {
		this.numeroEdicao = numeroEdicao;
	}
	public void setMesPublicacao(String mesPublicacao) {
		this.mesPublicacao = mesPublicacao;
	}
	public String getMesPublicacao() {
		return this.mesPublicacao;
	}
	public int getNumeroEdicao() {
		return this.numeroEdicao;
	}
	public String exibirDetalhes() {
		return "Este é o livro: "+this.titulo
		+". Que foi escrito por: "+this.autor
		+". Foi publicado no ano:"+this.anoPublicacao
		+". Numero de edição: "+this.numeroEdicao;
	}
	public String exibirDetalhes(boolean decisao) {
		return "Este é o livro: "+this.titulo
		+". Que foi escrito por: "+this.autor
		+". E foi publicado no ano:"+this.anoPublicacao
		+". Numero de edição: "+this.numeroEdicao
		+". Publicado no mês: "+this.mesPublicacao;
	}
}
