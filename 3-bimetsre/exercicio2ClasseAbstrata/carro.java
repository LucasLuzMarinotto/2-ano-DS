package exercicio2;

public class carro extends veiculo{
	public carro(String modelo, double valorTabela, String cor, String combustivel) {
		super(veiculo());
	}

	private double ipva;
	private double valorTabela;
	
	@Override
	public void calculaIPVA() {
		this.ipva = this.valorTabela * 0.4;
	}
}