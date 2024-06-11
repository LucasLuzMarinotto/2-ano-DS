package exercicio1;

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
	
	public void calcularTempoTotal(int partidas){
		tempoTotal = this.tempoPartida * partidas;
	}
}
