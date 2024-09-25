package atividade;
 
public class filme extends conteudo {
	
	private String duracao;
	private int ano;
	
	public filme(String titulo, String categoria, String duracao, int ano) {
		super(titulo, categoria);
		this.duracao = duracao;
		this.ano = ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	public String getDuracao() {
		return this.duracao;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	@Override
	public void descricao() {
		
		System.out.println("o titulo do filme é: "+this.getTitulo());
		System.out.println("A categoria da filme é: "+this.getCategoria());
		System.out.println("a duracao do filme é: "+this.getDuracao());
		System.out.println("seu filme foi lançado em: "+this.getAno());
	}
}
