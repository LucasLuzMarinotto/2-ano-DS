package exercicio1;

public class carro extends veiculo{
	private double ipva;
	private double valorTabela;
	
	@Override
	public void calculaIPVA() {
		this.ipva = this.valorTabela * 0.4;
	}
}
