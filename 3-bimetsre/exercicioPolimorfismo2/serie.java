package atividade;

public class serie extends conteudo {
	
	private String duracao;
	private int quantEps;
	private int quantTemps;
	private int ano;

	
	public serie(String duracao, String categoria, String titulo, int quantEps, int quantTemps, int ano) {
		super(categoria, titulo);
		this.duracao = duracao;
		this.quantEps = quantEps;
		this.ano = ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	public void setQuantEps(int quantEps) {
		this.quantEps = quantEps;
	}
	
	public void setQuantTemps(int quantTemps) {
		this.quantTemps = quantTemps;
	}
	
	public String getDuracao() {
		return this.duracao;
	}
	
	public int getQuantEps() {
		return this.quantEps;
	}
	
	public int getQuantTemps() {
		return this.quantTemps;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	@Override
	public void descricao() {
		
		System.out.println("a duracao da série é: "+this.duracao);
		System.out.println("a quantidades de episódios é: "+this.quantEps);
		System.out.println("a quantida de temporadas é: "+this.quantTemps);
		
	}
}


	
	
