package atividade;
 
public class conteudo {
 
	private String titulo;
	private String categoria;
	
	public conteudo(String categoria, String titulo) {
		this.titulo = titulo;
		this.categoria = categoria;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getCategoria() {
		return this.categoria;
	}
	
	public void descricao() {
		System.out.println("o titulo do filme/série é: "+this.getTitulo());
		System.out.println("A categoria da filme/série é: "+this.getCategoria());
	}
}
