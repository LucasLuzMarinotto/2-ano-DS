package atividade;

public class filme extends conteudo {
	
	private String duracao;
	private int ano;
	
	public filme(String duracao, String categoria, String titulo, int ano) {
		super(categoria, titulo);
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
		System.out.println("a duração do filme é: "+this.duracao);
		System.out.println("o ano de lançamento do filme é: "+this.ano);
	}
}
