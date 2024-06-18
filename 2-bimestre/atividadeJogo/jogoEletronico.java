package exercico;

public class jogoFisico extends jogo{
	private int quantJogadores;
	private int tempoPartida;
	private int tempoTotal;
	
	public void setQuantJogadores(int quantJogadores) {
		this.quantJogadores = quantJogadores;
	}
	
	public void setTempoPartida(int tempoPartida) {
		this.tempoPartida = tempoPartida;
	}
	
	public int getQuantJogadores() {
		return this.quantJogadores;
	}
	
	public int getTempoPartida() {
		return this.tempoPartida;
	}
	
	public int getTempoTotal() {
		return this.tempoTotal;
	}
	
	public void calcularTempoTotal(int partidas){
		tempoTotal = this.tempoPartida * partidas;
	}
	
	@Override
	public String exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Quantidade de Jogadores: "+quantJogadores);
		System.out.println("Tempo de Partida: "+tempoPartida);
		return"";
	}
}
