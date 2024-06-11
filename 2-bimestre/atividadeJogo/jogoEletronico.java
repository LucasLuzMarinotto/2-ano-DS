package exercicio1;

public class jogoEletronico extends jogo{
	
	private String plataforma;
	private String genero;
	
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getPlataforma() {
		return this.plataforma;
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	public String jogarOnline(int quantJogadores) {
		return "Você está jogando online com "+quantJogadores+" jogadores";
	}
}
