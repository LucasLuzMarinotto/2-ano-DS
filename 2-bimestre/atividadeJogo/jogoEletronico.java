package exercico;

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
	
	@Override
	public String exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Plataforma: "+plataforma);
		System.out.println("Gênero: "+genero);
		return"";
	}
}
