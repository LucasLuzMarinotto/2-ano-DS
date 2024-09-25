package atividade;
 
public class serie extends conteudo {
	
	private String duracao;
	private int quantEps;
	private int quantTemps;
	private int ano;
 
	
	public serie(String titulo, String categoria, String duracao, int quantEps, int quantTemps, int ano) {
		super(titulo, categoria);
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
		
		System.out.println("o titulo da série é: "+this.getTitulo());
		System.out.println("A categoria da série é: "+this.getCategoria());
		System.out.println("a duracao da série é: "+this.getDuracao());
		System.out.println("a quantidade de episodios da sua serie é: "+this.getQuantEps());
		System.out.println("a quantidade de temporadas da sua serie é: "+this.getQuantTemps());
		System.out.println("sua serie foi lançadoa em: "+this.getAno());
		
	}
}
